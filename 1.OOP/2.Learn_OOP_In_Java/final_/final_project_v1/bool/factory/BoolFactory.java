package com.company.final_.final_project_v1.bool.factory;

import com.company.final_.final_project_v1.bool.IBool;

public class BoolFactory {

    public static IBool getBool(BoolType boolType) {
        return boolType.getBool();
    }
}
