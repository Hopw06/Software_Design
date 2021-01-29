package com.company.final_.final_project_v1.bool;

import com.company.final_.final_project_v1.query.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryBool implements IBool{
    private Should should;
    private Must must;

    @Override
    public Should shouldMatch(String key, Object value) {
        if (should == null) {
            should = new Should();
        }
        should.shouldMatch(key, value);
        return should;
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
    public Should getShould() {
        return should;
    }

    public void setShould(Should should) {
        this.should = should;
    }

    public Must getMust() {
        return must;
    }

    public void setMust(Must must) {
        this.must = must;
    }
}
