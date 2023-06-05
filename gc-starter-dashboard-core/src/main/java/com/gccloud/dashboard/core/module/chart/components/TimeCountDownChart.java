package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 时间倒计时组件、不用后端返回数据、前端直接显示
 *
 * @author liuchengbiao
 */
@Data
public class TimeCountDownChart extends Chart {
    /**
     * 描述
     */
    @ApiModelProperty(notes = "描述")
    private String title;
    /**
     * 以结束时间进行倒计时
     */
    @ApiModelProperty(notes = "结束时间")
    private Date endTime;

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.TIME_COUNT_DOWN;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @ApiModelProperty(notes = "日期格式")
    private String dateFormat;

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
