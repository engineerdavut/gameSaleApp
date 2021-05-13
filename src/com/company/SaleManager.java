package com.company;

public class SaleManager implements  SaleService{
    private double discountedPrice;
    public void CampaignSale(User user,Game game,Campaign campaign){
        discountedPrice= game.getPrice()- (game.getPrice() * campaign.getDiscount() / 100);
        System.out.println(user.getFirstName()+" adli kullanici " + game.getName()+ " oyununu "
                + campaign.getCampaignName()+ " kampanyasıyla "+ discountedPrice + " tl ile satın aldı.");

    }
    public void Sale(User user,Game game){
        System.out.println(user.getFirstName() +" adli kullanici "+ game.getName()+ " oyununu "
                + game.getPrice() + " tl ile satın aldı.");
    }

}
