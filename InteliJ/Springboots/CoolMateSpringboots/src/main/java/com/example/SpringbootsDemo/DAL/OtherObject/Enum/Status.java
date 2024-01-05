package com.example.CoolMateSpringboots.DAL.OtherObject.Enum;

public enum Status {
    UNKNOW("Không rõ", 0), ACTIVE("Hoạt động", 1), UNACTIVE("Không hoạt động", 2), DELETE("Đã xóa", 3);

    private final String key;
    private final Integer value;

    Status(String key, Integer value) {
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
