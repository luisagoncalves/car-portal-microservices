package br.com.portal.api.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.portal.api.client.CarPostStoreClient;
import br.com.portal.api.domain.dto.CarPostDTO;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

      private CarPostStoreClient carPostStoreClient;

      public CarPostStoreServiceImpl(CarPostStoreClient carPostStoreClient) {
            this.carPostStoreClient = carPostStoreClient;
      }

      @Override
      public List<CarPostDTO> getCarForSales() {
            return carPostStoreClient.getCarForSaleClient();
      }

      @Override
      public void changeCarForSale(CarPostDTO carPost, String id) {
            carPostStoreClient.changeCarForSaleClient(carPost, id);
      }

      @Override
      public void removeCarForSale(String id) {
            carPostStoreClient.deleteCarForSaleClient(id);
      }

}
