package com.huysor.crm.projectcrm.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private BigDecimal projectPrice;
    private Integer term;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
//    @ColumnDefault("0")
    private Integer status;
    private Integer approvedBy;

}
