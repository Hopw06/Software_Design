package com.company.final_.final_project_v1.bool;

import com.company.final_.final_project_v1.query.Must;
import com.company.final_.final_project_v1.query.Should;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MustBool implements IBool{
    private Must must;

    @Override
    public Should shouldMatch(String key, Object value) {
        throw new UnsupportedOperationException("MustBool has no method shouldMatch!");
    }

    @Override
    public Must mustMatch(String key, Object value) {
        if (must == null) {
            must = new Must();
        }
        must.mustMatch(key, value);
        return must;
    }

    // provide getter & setter for jackson api.
    public Must getMust() {
        return must;
    }

    public void setMust(Must must) {
        this.must = must;
    }
}
