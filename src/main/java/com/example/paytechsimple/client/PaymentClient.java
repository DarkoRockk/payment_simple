package com.example.paytechsimple.client;

import com.example.paytechsimple.dto.PaymentRequestDTO;
import com.example.paytechsimple.dto.PaymentResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "paytechclient",
        url = "https://engine-sandbox.pay.tech/"
)
public interface PaymentClient {

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/payments")
    PaymentResponseDTO createPayment(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody PaymentRequestDTO request);
}
