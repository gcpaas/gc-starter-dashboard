package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数字
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class BigNumberChart extends Chart {

    @ApiModelProperty(notes = "子标题")
    private String subHeader;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.BIG_NUMBER;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();


    /**
     * 定制化
     */
    @Data
    public static class Customize {

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
