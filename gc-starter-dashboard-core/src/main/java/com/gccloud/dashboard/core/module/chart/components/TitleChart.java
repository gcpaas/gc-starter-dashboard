package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 标题组件、不用后端返回数据、前端直接处理
 *
 * @author liuchengbiao
 */
@Data
public class TitleChart extends Chart {

    @ApiModelProperty(notes = "标题")
    private String title;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.TITLE;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "字体大小")
        private Integer fontSize = 14;

        @ApiModelProperty(notes = "字体权重")
        private Integer fontWeight = 700;

        @ApiModelProperty(notes = "字体颜色")
        private String color;

        @ApiModelProperty(notes = "副标题")
        private String subtitle;

        @ApiModelProperty(notes = "是否显示副标题")
        private Boolean showSubtitle = false;

        @ApiModelProperty(notes = "副标题文字大小")
        private Integer subFontSize = 20;

        @ApiModelProperty(notes = "副标题文字粗细")
        private Integer subFontWeight = 400;

        @ApiModelProperty(notes = "副标题文字颜色")
        private String subColor;

        @ApiModelProperty(notes = "副标题位置")
        private String subPosition;

    }
}
