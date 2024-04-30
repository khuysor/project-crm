package com.huysor.crm.projectcrm.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data

public class ProjectDTO {
    private String projectName;
    private BigDecimal projectPrice;
    private Integer term;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer status;
    private Integer approvedBy;


}

