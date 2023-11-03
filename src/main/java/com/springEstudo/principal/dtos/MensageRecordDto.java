package com.springEstudo.principal.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MensageRecordDto(@NotBlank @NotNull String mensagem) {}
