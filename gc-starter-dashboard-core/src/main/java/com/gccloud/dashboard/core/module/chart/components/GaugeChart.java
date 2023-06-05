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
public class GaugeChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.GAUGE;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();


    @Data
    public static class Customize{

        @ApiModelProperty(notes = "仪表盘的圆弧分段")
        private List<String> rangTicks;

        @ApiModelProperty(notes = "仪表盘圆弧颜色")
        private List<String> colorScheme;

        @ApiModelProperty(notes = "仪表盘类型")
        private String type;

        @ApiModelProperty(notes = "指针颜色")
        private String pointerColor;

        @ApiModelProperty(notes = "针头颜色")
        private String pinColor;

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
