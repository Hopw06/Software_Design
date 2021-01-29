package com.company.final_.final_project.query_model.key;

import com.company.final_.final_project.query_model.bool.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Should extends Key{
    private MustBool bool;

    public MustBool bool() {
        if (bool == null) {
            bool = new MustBool();
        }
        return bool;
    }

    public Should shouldMatch(String key, Object value) {
        return (Should) match(key, value);
    }

    // provide getter & setter for jackson api.
    public MustBool getBool() {
        return bool;
    }

    public void setBool(MustBool bool) {
        this.bool = bool;
    }
}
