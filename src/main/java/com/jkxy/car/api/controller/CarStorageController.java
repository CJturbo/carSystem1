package com.jkxy.car.api.controller;

import com.jkxy.car.api.pojo.CarStorage;
import com.jkxy.car.api.service.CarStorageService;
import com.jkxy.car.api.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("carStorage")
public class CarStorageController {
    @Autowired
    private CarStorageService carStorageService;

    /**
     * 根据id查询库存
     *
     * @param id
     * @return
     */
    @GetMapping("findCarAmount/{id}")
    public JSONResult findCarAmount(@PathVariable int id) {
        int amount = carStorageService.findCarAmount(id);
        return JSONResult.ok(amount);
    }

    /**
     * 买车操作，通过id减少库存数量，默认减1
     *
     * @param id
     * @return
     */
    @PutMapping("buyCar/{id}")
    public JSONResult buyCar(@PathVariable int id) {
        int amount = carStorageService.findCarAmount(id);
        if (amount == 0) {
            return JSONResult.errorMsg("该车型已售罄!");
        }
        carStorageService.decreaseCarAmount(id);
        return JSONResult.ok();
    }

    /**
     * 初始化车辆库存
     * 若车辆id已存在，则更新库存数量
     *
     * @param carStorage
     * @return
     */
    @PostMapping("initCarAmount")
    public JSONResult initCarAmount(CarStorage carStorage) {
        try {
            carStorageService.initCarAmount(carStorage);
        } catch (DuplicateKeyException e) {
            carStorageService.updateCarAmount(carStorage);
        }
        return JSONResult.ok();
    }
}
