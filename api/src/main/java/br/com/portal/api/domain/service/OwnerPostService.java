package br.com.portal.api.domain.service;

import org.springframework.stereotype.Service;

import br.com.portal.api.domain.dto.OwnerPostDTO;

@Service
public interface OwnerPostService {
      void createOwnerCar(OwnerPostDTO ownerPostDTO);
}
