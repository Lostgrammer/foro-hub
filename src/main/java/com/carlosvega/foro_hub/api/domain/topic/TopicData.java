package com.carlosvega.foro_hub.api.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicData(
//        Integer id_usuario,
//        String id_usuario,
//        String message,
//        String subjectName,
//        String title,
//        String creationDate,
//        String author
        @NotBlank
        String mensaje,
        @NotBlank
        String nombreCurso,
        @NotBlank
        String titulo,
        @NotBlank
        String autor
) {
}
