package com.example.paytechsimple.dto;

import lombok.Data;

@Data
public class PaymentResponseDTO {
    private Integer status = 500;
    private PaymentResultDTO result;
}
