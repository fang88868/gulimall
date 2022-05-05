package com.example.gulimall.product;

import com.example.gulimall.product.entity.AttrEntity;
import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.AttrService;
import com.example.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("hhh");

        brandService.save(brandEntity);
        System.out.println("保存成功");

    }

}
