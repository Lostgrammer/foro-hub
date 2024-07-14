package com.carlosvega.foro_hub.api.topic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topic")
@Entity(name = "Topic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "userId")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String mensaje;
    @Column(name = "nombre_curso") //tables in db should have this nomenclature
    private String nombreCurso;
    private String titulo;
    private String fecha_creacion;
    private String autor;

    //contructor
    public Topic(TopicData topicData) {
        this.nombreCurso = topicData.nombreCurso();
        this.titulo = topicData.titulo();
        this.autor = topicData.autor();
        this.fecha_creacion = topicData.fecha_creacion();
        this.mensaje = topicData.mensaje();
    }
}
