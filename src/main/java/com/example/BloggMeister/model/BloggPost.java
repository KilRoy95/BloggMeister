package com.example.BloggMeister.model;

import lombok.Data;

@Data
public class BloggPost {

    private String title;
    private String content;
    private String author;
    private String date;

    public BloggPost(String title, String content, String author, String date) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }
}
