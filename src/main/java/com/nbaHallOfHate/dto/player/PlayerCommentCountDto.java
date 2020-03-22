package com.nbaHallOfHate.dto.player;

public class PlayerCommentCountDto {

    public static Long hateCount;
    public static Long respectCount;

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
}
