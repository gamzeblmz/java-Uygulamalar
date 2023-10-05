package com.kodlama.io.rentacar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBankRequest {
    @NotNull
    @NotBlank
    private String cardNo;
    @NotNull
    @NotBlank
    private String cardName;


}
