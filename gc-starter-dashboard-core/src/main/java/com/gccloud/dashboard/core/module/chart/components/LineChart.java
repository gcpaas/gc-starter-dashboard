package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/9/2 17:14
 */
@Data
public class LineChart extends Chart {

    @ApiModelProperty(notes = "计算百分比")
    private Boolean contribution;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.LINE;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();


    @Data
    public static class Customize{

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;

        @ApiModelProperty(notes = "显示标点")
        private Boolean showMarkers;

        @ApiModelProperty(notes = "显示右上角图例")
        private Boolean legend;

        @ApiModelProperty(notes = "显示悬浮提示")
        private Boolean showTooltip;

    }

}
