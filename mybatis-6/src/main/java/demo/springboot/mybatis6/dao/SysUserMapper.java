package demo.springboot.mybatis6.dao;

import demo.springboot.mybatis6.domain.SysUser;

/**
 * @author dean.lee
 */
public interface SysUserMapper {
    SysUser selectById(long id);
}
