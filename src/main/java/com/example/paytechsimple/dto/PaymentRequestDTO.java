package com.example.paytechsimple.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class PaymentRequestDTO {
    private String paymentType = "DEPOSIT";
    private BigDecimal amount;
    private String currency;
    private CardDTO card;
    private String paymentMethod = "BASIC_CARD";
}
