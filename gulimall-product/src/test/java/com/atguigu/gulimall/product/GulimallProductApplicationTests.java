package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setBrandId(4L);
        brandEntity.setDescript("肾机一肾难求");

//        brandEntity.setName("iPhone100plus");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");

        brandService.updateById(brandEntity);

    }

}
