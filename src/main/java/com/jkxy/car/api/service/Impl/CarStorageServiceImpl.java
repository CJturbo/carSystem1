package com.jkxy.car.api.service.Impl;

import com.jkxy.car.api.dao.CarDao;
import com.jkxy.car.api.dao.CarStorageDao;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.pojo.CarStorage;
import com.jkxy.car.api.service.CarService;
import com.jkxy.car.api.service.CarStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("carStorageService")
public class CarStorageServiceImpl implements CarStorageService {
    @Autowired
    private CarStorageDao carStorageDao;

    @Override
    public int findCarAmount(int id) {
        return carStorageDao.findCarAmount(id);
    }

    @Override
    public void decreaseCarAmount(int id) {
        carStorageDao.decreaseCarAmount(id);
    }

    @Override
    public void initCarAmount(CarStorage carStorage) {
        carStorageDao.initCarAmount(carStorage);
    }

    @Override
    public void updateCarAmount(CarStorage carStorage) {
        carStorageDao.updateCarAmount(carStorage);
    }

}
