package cn.kj120.demoknife4j;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Demo {

    @ApiModelProperty(value = "名称", example = "这是名称", required = true)
    private String name;

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "主键集合", example = "[1,2,3]")
    private List<Long> ids;
}
