package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 时间组件、不用后端返回数据、前端直接显示
 *
 * @author liuchengbiao
 */
@Data
public class CurrentTimeChart extends Chart {

    @ApiModelProperty(notes = "时间格式")
    private String dateFormat;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.CURRENT_TIME;

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "字体大小")
        private Integer fontSize = 14;

        @ApiModelProperty(notes = "字体权重")
        private Integer fontWeight = 700;

        @ApiModelProperty(notes = "字体颜色")
        private String color;
    }

}
