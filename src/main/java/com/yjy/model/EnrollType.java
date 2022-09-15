package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐晓瑞
 * @date 2022/9/13 16:53
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollType {
    /**
     * 报名学生姓名
     */
    private String studentName;
    /**
     * 支付状态
     */
    private Boolean payType;
}
