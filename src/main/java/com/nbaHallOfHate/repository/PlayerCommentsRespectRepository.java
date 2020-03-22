package com.nbaHallOfHate.repository;

import com.nbaHallOfHate.entity.PlayerCommentsRespectEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCommentsRespectRepository extends CrudRepository<PlayerCommentsRespectEntity, Long>{
    @Query("from PlayerCommentsRespectEntity where player_id = :id")
    Iterable<PlayerCommentsRespectEntity> findAllRespectCommentByPlayerId(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM public.player_comment_respect WHERE player_id = :id")
    Long getCountOfRespectCommentByPlayerId(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT * FROM public.player_comment_respect WHERE player_id = :id LIMIT :limit")
    Iterable<PlayerCommentsRespectEntity> getAllRespectCommentByPlayerIdWithLimit(@Param("id") Long id, @Param("limit") int limit);
}