package com.example.mybookmark.FAQ;

public class FAQ {
    private String title;
    private int content;

    public FAQ(String title, int content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FAQ{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
}
