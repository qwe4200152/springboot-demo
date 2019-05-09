package demo.springboot.cache8;

import demo.springboot.cache8.service.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cache8ApplicationTests {
    @Autowired
    private CacheService cacheService;

    @Test
    public void contextLoads() {
        System.out.println(cacheService.getName(1L));
        System.out.println(cacheService.getName(1L));
        cacheService.updateName(1L);
        System.out.println(cacheService.getName(1L));
        cacheService.deleteName(1L);
        System.out.println(cacheService.getName(1L));
    }

}
