package com.company.final_.final_project_v1.bool;

import com.company.final_.final_project_v1.query.Must;
import com.company.final_.final_project_v1.query.Should;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShouldBool implements IBool{
    private Should should;

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
        throw new UnsupportedOperationException("ShouldBool has no method mustMatch!");
    }

    // provide getter & setter for jackson api.
    public Should getShould() {
        return should;
    }

    public void setShould(Should should) {
        this.should = should;
    }
}
