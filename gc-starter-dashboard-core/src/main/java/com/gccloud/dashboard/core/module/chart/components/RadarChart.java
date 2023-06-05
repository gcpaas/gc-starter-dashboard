package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 雷达图
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class RadarChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.RADAR;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize{

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;

        @ApiModelProperty(notes = "显示右上角图例")
        private Boolean showLegend;

        @ApiModelProperty(notes = "图例位置")
        private String legendOrientation;

        @ApiModelProperty(notes = "是否开启辅助点")
        private Boolean showPoint;

        @ApiModelProperty(notes = "辅助点大小")
        private Integer pointSize;

        @ApiModelProperty(notes = "是否开启面积")
        private Boolean showArea;

        @ApiModelProperty(notes = "是否带底色")
        private Boolean showAlternateColor;

        @ApiModelProperty(notes = "底色")
        private String alternateColor;
    }
}