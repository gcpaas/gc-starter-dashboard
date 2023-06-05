package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 散点图
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class ScatterChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.SCATTER;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize{

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;

        @ApiModelProperty(notes = "散点形状")
        private List<String> shapes;

        @ApiModelProperty(notes = "是否显示标签")
        private Boolean showLabel;

        @ApiModelProperty(notes = "是否显示图例")
        private Boolean showLegend;

        @ApiModelProperty(notes = "图例位置")
        private String legendOrientation;

        @ApiModelProperty(notes = "是否显示回归线")
        private Boolean showRegressionLine;

        @ApiModelProperty(notes = "回归线类型")
        private String lineType;
    }

}