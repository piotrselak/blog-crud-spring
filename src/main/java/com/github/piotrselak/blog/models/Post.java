package com.github.piotrselak.blog.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String tags;
    private String content;
    private String author;
    private LocalDate date;
    private String image;

    public Post() {
    }

    public Post(String id, String title, String tags, String content, String author, LocalDate date, String image) {
        super();
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.content = content;
        this.author = author;
        this.date = date;
        this.image = image;
    }

    public Post(String title, String tags, String content, String author, LocalDate date, String image) {
        super();
        this.title = title;
        this.tags = tags;
        this.content = content;
        this.author = author;
        this.date = date;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", title=" + title +
                ", tags=" + tags + ", content=" + content +
                ", author=" + author + ", date=" + date + ", image=" + image + "]";
    }
}
