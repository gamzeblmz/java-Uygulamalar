package com.etiya.kodlamaio.business.concretes;

import com.etiya.kodlamaio.business.abstracts.LanguageService;
import com.etiya.kodlamaio.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaio.business.requests.UpdateLanguageRequest;
import com.etiya.kodlamaio.business.responses.GetAllLanguageResponse;
import com.etiya.kodlamaio.business.responses.GetByIdLanguageResponse;
import com.etiya.kodlamaio.core.utilities.mappers.ModelMapperService;
import com.etiya.kodlamaio.dataAccess.abstracts.LanguageRepository;
import com.etiya.kodlamaio.entities.concretes.Language;
import lombok.AllArgsConstructor;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest()
                .map(createLanguageRequest, Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = this.languageRepository.findAll();
        List<GetAllLanguageResponse> getAllLanguageResponses = languages.stream().map(language -> this.modelMapperService
                .forResponse().map(language, GetAllLanguageResponse.class)).collect(Collectors.toList());
        return getAllLanguageResponses;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Language language = this.languageRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse getByIdLanguageResponse = this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
        return getByIdLanguageResponse;
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        Language language = this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.deleteById(id);
    }
}
