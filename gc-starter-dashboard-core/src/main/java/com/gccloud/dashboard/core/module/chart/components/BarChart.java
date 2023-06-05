package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 柱状图
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class BarChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.BAR;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Deprecated
    @ApiModelProperty(notes = "显示breakDowns细分的每列的百分比")
    private Boolean contribution;

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "显示右上角图例")
        private Boolean legend;

        @ApiModelProperty(notes = "显示柱状图柱顶的数据")
        private Boolean barValues;

        @ApiModelProperty(notes = "使用堆叠的方式显示柱状图")
        private Boolean stackedBars;

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;

        /**
         * 以下为大屏组件属性
         */

        @ApiModelProperty(notes = "x轴标签颜色")
        private String barColor;

        @ApiModelProperty(notes = "y轴标签颜色")
        private String axisColor;

        @ApiModelProperty(notes = "y轴标签字体大小")
        private String axisFontSize;

        @ApiModelProperty(notes = "标签颜色")
        private String labelColor;

    }
}