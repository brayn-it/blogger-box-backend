package com.dauphine.blogger.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

    @Id
    @Column(name="name")
    private UUID id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="createdDate")
    private LocalDateTime createdDate;

    @ManyToOne //Multiplicite
    @JoinColumn(name="category_id") //Cle etrangere
    private Category category;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
