package com.example.board.repository;

import com.example.board.domain.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
}
