package demo.springboot.mybatis6.dao;

import demo.springboot.mybatis6.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author dean.lee
 */
public interface SysUserMapper {
    SysUser selectById(long id);

    @Update("update sys_user set age = #{age} where id = #{id}")
    int updateAgeById(@Param("age") int age, @Param("id") long id);
}
