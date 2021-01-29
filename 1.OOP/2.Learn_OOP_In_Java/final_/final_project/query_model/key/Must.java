package com.company.final_.final_project.query_model.key;

import com.company.final_.final_project.query_model.bool.ShouldBool;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Must extends Key{
    private ShouldBool bool = null;

    public ShouldBool bool() {
        if (bool == null) {
            bool = new ShouldBool();
        }
        return bool;
    }

    public Must mustMatch(String key, Object value) {
        return (Must) match(key, value);
    }

    // provide getter & setter for jackson api.

    public ShouldBool getBool() {
        return bool;
    }

    public void setBool(ShouldBool bool) {
        this.bool = bool;
    }
}
