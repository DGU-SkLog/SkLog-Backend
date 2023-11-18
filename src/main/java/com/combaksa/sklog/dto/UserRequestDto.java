package com.combaksa.sklog.dto;

import com.combaksa.sklog.domain.RequestHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRequestDto {
    private String request;
    private String content;
    private List<String> userContentList;
    private List<String> aiContentList;

    public RequestHistory toEntity(){
        return RequestHistory.builder()
                .request(request)
                .userContent(content)
                .build();
    }
}