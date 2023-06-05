package com.gccloud.dashboard.core.module.template.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gccloud.dashboard.core.entity.SuperEntity;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import com.gccloud.dashboard.core.module.basic.dto.BasePageDTO;
import com.gccloud.dashboard.core.module.basic.entity.type.BasePageDTOTypeHandler;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hongyang
 * @version 1.0
 * @date 2023/3/20 16:38
 */
@Data
@TableName(value = "dashboard_page_template", autoResultMap = true)
public class PageTemplateEntity extends SuperEntity {

    @ApiModelProperty(notes = "模板名称")
    private String name;

    /**
     * 参考：{@link PageDesignConstant.Type}
     */
    @ApiModelProperty(notes = "模板类型")
    private String type;

    @ApiModelProperty(notes = "缩略图地址")
    private String thumbnail;

    @ApiModelProperty(notes = "模板配置")
    @TableField(typeHandler = BasePageDTOTypeHandler.class)
    private BasePageDTO config;

    @ApiModelProperty(notes = "备注")
    private String remark;

}
