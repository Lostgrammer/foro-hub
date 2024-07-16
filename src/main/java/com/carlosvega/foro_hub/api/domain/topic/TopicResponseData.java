package com.carlosvega.foro_hub.api.domain.topic;

public record TopicResponseData(
        Long id_usuario,
        String mensaje,
        String nombreCurso,
        String titulo,
        String autor
) {
}
