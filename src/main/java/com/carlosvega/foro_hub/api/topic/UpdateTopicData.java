package com.carlosvega.foro_hub.api.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateTopicData(
        @NotNull
        Long id_usuario,
        String mensaje,
        String nombreCurso,
        String titulo,
        String autor
) {
}
