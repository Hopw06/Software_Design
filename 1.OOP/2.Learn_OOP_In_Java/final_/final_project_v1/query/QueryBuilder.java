package com.company.final_.final_project_v1.query;

import com.company.final_.final_project_v1.bool.IBool;

public class QueryBuilder {
    private Query query = new Query();

    public IBool bool() {
        return query.getBool();
    }

    // provide getter & setter for jackson api.
    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
