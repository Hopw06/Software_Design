package com.company.final_.final_project_v1.query;

import com.company.final_.final_project_v1.bool.IBool;
import com.company.final_.final_project_v1.bool.factory.BoolFactory;
import com.company.final_.final_project_v1.bool.factory.BoolType;

public class Query {
    private IBool bool = BoolFactory.getBool(BoolType.QUERY);

    public IBool bool() {
        return bool;
    }

    // provide getter & setter for jackson api.
    public IBool getBool() {
        return bool;
    }

    public void setBool(IBool bool) {
        this.bool = bool;
    }
}
