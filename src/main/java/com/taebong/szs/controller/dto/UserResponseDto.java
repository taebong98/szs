package com.taebong.szs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private String userId;
    private String name;
    private String password;
    private String regNo;
    private String taxAmount;
    private List<DeductResponseDto> deductionList;
}
