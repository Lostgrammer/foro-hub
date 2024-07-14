package com.carlosvega.foro_hub.api.topic;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public void recieveTopic(@RequestBody @Valid TopicData topicData){
        topicRepository.save(new Topic(topicData));
    }
    @GetMapping
    public List<ListedTopicData> listTopicitems(){
        return topicRepository.findAll().stream()
                .map(ListedTopicData::new)
                .toList();
    }
}