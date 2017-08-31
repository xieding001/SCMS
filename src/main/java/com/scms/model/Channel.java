package com.scms.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xieding001 on 2017/8/28.
 */
@Entity
@Table(name="channel")
public class Channel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="channel_id")
    private int channelID;
    @Column(name="site_id")
    private int siteID;
    @Column(name="channel_name")
    private String channelName;
    @Column(name="display_name")
    private String displayName;
    @Column(name="description")
    private String description;
    @Column(name="patent_channel_id")
    private int parentChannelID;
    @Column(name="sort_no")
    private int sortNO;
    @Column(name="depository")
    private String depository;
    @Column(name="URL")
    private String URL;
    @Column(name="flag")
    private int flag;
    @Column(name="hitcount")
    private int hitcount;
    @Column(name="create_id")
    private String createID;
    @Column(name="create_name")
    private String createName;
    @Column(name="create_date")
    private Timestamp createDate;
    @Column(name="create_ip")
    private String createIP;
    @Column(name="last_update_id")
    private String updateID;
    @Column(name="last_update_name")
    private String updateName;
    @Column(name="last_update_date")
    private Timestamp updateDate;
    @Column(name="last_update_ip")
    private String updateIP;


    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public int getSiteID() {
        return siteID;
    }

    public void setSiteID(int siteID) {
        this.siteID = siteID;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentChannelID() {
        return parentChannelID;
    }

    public void setParentChannelID(int parentChannelID) {
        this.parentChannelID = parentChannelID;
    }

    public int getSortNO() {
        return sortNO;
    }

    public void setSortNO(int sortNO) {
        this.sortNO = sortNO;
    }

    public String getDepository() {
        return depository;
    }

    public void setDepository(String depository) {
        this.depository = depository;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getHitcount() {
        return hitcount;
    }

    public void setHitcount(int hitcount) {
        this.hitcount = hitcount;
    }

    public String getCreateID() {
        return createID;
    }

    public void setCreateID(String createID) {
        this.createID = createID;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getCreateIP() {
        return createIP;
    }

    public void setCreateIP(String createIP) {
        this.createIP = createIP;
    }

    public String getUpdateID() {
        return updateID;
    }

    public void setUpdateID(String updateID) {
        this.updateID = updateID;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateIP() {
        return updateIP;
    }

    public void setUpdateIP(String updateIP) {
        this.updateIP = updateIP;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelID=" + channelID +
                ", siteID=" + siteID +
                ", channelName='" + channelName + '\'' +
                ", DisplayName='" + displayName + '\'' +
                ", Description='" + description + '\'' +
                ", parentChannelID=" + parentChannelID +
                ", sortNO=" + sortNO +
                ", depository='" + depository + '\'' +
                ", URL='" + URL + '\'' +
                ", flag=" + flag +
                ", hitcount=" + hitcount +
                ", createID='" + createID + '\'' +
                ", createName='" + createName + '\'' +
                ", createDate=" + createDate +
                ", createIP='" + createIP + '\'' +
                ", updateID='" + updateID + '\'' +
                ", updateName='" + updateName + '\'' +
                ", updateDate=" + updateDate +
                ", updateIP='" + updateIP + '\'' +
                '}';
    }
}
