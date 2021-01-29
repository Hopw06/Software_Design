package com.company.final_.final_project.query_model.key;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

public class Key {
    private ArrayList<Map.Entry<String, Object>> matches = new ArrayList<>();

    public Key match(String name, Object value) {
        matches.add(new AbstractMap.SimpleEntry<>(name, value));
        return this;
    }

    // provide getter & setter for jackson api.
    public ArrayList<Map.Entry<String, Object>> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Map.Entry<String, Object>> matches) {
        this.matches = matches;
    }
}
