package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 外链组件、不用后端返回数据、前端直接显示
 *
 * @author liuchengbiao
 */
@Data
public class IframeChart extends Chart {

    @ApiModelProperty(notes = "外链地址")
    private String url;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.IFRAME;

}
