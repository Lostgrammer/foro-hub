package com.carlosvega.foro_hub.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public void recieveTopic(@RequestBody TopicData topicData){
        topicRepository.save(new Topic(topicData));
    }
}
