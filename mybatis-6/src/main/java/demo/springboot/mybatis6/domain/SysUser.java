package demo.springboot.mybatis6.domain;

import lombok.Data;

/**
 * @author dean.lee
 */
@Data
public class SysUser {
    private Long id;
    private String username;
    private String nickname;
    private Integer age;
}
