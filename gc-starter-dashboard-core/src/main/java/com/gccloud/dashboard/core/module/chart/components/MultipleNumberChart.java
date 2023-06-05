package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 多个数字图表
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class MultipleNumberChart extends Chart {

    @ApiModelProperty(notes = "子标题")
    private String subHeader;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.MULTIPLE_NUMBER;

    @ApiModelProperty(notes = "个性化")
    private List<Customize> customizeList = Lists.newArrayList();


    /**
     * 定制化
     */
    @Data
    public static class Customize {

        @ApiModelProperty(notes = "指标")
        private String metric;

        @ApiModelProperty(notes = "指标名称")
        private String descriptionField;

        @ApiModelProperty(notes = "指标字体大小")
        private Integer metricFontSize = 30;

        @ApiModelProperty(notes = "指标字体权重")
        private Integer metricFontWeight = 700;

        @ApiModelProperty(notes = "指标字体颜色")
        private String metricColor;

        @ApiModelProperty(notes = "描述字体大小")
        private Integer descriptionFontSize = 30;

        @ApiModelProperty(notes = "描述字体权重")
        private Integer descriptionWeight = 700;

        @ApiModelProperty(notes = "描述字体颜色")
        private String descriptionColor;

        @ApiModelProperty(notes = "指标格式")
        private String numberFormat = "kilobit";

    }
}
