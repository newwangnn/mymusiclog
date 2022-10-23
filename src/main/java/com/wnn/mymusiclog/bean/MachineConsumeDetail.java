package com.wnn.mymusiclog.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("machine_consume_detail")
public class MachineConsumeDetail {
   Integer id              ;//自增唯一ID
   Integer mid             ;//机器ID
    @TableField("p_type")
   Integer pType          ;//产品类型
    @TableField("m_type")
   Integer mType          ;//支付类型
    @TableField("pkg_id")
   Integer pkgId          ;//套餐ID
    @TableField("pkg_name")
   String pkgName         ;//套餐名称
   Integer amount          ;//总金额(以分为单位)
    @TableField("consum_id")
   String consumId        ;//消费ID
    @TableField("order_id")
   String orderId         ;//订单ID
    @TableField("trade_no")
   String tradeNo         ;//第三方交易编号
    @TableField("action_time")
   String actionTime      ;//消费时间
   Integer uid             ;//用户ID
   String nickname         ;//用户名称
    @TableField("activity_id")
   Integer activityId     ;//优惠活动ID
    @TableField("activity_name")
   String activityName    ;//优惠活动名称
    @TableField("coupon_type")
   Integer couponType     ;//优惠券类型
    @TableField("coupon_type_name")
   String couponTypeName ;//优惠券类型名称
    @TableField("pkg_price")
   Integer pkgPrice       ;//套餐原价
    @TableField("pkg_discount")
   Integer pkgDiscount    ;//优惠金额
    @TableField("order_type")
   Integer orderType      ;//订单类型
    @TableField("bill_date")
   String billDate        ;//账单日期

}
