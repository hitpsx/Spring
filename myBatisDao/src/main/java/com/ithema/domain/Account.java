package com.ithema.domain;

public class Account {
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int userID;
    private String userName;

    @Override
    public String toString() {
        return "domain{" +
                "id=" + userID +
                ", name='" + userName + '\'' +
                '}';
    }
}
