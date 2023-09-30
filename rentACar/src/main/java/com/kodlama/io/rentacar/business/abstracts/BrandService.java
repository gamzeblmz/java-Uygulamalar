package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.responses.GetAllBrandsResponse;


import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

}
