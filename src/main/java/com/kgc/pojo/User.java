package com.kgc.pojo;

/**
 * @author YaChow
 * @create 2021-03-08-9:27
 */
public class User {
    private Integer user_id;
    private String user_code;
    private String password;
    private String email;
    private String gender;
    private String register_time;
    private String last_logintime;

    public User() {
    }

    public User(Integer user_id, String user_code, String password, String email, String gender, String register_time, String last_logintime) {
        this.user_id = user_id;
        this.user_code = user_code;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.register_time = register_time;
        this.last_logintime = last_logintime;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getLast_logintime() {
        return last_logintime;
    }

    public void setLast_logintime(String last_logintime) {
        this.last_logintime = last_logintime;
    }
}
