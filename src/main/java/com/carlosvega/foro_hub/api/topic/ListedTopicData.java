package com.carlosvega.foro_hub.api.topic;

public record ListedTopicData(
        Long id_usuario,
        String titulo,
        String mensaje,
        String fecha_creacion
) {
    //constructor

    public ListedTopicData(Topic topic) {
        this(topic.getUserId(), topic.getTitulo(), topic.getMensaje(), topic.getFechaCreacion());
    }
}
