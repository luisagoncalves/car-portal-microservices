package br.com.portal.api.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portal.api.domain.dto.CarPostDTO;
import br.com.portal.api.domain.service.CarPostStoreService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/car")
public class CarPostController {
      private CarPostStoreService carPostStoreService;

      public CarPostController(CarPostStoreService carPostStoreService) {
            this.carPostStoreService = carPostStoreService;
      }

      @GetMapping("/posts")
      public ResponseEntity<List<CarPostDTO>> getCarSales() {
            return ResponseEntity.status(HttpStatus.FOUND).body(carPostStoreService.getCarForSales());
      }

      @PutMapping("/{id}")
      public ResponseEntity changeCarSale(@RequestBody CarPostDTO carPostDTO, @PathParam("id") String id) {
            carPostStoreService.changeCarForSale(carPostDTO, id);
            return new ResponseEntity<>(HttpStatus.OK);
      }

      @DeleteMapping("/{id}")
      public ResponseEntity deleteCarForSale(@PathVariable("id") String id){
            carPostStoreService.removeCarForSale(id);
            return new ResponseEntity<>(HttpStatus.OK);
      }

}
