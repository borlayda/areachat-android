package hu.bme.aut.cykkop.moblab.areachat.view.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PersonData {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<PersonItem> ITEMS = new ArrayList<PersonItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, PersonItem> ITEM_MAP = new HashMap<String, PersonItem>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(PersonItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    private static PersonItem createDummyItem(int position) {
        return new PersonItem("Paul", new Integer(position).toString(), "Male");
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class PersonItem {
        public final String name;
        public final String distance;
        public final String gender;

        public PersonItem(String name, String distance, String gender) {
            this.name = name;
            this.distance = distance;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Name: "+ name +" Distance: "+ distance +" Gender: "+ gender;
        }
    }
}
