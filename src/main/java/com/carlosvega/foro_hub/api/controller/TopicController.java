package com.carlosvega.foro_hub.api.controller;

import com.carlosvega.foro_hub.api.models.TopicData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicController {

    @PostMapping
    public void recieveTopic(@RequestBody TopicData topicData){
        System.out.println(topicData);
    }
}
