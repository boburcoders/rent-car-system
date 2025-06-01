package com.company.rentaCar.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HttpApiResponse<T> {
    private boolean success;
    private int responseCode;
    private HttpStatus status;
    private String message;
    private T content;
    private ErrorDto error;

}
