package demo.springboot.mybatis6;

import demo.springboot.mybatis6.dao.SysUserMapper;
import demo.springboot.mybatis6.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatis6ApplicationTests {

    @Autowired
    private SysUserMapper userMapper;

    @Test
    public void contextLoads() {
        SysUser sysUser = userMapper.selectById(1L);
        System.out.println(sysUser);
    }

}
