package com.example.paytechsimple.service;

import com.example.paytechsimple.client.PaymentClient;
import com.example.paytechsimple.dto.CardDTO;
import com.example.paytechsimple.dto.PaymentRequestDTO;
import com.example.paytechsimple.dto.PaymentResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentProviderService {

    private final PaymentClient paymentClient;
    private final String AUTH_TOKEN = "Bearer cAmmvalAikARkB81fgxgMtnMbEdNbuWa";

    public PaymentResponseDTO processPayment(PaymentRequestDTO request) {
        request.setCard(CardDTO.builder()
                .cardNumber("4000 0000 0000 0002")
                .cardHolderName("John Smith")
                .cardSecurityCode("010")
                .expiryMonth("01")
                .expiryYear("2030")
                .build());
        try {
            return paymentClient.createPayment(AUTH_TOKEN, request);
        } catch (Exception e) {
            System.out.println(e);
            return new PaymentResponseDTO();
        }

    }
}
