#!/usr/bin/env python
from flask import Flask, jsonify, request, Response
import json

app = Flask(__name__)

PLAIN_DATABASE = "plaindb.db"

@app.route("/v1/login/user", methods=["POST"])
@app.errorhandler(403)
def login():
    username = request.args.get("username", '')
    password = request.args.get("password", '')
    with open(PLAIN_DATABASE, "r+") as db:
        users = json.loads(db.read())["users"]
        if (username in users and password == users[username]["password"]):
            return jsonify(message="Successfully authenticated")
        else:
            raise Exception("Unauthorized")

@app.route("/v1/logout/user", methods=["POST"])
def logout():
    return jsonify(message="Logout")

@app.route("/v1/register/user", methods=["POST"])
def register():
    username = request.args.get("username", '')
    password = request.args.get("password", '')
    email = request.args.get("email", '')
    gender = request.args.get("gender", '')
    db_content = {}
    with open(PLAIN_DATABASE, "r+") as db:
        try:
            db_content = json.loads(db.read())
        except:
            db_content = {}
    with open(PLAIN_DATABASE, "w+") as db:
        if ("users" not in db_content):
            db_content["users"] = {}
        if (username in db_content["users"]):
            raise Exception("User  already exists!")
        db_content["users"][username] = {}
        db_content["users"][username]["password"] = password
        db_content["users"][username]["email"] = email
        db_content["users"][username]["gender"] = gender
        db.write(json.dumps(db_content))
    return jsonify(message="User registered successfully")

@app.route("/v1/position", methods=["GET", "POST"])
def position():
    if (request.method == "GET"):
        persons = []
        longitude = request.args.get("longitude", '')
        latitude = request.args.get("latitude", '')
        with open(PLAIN_DATABASE, "r+") as db:
            users = json.loads(db.read())["users"]
            for user in users:
                user_dict = users[user]
                if ("longitude" in user_dict and "latitude" in user_dict):
                    if (user["longitude"] > longitude + 0.05 and user["latitude"] > latitude + 0.05 and
                        user["longitude"] < longitude - 0.05 and user["latitude"] < latitude - 0.05):
                        persons.append(user_dict)
            return jsonify(persons)
    if (request.method == "POST"):
        longitude = request.args.get("longitude", '')
        latitude = request.args.get("latitude", '')
        username = request.args.get("username", '')
        db_content = {}
        with open(PLAIN_DATABASE, "r+") as db:
            db_content = json.loads(db.read())
        with open(PLAIN_DATABASE, "w+") as db:
            if (username not in db_content["users"]):
                raise Exception("There is not user named: %s" % username)
            db_content["users"][username]["longitude"] = longitude
            db_content["users"][username]["latitude"] = latitude
            db.write(json.dumps(db_content))
        return jsonify(message="Position updated successfully!")

@app.route("/v1/message", methods=["GET", "POST"])
def message():
    if (request.method == "GET"):
        persons = []
        username = request.args.get("username", '')
        latitude = request.args.get("latitude", '')
        with open(PLAIN_DATABASE, "r+") as db:
            messages = json.loads(db.read())["messages"]
            mymessages = messages[username]
            frommemessages = {}
            for frm in messages:
                if (username in messages[frm]):
                    frommemessages[frm] = {}
                    frommemessages[frm][username] = messages[frm][username]
            mymessages.update(frommemessages)
            return jsonify(mymessages)
    if (request.method == "POST"):
        frm = request.args.get("from", '')
        to = request.args.get("to", '')
        message = request.args.get("message", '')
        db_content = {}
        with open(PLAIN_DATABASE, "r+") as db:
            db_content = json.loads(db.read())
        with open(PLAIN_DATABASE, "w+") as db:
            if ("messages" not in db_content):
                db_content["messages"] = {}
            if (frm not in db_content["messages"]):
                db_content["messages"][frm] = {}
            if (to not in db_content["messages"]):
                db_content["messages"][to] = {}
            if (frm not in db_content["messages"][to]):
                db_content["messages"][to][frm] = []
            if (to not in db_content["messages"][frm]):
                db_content["messages"][to][frm] = []
            db_content["messages"][frm][to].append(message)
            db_content["messages"][to][frm].append(message)
            db.write(json.dumps(db_content))
        return jsonify(message="Successfully sent message!")

if __name__ == '__main__':
    app.run(debug=True, host="0.0.0.0", port=5000)
