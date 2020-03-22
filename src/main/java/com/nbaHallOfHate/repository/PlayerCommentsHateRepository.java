package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCommentsHateRepository extends CrudRepository<PlayerCommentsHateEntity, Long> {
    @Query("from PlayerCommentsHateEntity where player_id = :id")
    Iterable<PlayerCommentsHateEntity> findAllHateCommentByPlayerId(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM public.player_comment_hate WHERE player_id = :id")
    Long getCountOfHateCommentByPlayerId(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT * FROM public.player_comment_hate WHERE player_id = :id LIMIT :limit")
    Iterable<PlayerCommentsHateEntity> getAllHateCommentByPlayerIdWithLimit(@Param("id") Long id, @Param("limit") int limit);
}