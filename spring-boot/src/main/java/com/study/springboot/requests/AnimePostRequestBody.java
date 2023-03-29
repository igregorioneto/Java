package com.study.springboot.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AnimePostRequestBody {

    @NotEmpty(message = "The anime name  cannot  be empty")
    private String name;
}
