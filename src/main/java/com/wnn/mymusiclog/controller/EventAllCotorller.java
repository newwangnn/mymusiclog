package com.wnn.mymusiclog.controller;

import com.wnn.mymusiclog.service.SongPlayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EventAllCotorller {

    @Autowired
    SongPlayService songPlayService;

    @PostMapping(value = "/event/{eventType}")
    public String login(@PathVariable("eventType") String eventType, @RequestParam String msg) {
        if("MINIK_CLIENT_SONG_PLAY_OPERATE_REQ".equals(eventType)){
            songPlayService.processEvent(msg);
        }
        return "ok";
    }

/*

MINIK_CLIENT_SONG_PLAY_OPERATE_REQ

1575302442&96755&MINIK_SERVER_GET_BUYED_PKG_LIST_REQ
&{"mid": 96755, "pkg_list_type": 1,
  "pkg_list": [{"daily_type": 0, "uid": 0, "pay_price": 100, "start_stamp": 0, "time_stamp": 1575302440, "use_status": 0, "period_type": 0, "charge": 1,
  "session_id": 24, "version": 1, "pkg_type": 1, "pkg_id": 1, "order_id": "InsertCoin_172356", "pay_type": 0, "pay_value": 1200, "pkg_value": 900}]}
&3.0.1.15&2.4.4.30

1575302442&96755&MINIK_CLIENT_NOTIFY_ACCOUNT_RECORD_INFO
&{"ch_version": 0, "pay_type": 0, "pay_timestamp": 1575302436, "mid": 96755, "flow_type": 4, "auto_idx": 172356, "flow_timestamp": 1575302436,
 "session_id": 0, "period_type": 0, "uid": 0, "daily_type": 0, "consum_flag": 0, "pkg_id": 0, "order_id": "InsertCoin_172356", "consum_id": "",
  "pay_price": 100, "pay_value": 1200, "pre_pay_value": 1200, "pkg_seq": 0, "reason": ""}
&3.0.1.15&2.4.4.30

1575302442&52107&MINIK_CLIENT_ADVERTISEMENT_RECORD
&{"src_verison": 2546, "mid": 52107, "adv_type": 4, "src_type": 2546, "uid": 0, "session_id": 14170, "event_id": 1, "time": 1575302441}
&3.0.1.15&2.4.4.30


 */


}
