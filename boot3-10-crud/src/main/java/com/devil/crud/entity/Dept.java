package com.devil.crud.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * ClassName：Dept
 *
 * @author: Devil
 * @Date: 2024/12/18
 * @Description:
 * @version: 1.0
 */
@Schema(title = "部门信息")
@Data
public class Dept {
    @Schema(title = "部门id")
    private Long id;
    @Schema(title = "部门名字")
    private String deptName;
}
