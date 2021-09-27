package com.example.mybookmark.extension;

public class Browser {
    private int image;
    private String name;
    private String Version;

    public Browser(int image, String name, String version) {
        this.image = image;
        this.name = name;
        Version = version;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", Version='" + Version + '\'' +
                '}';
    }
}
