package br.com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class StudentConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerApplication.class, args);
    }

}
