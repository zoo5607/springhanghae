package com.sparta.springhanghae.service;

import com.sparta.springhanghae.domain.Memo;
import com.sparta.springhanghae.repository.MemoRepository;
import com.sparta.springhanghae.domain.MemoRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // 꼭 필효한 요소(final) 자동 생성
@Service // 이 클래스가 서비스임을 알려줌
public class MemoService {
    // final은 꼭 필요한 요소임을 명시하는 것, 값이 변경 될 수 없음
    private final MemoRepository memoRepository; // final은 꼭 필요한 요소임을 명시하는 것, 값이 변경 될 수 없음

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌, 자동으로 DB에 업데이트 됨
    public Long update(Long id, MemoRequestDto requestDto) {
        // id로 Memo 객체를 찾음. id에 해당되는 값이 없다면 메시지로알려줌
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto); // 값 업데이트
        return memo.getId();
    }
}
