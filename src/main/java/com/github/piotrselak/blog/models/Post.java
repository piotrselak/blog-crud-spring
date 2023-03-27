package com.github.piotrselak.blog.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String title;
    private String tags;
    private String content;
    private String author;
    private String date;
    private String image;

    public Post(String id, String title, String tags, String content, String author, String date, String image) {
        super();
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.content = content;
        this.author = author;
        this.date = date;
        this.image = image;
    }
}
