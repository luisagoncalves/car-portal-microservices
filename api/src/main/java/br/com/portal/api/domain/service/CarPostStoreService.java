package br.com.portal.api.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.portal.api.domain.dto.CarPostDTO;

@Service
public interface CarPostStoreService {
      
      List<CarPostDTO> getCarForSales();

      void changeCarForSale(CarPostDTO carPost, String id);
      
      void removeCarForSale(String id);
}
