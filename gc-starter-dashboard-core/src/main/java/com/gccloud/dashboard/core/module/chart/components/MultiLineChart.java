package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/11/7 9:46
 */
@Data
public class MultiLineChart extends LineChart {


    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.MULTI_LINE;

}
