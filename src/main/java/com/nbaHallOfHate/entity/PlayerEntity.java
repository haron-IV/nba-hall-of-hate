package com.nbaHallOfHate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "player_id")
    private int playerId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "jersey_number")
    private int jerseyNumber;

    @Column(name = "height")
    private String height;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "hate_count")
    private Long hateCount;

    @Column(name = "respect_count")
    private Long respectCount;

    @Column(name = "follow_count")
    private int followCount;

    public PlayerEntity() {}

    public PlayerEntity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Long getHateCount() {
        return hateCount;
    }

    public void setHateCount(Long hateCount) {
        this.hateCount = hateCount;
    }

    public Long getRespectCount() {
        return respectCount;
    }

    public void setRespectCount(Long respectCount) {
        this.respectCount = respectCount;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }
}
