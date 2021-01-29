package com.company.final_.final_project.query_model.bool;

import com.company.final_.final_project.query_model.key.Should;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShouldBool {
    private Should should;

    public Should shouldMatch(String key, Object value) {
        if (should == null) {
            should = new Should();
        }
        should.shouldMatch(key, value);
        return should;
    }

    // provide getter & setter for jackson api.
    public Should getShould() {
        return should;
    }

    public void setShould(Should should) {
        this.should = should;
    }
}
