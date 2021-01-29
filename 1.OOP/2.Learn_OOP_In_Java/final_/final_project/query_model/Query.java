package com.company.final_.final_project.query_model;

import com.company.final_.final_project.query_model.bool.QueryBool;

public class Query {
    private QueryBool bool;

    public QueryBool bool() {
        if (bool == null) {
            bool = new QueryBool();
        }
        return bool;
    }

    // provide getter & setter for jackson api.
    public QueryBool getBool() {
        return bool;
    }

    public void setBool(QueryBool bool) {
        this.bool = bool;
    }
}
