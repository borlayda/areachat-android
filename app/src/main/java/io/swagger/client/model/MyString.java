package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ednibor on 5/22/16.
 */
public class MyString {

        @SerializedName("message")
        private String message = null;

        /**
         * Message which has been send
         **/
        @ApiModelProperty(value = "Message which has been send")
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            MyString message = (MyString) o;
            return Objects.equals(message, message.message);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MyString {\n");

            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }

}
