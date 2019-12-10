package com.mamata.recyclerview;

public class Contacts {
    private String contactname;
    private String contactphone;
    private int imgid;

    public Contacts(String contactname, String contactphone, int imgid) {
        this.contactname = contactname;
        this.contactphone = contactphone;
        this.imgid = imgid;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
