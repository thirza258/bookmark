package com.example.mybookmark.FAQ;

public class FAQ {
    private String title;
    private String content;

    public FAQ(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FAQ{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
