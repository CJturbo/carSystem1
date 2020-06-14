package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.CarStorage;

public interface CarStorageService {

    int findCarAmount(int id);

    void decreaseCarAmount(int id);

    void initCarAmount(CarStorage carStorage);

    void updateCarAmount(CarStorage carStorage);
}
