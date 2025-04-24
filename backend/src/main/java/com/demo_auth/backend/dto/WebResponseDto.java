package com.demo_auth.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebResponseDto<T,E> {

    private T data;

    private E errors;

    private PagingResponseDto paging;
}
