package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.requests.CreateBankRequest;

public interface BankService {
    boolean cardPaymanent(CreateBankRequest createBankRequest);
}
