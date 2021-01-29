package com.company.final_.final_project_v1.query;

import com.company.final_.final_project_v1.bool.IBool;
import com.company.final_.final_project_v1.bool.factory.BoolFactory;
import com.company.final_.final_project_v1.bool.factory.BoolType;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Should {
    private IBool bool;
    private ArrayList<Map.Entry<String, Object>> matches = new ArrayList<>();

    public Should shouldMatch(String key, Object value) {
        matches.add(new AbstractMap.SimpleEntry<>(key, value));
        return this;
    }

    public IBool bool() {
        if (bool == null) {
            bool = BoolFactory.getBool(BoolType.MUST);
        }
        return bool;
    }

    // provide getter & setter for jackson api.
    public ArrayList<Map.Entry<String, Object>> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Map.Entry<String, Object>> matches) {
        this.matches = matches;
    }

    public IBool getBool() {
        return bool;
    }

    public void setBool(IBool bool) {
        this.bool = bool;
    }
}
