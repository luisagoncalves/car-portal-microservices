package br.com.portal.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
// Essa classe representa a postagem de um novo carro na plataforma
public class CarPostDTO {
      private String model;
      private String brand;
      private String price;
      private String description;
      private String engineVersion;
      private String city;
      private String createdDate;
      private Long ownerId;
      private String ownerName;
      private String ownerType;
      private String contact;
}
