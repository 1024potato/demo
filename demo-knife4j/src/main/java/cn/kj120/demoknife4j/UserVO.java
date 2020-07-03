package cn.kj120.demoknife4j;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserVO {

    @ApiModelProperty(value = "用户id", example = "1", required = true)
    private Integer id;

    @ApiModelProperty(value = "用户名称", example = "potato")
    private String username;

}
