package com.sparta.springhanghae.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본생성자 대신 생성
@Getter // Lombok이 getter 자동 생성
@Entity // 테이블과 연계되는 클래스임을 스프링에게 알려줌
public class Memo extends Timestamped { // 생성, 수정 시간을 자동으로 생성하도록 상속받음
    @GeneratedValue(strategy = GenerationType.AUTO) // ID 생성시 자동으로 증가
    @Id // ID 값, PK로 사용하겠다는 의미
    private Long id;

    @Column(nullable = false) // 컴럼 값이 null이 아니고 반드시 값이 존재해야 함을 나타냄
    private String username;

    @Column(unique = false)
    private String contents;

    public Memo(String username, String contents) {
        this.username = username;
        this.contents = contents;
    }

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
