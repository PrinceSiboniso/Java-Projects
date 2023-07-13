package com.eniviro.Assesment.grad001.prince.ntimeni.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private String surname;
    private String imageformat;
    private String imagedata;


    public User(Integer id, String name, String surname, String imageformat, String imagedata) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.imageformat = imageformat;
        this.imagedata = imagedata;
    }
     public User(){

     }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", imageformat='" + imageformat + '\'' +
                ", imagedata='" + imagedata + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImageformat() {
        return imageformat;
    }

    public void setImageformat(String imageformat) {
        this.imageformat = imageformat;
    }

    public String getImagedata() {
        return imagedata;
    }

    public void setImagedata(String imagedata) {
        this.imagedata = imagedata;
    }
}
