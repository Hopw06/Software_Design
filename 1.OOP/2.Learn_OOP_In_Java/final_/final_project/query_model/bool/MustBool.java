package com.company.final_.final_project.query_model.bool;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.company.final_.final_project.query_model.key.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MustBool {
    private Must must;

    public Must mustMatch(String key, Object value) {
        if (must == null) {
            must = new Must();
        }
        must.mustMatch(key, value);
        return must;
    }

    // provide setter & getter for jackson api
    public Must getMust() {
        return must;
    }

    public void setMust(Must must) {
        this.must = must;
    }
}
