package com.karumien.client.adochazka.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.karumien.client.adochazka.schemas.Pritomnost;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ADochazkaServiceTest {

    @Autowired
    private ADochazkaService aDochazkaService;
    
    @Test
    public void getActualWorkers() {
       List<Pritomnost> pritomnost =  aDochazkaService.getActualWorkers();
       assertNotNull(pritomnost);
    }

}
