package com.nbaHallOfHate.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class PlayerEntity {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "status")
    private String status = "Active";


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerEntity() {}

    public PlayerEntity(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
