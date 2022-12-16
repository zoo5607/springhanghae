package com.sparta.springhanghae.repository;

import com.sparta.springhanghae.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc(); // 수정시간 기준을 내림차순 정렬하여 모든 데이터 조회
}
