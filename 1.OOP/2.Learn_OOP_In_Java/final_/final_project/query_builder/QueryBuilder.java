package com.company.final_.final_project.query_builder;

import com.company.final_.final_project.query_model.Query;
import com.company.final_.final_project.query_model.bool.QueryBool;

public class QueryBuilder {
    private Query query;

    public QueryBool bool() {
        if (query == null) {
            query = new Query();
        }
        return query.bool();
    }

    // provide getter & setter for jackson api.
    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
