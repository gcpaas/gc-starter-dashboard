package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/8/15 16:04
 */
@Data
public class PieChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.PIE;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;

        @ApiModelProperty(notes = "显示标签的最小百分比阈值。")
        private Integer percentageThreshold;

        @ApiModelProperty(notes = "显示图例（什么颜色代表什么的色块标识）")
        private Boolean showLegend;

        @ApiModelProperty(notes = "图例样式， 可选值： 'scroll'、'plain'")
        private String legendType;

        @ApiModelProperty(notes = "图例位置， 可选值： 'right'、'bottom'、'left'、'top'")
        private String legendOrientation;

        @ApiModelProperty(notes = "图例附加填充，单位像素")
        private Integer legendMargin;

        @ApiModelProperty(notes = "标签类型（多选），可选值： 'categoryName'、'value'、'percentage'")
        private List<String> labelType;

        @ApiModelProperty(notes = "数字格式")
        private String numberFormat;

        @ApiModelProperty(notes = "日期格式")
        private String dateFormat;

        @ApiModelProperty(notes = "显示标签")
        private Boolean showLabel;

        @ApiModelProperty(notes = "显示标签到区块连线")
        private Boolean labelLine;

        @ApiModelProperty(notes = "将标签放在区块外部")
        private Boolean putLabelOutside;

        @ApiModelProperty(notes = "显示总数")
        private Boolean showTotal;

        @ApiModelProperty(notes = "外圈显示比例，0-100")
        private Integer outRadius;

        @ApiModelProperty(notes = "显示内圈（甜甜圈样式）")
        private Boolean donut;

        @ApiModelProperty(notes = "内圈显示比例，0-100")
        private Integer innerRadius;

    }



}
