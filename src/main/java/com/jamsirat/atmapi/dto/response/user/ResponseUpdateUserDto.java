package com.jamsirat.atmapi.dto.response.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseUpdateUserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
