package com.langjialing.springbootknife4j.model.vo.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author 郎家岭伯爵
 */
@ApiModel("通用接口返回对象")
@Builder
@Data
public class ResUserVO {
    @ApiModelProperty(required = true, value = "姓名", notes = "姓名", example = "langjialing")
    private String name;

    @ApiModelProperty(required = true, value = "年龄", notes = "年龄", example = "20")
    private Integer age;

    @ApiModelProperty(required = true, value = "性别", notes = "性别", example = "男")
    private String sex;
}