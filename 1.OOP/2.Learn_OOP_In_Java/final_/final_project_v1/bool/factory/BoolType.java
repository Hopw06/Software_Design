package com.company.final_.final_project_v1.bool.factory;

import com.company.final_.final_project_v1.bool.IBool;
import com.company.final_.final_project_v1.bool.MustBool;
import com.company.final_.final_project_v1.bool.QueryBool;
import com.company.final_.final_project_v1.bool.ShouldBool;

public enum BoolType {
    QUERY {
        @Override
        IBool getBool() {
            return new QueryBool();
        }
    },
    SHOULD {
        @Override
        IBool getBool() {
            return new ShouldBool();
        }
    },
    MUST {
        @Override
        IBool getBool() {
            return new MustBool();
        }
    };

    abstract IBool getBool();
}
