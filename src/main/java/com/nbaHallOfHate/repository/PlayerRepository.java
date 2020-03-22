package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.entity.PlayerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository  extends CrudRepository<PlayerEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM public.player LIMIT :limit")
    List<PlayerEntity> findAllPlayers(@Param("limit") int limit);
}
