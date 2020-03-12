package com.nbaHallOfHate.dto;

public class PlayerDto {
    private String status = "Active";

    public PlayerDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
