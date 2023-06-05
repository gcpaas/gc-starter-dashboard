package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数字下方带柱状图
 * @author hongyang
 * @version 1.0
 * @date 2022/9/5 17:14
 */
@Data
public class BigNumberWithBarChart extends Chart {

;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.BIG_NUMBER_WITH_BAR;

    @ApiModelProperty(notes = "子标题")
    private String subHeader;

    @ApiModelProperty(notes = "趋势线是否显示")
    private boolean showBar = true;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    /**
     * 定制化
     */
    @Data
    public static class Customize{

        @ApiModelProperty(notes = "柱颜色")
        private String barColor;

        @ApiModelProperty(notes = "字体大小")
        private String fontSize = "20px";

        @ApiModelProperty(notes = "字体权重")
        private Integer fontWeight = 700;

        @ApiModelProperty(notes = "数字格式化")
        private String numberFormat;

        @ApiModelProperty(notes = "时间格式化")
        private String dateFormat;

        @ApiModelProperty(notes = "显示右上角图例")
        private Boolean legend;

        @ApiModelProperty(notes = "显示柱状图柱顶的数据")
        private Boolean barValues;
    }
}
