package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Btn;
import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.module.chart.bean.Field;

import com.gccloud.dashboard.core.constant.PageDesignConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2023/1/5 11:05
 */
@Data
public class TreeChart extends Chart {

    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.TREE;


    @ApiModelProperty(notes = "查询表单字段")
    private List<Field> fields;

    @ApiModelProperty(notes = "查询表单按钮")
    private List<Btn> btns;

    @ApiModelProperty(notes = "操作按钮")
    private List<Btn> opts;

    @ApiModelProperty(notes = "个性化")
    private TablesChart.Customize customize = new TablesChart.Customize();

    @Data
    public static class Customize {

    }
}
