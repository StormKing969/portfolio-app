package com.example.portfolioapp.cv;

public class CVItem {
    private String title;
    private String duration;
    private String description;

    public CVItem(String title, String duration, String description) {
        this.title = title;
        this.duration = duration;
        this.description = description;
    }

    public CVItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
