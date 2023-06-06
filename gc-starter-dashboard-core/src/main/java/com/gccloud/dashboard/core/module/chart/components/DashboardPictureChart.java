package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 图片
 * @author hongyang
 * @version 1.0
 * @date 2023/3/16 10:30
 */
@Data
public class DashboardPictureChart extends Chart {

    @ApiModelProperty(notes = "自定义")
    private Customize customize;

    @Data
    public static class Customize {
        @ApiModelProperty(notes = "透明度")
        private Integer opacity;

        @ApiModelProperty(notes = "圆角")
        private Integer radius;

        @ApiModelProperty(notes = "图片地址")
        private String url;

    }

}
