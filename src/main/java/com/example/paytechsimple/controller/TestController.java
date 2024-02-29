package com.example.paytechsimple.controller;

import com.example.paytechsimple.dto.PaymentRequestDTO;
import com.example.paytechsimple.service.PaymentProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final PaymentProviderService paymentProviderService;
    @GetMapping("/")
    public String showPaymentFrom(Model model) {
        PaymentRequestDTO paymentForm = new PaymentRequestDTO();
        model.addAttribute("paymentForm", paymentForm);
        return "index";
    }

    @PostMapping("/payment/process")
    public ModelAndView processPayment(@ModelAttribute("paymentForm") PaymentRequestDTO request) {
        var result = paymentProviderService.processPayment(request);
        if (result.getStatus() == 200) {
            return new ModelAndView("redirect:" + result.getResult().getRedirectUrl());
        }
        return new ModelAndView("redirect:/error");
    }
}
