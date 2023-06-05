package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/9/5 14:36
 */
@Data
public class RankingChart extends Chart {

;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.RANKING;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @ApiModelProperty(notes = "最多显示排行数量")
    private Integer max = 10;

    /**
     * 定制化
     */
    @Data
    public static class Customize {

        @ApiModelProperty(notes = "高亮显示数量")
        private Integer highlightNum;

        private List<HighlightStyle> highlightStyle;

    }

    /**
     * 高亮样式
     */
    @Data
    public static class HighlightStyle {

        @ApiModelProperty(notes = "高亮颜色")
        private String highlightColor;

        @ApiModelProperty(notes = "排名")
        private Integer mark;

    }
}
