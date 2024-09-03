package br.com.example.student.service;

import br.com.example.student.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class StudentListener {

    @KafkaListener(topics = "student-topic", groupId = "student-group", containerFactory = "jsonContainerFactory")
    public void consumeMessage(@Payload Student student){
        log.info("Reading student: {}", student);
    }
}
