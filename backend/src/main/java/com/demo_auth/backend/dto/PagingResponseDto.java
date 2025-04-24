package com.demo_auth.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagingResponseDto {

    private Integer currentPage;

    private Integer totalPage;

    private Integer size;
}
