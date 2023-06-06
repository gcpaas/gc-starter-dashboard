package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import com.gccloud.dashboard.core.module.chart.bean.Chart;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 视频组件
 * @author hongyang
 * @version 1.0
 * @date 2023/3/13 16:44
 */
@Data
public class DashboardVideoChart extends Chart {
    
    @ApiModelProperty(notes = "组件类型")
    private String type = PageDesignConstant.DashBoard.Type.VIDEO;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "视频类型")
        private String videoType;

        @ApiModelProperty(notes = "视频地址")
        private String videoUrl;

        @ApiModelProperty(notes = "封面地址")
        private String posterUrl;

    }
}
