package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 词云
 * @author liuchengbiao
 * @version 1.0
 * @date 2022/8/8 15:11
 */
@Data
public class WordCloudChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.WORD_CLOUD;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    /**
     * 定制化
     */
    @Data
    public static class Customize{

        @ApiModelProperty(notes = "最小字体")
        private Integer miniNumFontSize = 10;

        @ApiModelProperty(notes = "最大字体")
        private Integer maxNumFontSize = 70;

        @ApiModelProperty(notes = "字体旋转")
        private String rotation;

        @ApiModelProperty(notes = "配色方案")
        private List<String> colorScheme;
    }
}
