package com.wnn.mymusiclog.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "province_info")
public class Province {
   @TableField(value = "provinceID")
   private Integer provinceID;
   @TableField(value = "province")
   private String province;
}
