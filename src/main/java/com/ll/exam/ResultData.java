package com.ll.exam;

import lombok.AllArgsConstructor;
import lombok.Data;

    @Data// @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정
    @AllArgsConstructor
    public class ResultData<T> {
        private String resultCode;
        private final String msg;
        private T data;
    }
