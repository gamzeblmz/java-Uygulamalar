package com.kodlama.io.rentacar.webApi.controllers;

import com.kodlama.io.rentacar.business.abstracts.PaymentService;
import com.kodlama.io.rentacar.business.requests.CreatePaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payments")
@AllArgsConstructor
public class PaymanentController {

    private PaymentService paymentService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void pay(@RequestBody CreatePaymentRequest createPaymentRequest) {
        paymentService.pay(createPaymentRequest);
    }
}
