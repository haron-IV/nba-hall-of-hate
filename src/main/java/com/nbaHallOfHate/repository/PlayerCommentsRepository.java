package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCommentsRepository extends CrudRepository<PlayerEntity, Long> {}
