package com.tw.infrastructure.model;

import java.io.Serializable;

public class Comment implements Serializable {
    private static final long serialVersionUID = -3740000555720380381L;
    private String author;
    private String content;

    private Comment() {
    }

    public static class CommentBuilder {

        private final Comment comment;

        public CommentBuilder() {
            this.comment = new Comment();
        }

        public CommentBuilder withAuthor(String authorName) {
            this.comment.setAuthor(authorName);
            return this;
        }

        public CommentBuilder withContent(String content) {
            this.comment.setContent(content);
            return this;
        }

        public Comment build() {
            return this.comment;
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
