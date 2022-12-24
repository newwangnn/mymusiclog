package com.wnn.mymusiclog.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_alipay_baseinfo")
public class UserAliPay {
    @TableId
   Integer uid                  ;//用户ID
   @TableField("reg_mid")
   Integer regMid              ;//注册机器ID
   String sex                   ;//性别
   String birthday              ;//生日
   String msisdn                ;//手机号码
   Integer locationid           ;//地区ID
    @TableField("mode_type")
    Integer modeType            ;//注册登录模式
    @TableField("regist_time")
    String registTime           ;//注册时间
    @TableField("user_exp")
    String userExp              ;//用户当前经验值
   Integer score                ;//累计积分
    @TableField("user_level")
    Integer userLevel           ;//用户等级
    @TableField("user_type")
    String userType             ;//用户类型
    @TableField("is_certified")
    String isCertified          ;//实名认证
    @TableField("is_student_certified")
    String isStudentCertified  ;//是否学生
   String openid                ;//支付宝ID

}
