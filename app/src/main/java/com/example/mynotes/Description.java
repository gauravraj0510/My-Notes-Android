package com.example.mynotes;

public class Description {
    private String userId;
    private String desc;

    public Description() {
    }

    public Description(String userId, String desc) {
        this.userId = userId;
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Description{" +
                "userId='" + userId + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
