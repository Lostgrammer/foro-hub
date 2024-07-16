package com.carlosvega.foro_hub.api.topic;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topico")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public void receiveTopic(@RequestBody @Valid TopicData topicData){
        topicRepository.save(new Topic(topicData));
    }

    @GetMapping
    public Page<ListedTopicData> listTopicItems(@PageableDefault(size = 5) Pageable pagination){
        return topicRepository.findAll(pagination).map(ListedTopicData::new);
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateTopic(@RequestBody @Valid UpdateTopicData updateTopicData){
        Topic topic = topicRepository.getReferenceById(updateTopicData.id_usuario());
        topic.updateData(updateTopicData);
        return ResponseEntity.ok(new TopicResponseData(
                topic.getUserId(),
                topic.getMensaje(),
                topic.getNombreCurso(),
                topic.getTitulo(),
                topic.getAutor()));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deteleTopic(@PathVariable Long id){
        Topic topic = topicRepository.getReferenceById(id);
        topicRepository.delete(topic);
        return ResponseEntity.noContent().build();
    }
}
