package com.langjialing.springbootknife4j.model.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 郎家岭伯爵
 */
@ApiModel("通用接口请求对象")
@Builder
@Data
public class ReqUserVO {
    @ApiModelProperty(required = true, value = "用户id", notes = "用户id", example = "langjialing")
    @NotBlank(message = "userid 不能为空")
    private String userId;

    @ApiModelProperty(required = true, value = "用户密码", notes = "用户密码", example = "123456")
    @NotBlank(message = "password 不能为空")
    private Long userPassword;
}