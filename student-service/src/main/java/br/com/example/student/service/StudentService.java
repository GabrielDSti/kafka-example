package br.com.example.student.service;

import br.com.example.student.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@RequiredArgsConstructor
@Log4j2
public class StudentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    public void sendMessage(Student student){
        log.info("Sending message to Kafka {}", student);
        kafkaTemplate.send("student-topic", student);
    }
}