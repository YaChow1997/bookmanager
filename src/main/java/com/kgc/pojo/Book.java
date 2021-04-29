package com.kgc.pojo;

/**
 * @author YaChow
 * @create 2021-03-08-9:01
 */
public class Book {
    private Integer book_id;
    private String book_code;
    private String book_name;
    private Integer book_type;
    private String book_author;
    private String publish_press;
    private String publish_date;
    private String is_borrow;
    private Integer createdBy;
    private String creation_time;
    private String last_updatetime;

    public Book() {
    }

    public Book(Integer book_id, String book_code, String book_name, Integer book_type, String book_author, String publish_press, String publish_date, String is_borrow, Integer createdBy, String creation_time, String last_updatetime) {
        this.book_id = book_id;
        this.book_code = book_code;
        this.book_name = book_name;
        this.book_type = book_type;
        this.book_author = book_author;
        this.publish_press = publish_press;
        this.publish_date = publish_date;
        this.is_borrow = is_borrow;
        this.createdBy = createdBy;
        this.creation_time = creation_time;
        this.last_updatetime = last_updatetime;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Integer getBook_type() {
        return book_type;
    }

    public void setBook_type(Integer book_type) {
        this.book_type = book_type;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getPublish_press() {
        return publish_press;
    }

    public void setPublish_press(String publish_press) {
        this.publish_press = publish_press;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getIs_borrow() {
        return is_borrow;
    }

    public void setIs_borrow(String is_borrow) {
        this.is_borrow = is_borrow;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    public String getLast_updatetime() {
        return last_updatetime;
    }

    public void setLast_updatetime(String last_updatetime) {
        this.last_updatetime = last_updatetime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_code='" + book_code + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_type=" + book_type +
                ", book_author='" + book_author + '\'' +
                ", publish_press='" + publish_press + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", is_borrow='" + is_borrow + '\'' +
                ", createdBy=" + createdBy +
                ", creation_time='" + creation_time + '\'' +
                ", last_updatetime='" + last_updatetime + '\'' +
                '}';
    }
}
