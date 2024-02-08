package com.ktds.krollingpaper.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // 모든 필드의 Getter 메서드를 자동으로 생성
@Setter // 모든 필드의 Setter 메서드를 자동으로 생성
@ToString // toString 메서드를 자동으로 생성
public class PaperDTO {
    private Long paperId;
    private String paperTitle;
    private String paperPw;
}
