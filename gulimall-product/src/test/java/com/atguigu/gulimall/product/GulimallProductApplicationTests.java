package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

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
    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("/Users/jiangangliu/Downloads/2.png");
        ossClient.putObject("liujiangang-ljg","2.png",inputStream);
        //关闭OSSClient
        ossClient.shutdown();
        System.out.println("上传完成...");

    }


}
