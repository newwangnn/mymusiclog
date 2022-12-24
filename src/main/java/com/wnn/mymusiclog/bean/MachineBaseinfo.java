package com.wnn.mymusiclog.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "machine_baseinfo")
public class MachineBaseinfo {
    @TableId("mid")
    Integer mid;

    String serialnum;
    @TableField("hard_id")
    String hardId;
    @TableField("song_warehouse_version")
    String songWarehouseVersion;
    @TableField("exec_version")
    String execVersion;
    @TableField("ui_version")
    String uiVersion;

    String online;

    Integer status;

    @TableField("current_login_time")
    String currentLoginTime;
    @TableField("pay_switch")
    String paySwitch;
    @TableField("language_type")
    Integer languageType;
    @TableField("songware_type")
    Integer songwareType;
    @TableField("screen_type")
    Integer screenType;

}
