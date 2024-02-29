package com.example.paytechsimple.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardDTO {
    private String cardNumber;
    private String cardHolderName;
    private String cardSecurityCode;
    private String expiryMonth;
    private String expiryYear;
}
