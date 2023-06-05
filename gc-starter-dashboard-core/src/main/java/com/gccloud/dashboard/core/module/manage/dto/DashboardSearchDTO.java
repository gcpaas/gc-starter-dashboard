package com.gccloud.dashboard.core.module.manage.dto;

import com.gccloud.dashboard.core.dto.SearchDTO;
import lombok.Data;

/**
 * @author hongynag
 * @version 1.0
 */
@Data
public class DashboardSearchDTO extends SearchDTO {

    /**
     * 所属分组
     */
    private String parentCode;

    /**
     * 类型
     */
    private String type;
}
