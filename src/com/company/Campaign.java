package com.company;
import java.util.Date;

public class Campaign {
    private int id;
    private String campaignName;
    private double discount;

    private Date campaignEndTime;

    public Campaign(int id, String campaignName, double discount, Date campaignEndTime) {
        this.id=id;
        this.campaignName=campaignName;
        this.discount=discount;
        this.campaignEndTime=campaignEndTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getCampaignEndTime() {
        return campaignEndTime;
    }

    public void setCampaignEndTime(Date campaignEndTime) {
        this.campaignEndTime = campaignEndTime;
    }


}
