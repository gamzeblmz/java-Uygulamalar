package com.kodlama.io.rentacar;

import com.kodlama.io.rentacar.core.utilities.exception.BusinessException;
import com.kodlama.io.rentacar.core.utilities.exception.ProblemDetails;
import com.kodlama.io.rentacar.core.utilities.exception.ValidationProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;

@SpringBootApplication
@RestControllerAdvice
@CrossOrigin(origins = "http://localhost:4200")
public class RentACarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }

    //hata bilgilerinin hepsini kullanıcıya dönmemek amacıyla kullanılır
    @ExceptionHandler
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setMessage(businessException.getMessage());
        return problemDetails;
    }

    @ExceptionHandler
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException) {
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setMessage("VALIDATION.EXCEPTION");
        validationProblemDetails.setValidationError(new HashMap<String, String>());

        for (FieldError fieldError: methodArgumentNotValidException.getBindingResult().getFieldErrors()){
            validationProblemDetails.getValidationError().put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        return validationProblemDetails;
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("")
                        .allowCredentials(true);
            }
        };
    }

}
