package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/9/2 17:14
 */
@Data
public class LiquidChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.LIQUID;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();


    @Data
    public static class Customize{

        @ApiModelProperty(notes = "形状")
        private String shapes;

        @ApiModelProperty(notes = "是否显示贴图")
        private Boolean showPattern;

        @ApiModelProperty(notes = "贴图类型")
        private String patternType;

        @ApiModelProperty(notes = "是否显示标签")
        private Boolean showLabel;

        @ApiModelProperty(notes = "标签")
        private String label;

        @ApiModelProperty(notes = "指标字体大小")
        private Integer metricFontSize;

        @ApiModelProperty(notes = "指标颜色")
        private String metricColor;

        @ApiModelProperty(notes = "标签字体大小")
        private Integer labelFontSize;

        @ApiModelProperty(notes = "标签颜色")
        private String labelColor;
    }

}
