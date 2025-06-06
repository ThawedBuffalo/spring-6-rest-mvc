package tbs.spring6restmvc.service;

import tbs.spring6restmvc.model.Beer;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder().id(id).build();
    }
}
