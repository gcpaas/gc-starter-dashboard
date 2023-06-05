package com.gccloud.dashboard.core.constant;

/**
 * @author zhang.tianming
 */
public interface PageDesignConstant {

    /**
     * 页面类型
     */
    interface Type {
        /**
         * 仪表盘
         */
        String DASHBOARD = "dashboard";

    }


    interface CategoryType {
        /**
         * 大屏目录
         */
        String DASHBOARD = "dashboardCatalog";

        /**
         * 大屏模板目录
         */
        String DASHBOARD_TEMPLATE = "dashboardTemplateCatalog";

        /**
         * 资源库目录
         */
        String RESOURCE = "resourceCatalog";

        /**
         * 组件库目录
         */
        String COMPONENT = "componentCatalog";

    }

    /**
     * 仪表盘
     */
    interface DashBoard {

        interface Type {

            /**
             * 数字
             */
            String BIG_NUMBER = "bigNumber";

            /**
             * 数字带趋势图
             */
            String BIG_NUMBER_WITH_TREND = "bigNumberWithTrend";

            /**
             * 柱状图
             */
            String BAR = "bar";

            /**
             * 分组柱状图
             */
            String GROUP_BAR = "groupBar";

            /**
             * 饼图
             */
            String PIE = "pie";

            /**
             * 环形饼图
             */
            String ANNULAR_PIE = "annularPie";

            /**
             * 词云
             */
            String WORD_CLOUD = "wordCloud";

            /**
             * 表格
             */
            String TABLES = "tables";

            /**
             * 普通表格
             */
            String NORMAL_TABLE = "normalTable";

            /**
             * 聚合表格
             */
            String AGGREGATE_TABLE = "aggregateTable";

            /**
             * 折线图
             */
            String LINE = "lineChart";

            /**
             * 多折线图
             */
            String MULTI_LINE = "multiLineChart";

            /**
             * 排行榜
             */
            String RANKING = "ranking";

            /**
             * 趋势图（柱状）
             */
            String BIG_NUMBER_WITH_BAR = "bigNumberWithBar";

            /**
             * tab页
             */
            String TABS = "tabs";

            /**
             * 树
             */
            String TREE = "tree";

            /**
             * 树表
             */
            String TREE_TABLE = "treeTable";

            /**
             * 雷达图
             */
            String RADAR = "radar";

            /**
             * 散点图
             */
            String SCATTER = "scatter";

            /**
             * 轮播图
             */
            String CAROUSEL = "carousel";

            /**
             * 当前时间
             */
            String CURRENT_TIME = "currentTime";

            /**
             * 水波图
             */
            String LIQUID = "liquid";

            /**
             * 仪表盘
             */
            String GAUGE = "gauge";

            /**
             * 详情
             */
            String DETAIL = "detail";

            /**
             * 多数字
             */
            String MULTIPLE_NUMBER = "multipleNumberChart";

            /**
             * 外链
             */
            String IFRAME = "iframeChart";

            /**
             * 链接
             */
            String LINK = "linkChart";

            /**
             * 倒计时
             */
            String TIME_COUNT_DOWN = "timeCountDown";

            /**
             * 标题
             */
            String TITLE = "titles";


        }

        interface TimeRange {
            /**
             * 昨天
             */
            String LAST_DAY = "lastDay";
            /**
             * 最近一周
             */
            String LAST_WEEK = "lastWeek";
            /**
             * 最近一月
             */
            String LAST_MONTH = "lastMonth";
            /**
             * 最近一季度
             */
            String LAST_QUARTER = "lastQuarter";
            /**
             * 最近一年
             */
            String LAST_YEAR = "lastYear";

            /**
             * 上周
             */
            String PREVIOUS_WEEK = "previousWeek";
            /**
             * 上月
             */
            String PREVIOUS_MONTH = "previousMonth";
            /**
             * 上一年
             */
            String PREVIOUS_YEAR = "previousYear";

        }

        interface TimeGrain {
            /**
             * 原始值
             */
            String ORIGINAL = "original";
            /**
             * 秒
             */
            String SECOND = "second";
            /**
             * 分钟
             */
            String MINUTE = "minute";
            /**
             * 小时
             */
            String HOUR = "hour";
            /**
             * 日
             */
            String DAY = "day";
            /**
             * 周
             */
            String WEEK = "week";
            /**
             * 月
             */
            String MONTH = "month";
            /**
             * 季度
             */
            String QUARTER = "quarter";
            /**
             * 年
             */
            String YEAR = "year";
        }

        interface Operator {
            /**
             * 等于
             */
            String EQUAL = "=";
            /**
             * 不等于
             */
            String NOT_EQUAL = "!=";
            /**
             * 大于
             */
            String GREATER_THAN = ">";
            /**
             * 小于
             */
            String LESS_THAN = "<";
            /**
             * 大于等于
             */
            String GREATER_THAN_OR_EQUAL = ">=";
            /**
             * 小于等于
             */
            String LESS_THAN_OR_EQUAL = "<=";
            /**
             * 在...之中
             */
            String IN = "IN";
            /**
             * 不在...之中
             */
            String NOT_IN = "NOT IN";
            /**
             * 包含
             */
            String LIKE = "LIKE";
            /**
             * 为空
             */
            String IS_NULL = "IS NULL";
            /**
             * 不为空
             */
            String IS_NOT_NULL = "IS NOT NULL";


        }

        interface Aggregate {
            /**
             * 统计
             */
            String COUNT = "COUNT";
            /**
             * 求和
             */
            String SUM = "SUM";
            /**
             * 平均值
             */
            String AVG = "AVG";
            /**
             * 最大值
             */
            String MAX = "MAX";
            /**
             * 最小值
             */
            String MIN = "MIN";
            /**
             * 统计不重复值
             */
            String COUNT_DISTINCT = "COUNT_DISTINCT";
        }
    }


}
