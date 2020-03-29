package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM public.users WHERE username=:author")
    UserEntity isUsernameExist(@Param("author") String author);
}
