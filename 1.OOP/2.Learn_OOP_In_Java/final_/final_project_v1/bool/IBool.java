package com.company.final_.final_project_v1.bool;

import com.company.final_.final_project_v1.query.Must;
import com.company.final_.final_project_v1.query.Should;

public interface IBool {

    Should shouldMatch(String key, Object value);
    Must mustMatch(String key, Object value);
}
