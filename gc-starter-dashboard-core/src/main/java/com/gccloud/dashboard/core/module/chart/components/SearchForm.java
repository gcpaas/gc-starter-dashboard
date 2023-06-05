package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Btn;
import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.module.chart.bean.Field;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2022/11/24 13:33
 */
@Data
public class SearchForm extends Chart {

    @ApiModelProperty(notes = "查询表单字段")
    private List<Field> fields;

    @ApiModelProperty(notes = "查询表单按钮")
    private List<Btn> btns;

}
