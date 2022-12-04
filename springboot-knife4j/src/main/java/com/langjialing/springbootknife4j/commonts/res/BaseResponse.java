package com.langjialing.springbootknife4j.commonts.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 郎家岭伯爵
 */
@ApiModel("基础返回类")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable{
    @ApiModelProperty(value = "返回值", example = "")
    private String code;

    @ApiModelProperty(value = "返回信息", example = "")
    private String message;

    @ApiModelProperty(value = "返回信息体", example = "")
    private T messageBody;

}