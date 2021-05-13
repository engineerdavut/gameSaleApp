package com.company;

public class CampaignManager implements CampaignService{
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " adlı kampanyamız yüzde "+ campaign.getDiscount()+
                 " indirim oranıyla eklenmiştir.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " adlı kampanyamız yüzde "+ campaign.getDiscount()+
                " indirim oranıyla güncellenmiştir.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " adlı kampanyamız yüzde "+ campaign.getDiscount()+
                " indirim oranıyla silinmiştir..");
    }
}
