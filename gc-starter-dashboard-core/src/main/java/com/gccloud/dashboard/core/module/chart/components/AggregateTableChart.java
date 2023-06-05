package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/8/15 17:07
 */
@Data
public class AggregateTableChart extends TablesChart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.AGGREGATE_TABLE;

    @ApiModelProperty(notes = "显示总数")
    private Boolean showTotals;

}
