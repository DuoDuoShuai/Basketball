package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 徐晓瑞
 * @date 2022/9/15 10:26
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollAndStudent {

    /**
     * 报名id
     */
    private String enrollId;

    /**
     * 学员id
     */
    private String studentId;
}
