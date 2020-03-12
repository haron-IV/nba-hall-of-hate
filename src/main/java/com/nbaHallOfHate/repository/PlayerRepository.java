package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.dto.PlayerDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository  extends CrudRepository<PlayerDto, Integer> {

}
