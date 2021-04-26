package net.javaguides.login.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String rollno;
    private String password;

    public String getRollno() {
        return rollno;
    }

    public void setUname(String uname) {
        this.rollno = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}