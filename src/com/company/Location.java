package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

<<<<<<< HEAD
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

=======
    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
<<<<<<< HEAD
        this.exits.put("Q", 0);
=======
>>>>>>> 6d4d8ecd26338b5bef3ba751627fdbd8b659e216
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
>>>>>>> 413661606a6f992fe98ada928df3f63f3b942d7d
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
