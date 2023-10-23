package br.com.portal.api.domain.service;

import org.springframework.stereotype.Service;

import br.com.portal.api.client.CarPostStoreClient;
import br.com.portal.api.domain.dto.OwnerPostDTO;

@Service
public class OwnerPostServiceImpl implements OwnerPostService{

      private CarPostStoreClient carPostStoreClient;

      public OwnerPostServiceImpl(CarPostStoreClient carPostStoreClient) {
            this.carPostStoreClient = carPostStoreClient;
      }

      @Override
      public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
            carPostStoreClient.ownerPostsClient(ownerPostDTO);
      }
      
}
