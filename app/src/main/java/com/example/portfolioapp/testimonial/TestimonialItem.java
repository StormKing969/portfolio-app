package com.example.portfolioapp.testimonial;

public class TestimonialItem {

    private String name;
    private String desc;
    private int img;

    public TestimonialItem(String name, String desc, int img) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public TestimonialItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
