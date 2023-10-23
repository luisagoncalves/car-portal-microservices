package br.com.portal.api.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portal.api.domain.dto.OwnerPostDTO;
import br.com.portal.api.domain.service.OwnerPostService;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {
      private OwnerPostService ownerPostService;

      public OwnerPostController(OwnerPostService ownerPostService) {
            this.ownerPostService = ownerPostService;
      }

      @PostMapping
      public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO){
            ownerPostService.createOwnerCar(ownerPostDTO);
            return new ResponseEntity<>(HttpStatus.OK);
      }
}
