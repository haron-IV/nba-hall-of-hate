package com.nbaHallOfHate.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "player_comment_hate")
public class PlayerCommentsHateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    @NotNull
    private Long commentId;

    @Column(name = "playerId")
    private Long playerId;

    @Column(name = "author")
    private String author;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "content")
    private String content;

    @Column(name = "comment_like")
    private int commentLike;

    @Column(name = "comment_dislike")
    private int commentDislike;

    public PlayerCommentsHateEntity() {}

    public Long getCommentId() {
        return commentId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(int commentLike) {
        this.commentLike = commentLike;
    }

    public int getCommentDislike() {
        return commentDislike;
    }

    public void setCommentDislike(int commentDislike) {
        this.commentDislike = commentDislike;
    }
}