package com.frc4456.scouting.frontend.scouting_android.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        /*
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
        addItem(createDummyItem("0-999"));
        addItem(createDummyItem("1000-1999"));
        addItem(createDummyItem("2000-2999"));
        addItem(createDummyItem("3000-3999"));
        addItem(createDummyItem("4000-4999"));
        addItem(createDummyItem("5000-5999"));
        addItem(createDummyItem("6000-6999"));
        addItem(createDummyItem("7000-7999"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Teams " + position, makeDetails(position));
    }
    private static DummyItem createDummyItem(String position) {
        return new DummyItem(String.valueOf(position), "Teams " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    private static String makeDetails(String position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
