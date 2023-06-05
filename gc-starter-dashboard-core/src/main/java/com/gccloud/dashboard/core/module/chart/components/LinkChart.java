package com.gccloud.dashboard.core.module.chart.components;

import com.gccloud.dashboard.core.module.chart.bean.Chart;
import com.gccloud.dashboard.core.constant.PageDesignConstant;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 链接组件、不用后端返回数据、前端直接显示
 *
 * @author liuchengbiao
 */
@Data
public class LinkChart extends Chart {


    @ApiModelProperty(notes = "类型")
    private String type = PageDesignConstant.DashBoard.Type.LINK;

    @ApiModelProperty(notes = "链接数组")
    private List<Link> linkList = Lists.newArrayList();

    @Data
    public static class Link {

        @ApiModelProperty(notes = "名称")
        private String name;

        @ApiModelProperty(notes = "链接地址")
        private String url;

        @ApiModelProperty(notes = "打开方式")
        private String target;

        @ApiModelProperty(notes = "图标")
        private String icon;

        @ApiModelProperty(notes = "图标颜色")
        private String iconColor;
    }
}
