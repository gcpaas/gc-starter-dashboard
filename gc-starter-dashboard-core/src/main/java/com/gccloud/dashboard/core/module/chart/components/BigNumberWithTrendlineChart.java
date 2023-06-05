package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * 数字下方带趋势线
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class BigNumberWithTrendlineChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.BIG_NUMBER_WITH_TREND;

    @ApiModelProperty(notes = "趋势线是否显示")
    private boolean showTrendLine = true;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    /**
     * 定制化
     */
    @Data
    public static class Customize{

        @ApiModelProperty(notes = "趋势线颜色")
        private Map<String, String> fixedColor;

        @ApiModelProperty(notes = "字体大小")
        private String fontSize = "20px";

        @ApiModelProperty(notes = "字体权重")
        private Integer fontWeight = 700;

        @ApiModelProperty(notes = "数字格式化")
        private String numberFormat;

        @ApiModelProperty(notes = "时间格式化")
        private String dateFormat;
    }
}
