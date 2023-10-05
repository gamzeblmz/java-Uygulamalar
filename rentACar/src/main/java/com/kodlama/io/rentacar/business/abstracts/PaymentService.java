package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreatePaymentRequest;

public interface PaymentService {
    public void pay(CreatePaymentRequest createPaymentRequest);
}
