package demo.springboot.bean3;

import demo.springboot.bean3.bean.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Bean3ApplicationTests {

    @Autowired
    private demo.springboot.bean3.bean.Test test;
    @Autowired
    private Test1 test1;

    @Test
    public void contextLoads() {
        test.setName("test");
        System.out.println(test);
        System.out.println(test1);
    }

}
