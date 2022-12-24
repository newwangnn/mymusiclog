package com.wnn.mymusiclog.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("song")
public class Song {
    @TableId("source_id")
    String sourceId               ;//主键ID
    String name                    ;//歌曲名字
    @TableField("other_name")
    String otherName              ;//其他名字
    Integer source                 ;//来源
    String album                   ;//所属专辑
    String product                 ;//发行公司
    String language                ;//歌曲语言
    @TableField("video_format")
    String videoFormat            ;//视频风格
    Integer duration               ;//时长
    @TableField("singer_info")
    String singerInfo             ;//歌手信息
    @TableField("")
    String postTime               ;//发行时间
    @TableField("pinyin_first")
    String pinyinFirst            ;//歌曲首字母
    String pinyin                  ;//歌曲全拼
    @TableField("singing_type")
    Integer singingType           ;//演唱类型
    @TableField("original_singer")
    String originalSinger         ;//原唱歌手
    String lyricist                ;//填词
    String composer                ;//作曲
    Integer bpm                    ;//BPM值
    @TableField("star_level")
    Integer starLevel             ;//星级
    @TableField("video_quality")
    Integer videoQuality          ;//视频画质
    @TableField("video_make")
    Integer videoMake             ;//视频制作方式
    @TableField("video_feature")
    Integer videoFeature          ;//视频画面特征
    @TableField("lyric_feature")
    Integer lyricFeature          ;//歌词字母特点
    @TableField("Image_quality")
    Integer ImageQuality          ;//画质评价
    @TableField("subtitles_type")
    Integer subtitlesType         ;//字幕类型
    @TableField("audioFormat")
    Integer audioFormat           ;//音频格式
    @TableField("original_sound_quality")
    Integer originalSoundQuality ;//原唱音质
    @TableField("original_track")
    Integer originalTrack         ;//音轨
    @TableField("original_track_vol")
    Integer originalTrackVol     ;//原唱音量
    @TableField("accompany_version")
    Integer accompanyVersion      ;//伴唱版本
    @TableField("accompany_quality")
    Integer accompanyQuality      ;//伴唱音质
    @TableField("acc_track_vol")
    Integer accTrackVol          ;//伴唱音量
    @TableField("accompany_track")
    Integer accompanyTrack        ;//伴唱音轨
    Integer width                  ;//视频分辨率W
    Integer height                 ;//视频分辨率H
    @TableField("video_resolution")
    Integer videoResolution       ;//视频分辨率
    @TableField("song_version")
    Integer songVersion           ;//编曲版本
    @TableField("authorized_company")
    String authorizedCompany      ;//授权公司
    Integer status                 ;//状态
    @TableField("publish_to")
    String publishTo              ;//产品类型

}
