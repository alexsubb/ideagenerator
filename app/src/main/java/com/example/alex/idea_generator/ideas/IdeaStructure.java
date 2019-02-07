package com.example.alex.idea_generator.ideas;

public class IdeaStructure {

    private int id;
    private String title;
    private String subtitle;

    public IdeaStructure(int id, String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;

    }
}
