package com.example.CoolMateSpringboots.DAL.OtherObject.Enum;

public enum EmployeeStatus {
    UNKNOW("Không rõ", 0), WORK("Đang làm việc", 1), OFF("Nghỉ phép", 2), QUIT("Nghỉ việc", 3), RETIRE("Nghỉ hưu", 4), MATERNITY("Nghỉ thai sản", 5);
    private final String key;
    private final Integer value;

    EmployeeStatus(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
