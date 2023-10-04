package com.kodlama.io.rentacar.business.concretes;

import com.kodlama.io.rentacar.business.abstracts.BankService;
import com.kodlama.io.rentacar.business.requests.CreateBankRequest;
import org.springframework.stereotype.Service;

@Service
public class BankManager implements BankService {
    @Override
    public boolean cardPaymanent(CreateBankRequest createBankRequest) {
        return true;
    }
}
