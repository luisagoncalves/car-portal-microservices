package br.com.portal.api.message;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.portal.api.domain.dto.CarPostDTO;

@Component
public class KafkaProducerMessage {
      private KafkaTemplate<String, CarPostDTO> kafkaTemplate;

      public KafkaProducerMessage(KafkaTemplate<String, CarPostDTO> kafkaTemplate) {
            this.kafkaTemplate = kafkaTemplate;
      }

      private final String KAFKA_TOPIC = "car-post-topic";

      public void sendMessage(CarPostDTO carPostDTO){
            kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
      }
}
