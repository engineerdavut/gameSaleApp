package com.company;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
	// write your code here
        UserManager userManager=new UserManager(new MernisServiceAdapter());
        User user=new User(1,"mehmet","yalın","45356352424",
                "mehmetyalin@contact.com","yalin1234",new Date(29/9/1998));
        User user1=new User(2,"pelin","duz","453563524",
                "pelinduz@contact.com","pelin1234",new Date(29/9/1999));
        userManager.add(user);
        userManager.add(user1);
        userManager.update(user);
        userManager.delete(user);
        userManager.add(user);

        CampaignManager campaignManager=new CampaignManager();
        Campaign campaign=new Campaign(1,"yaz sezonu",30,new Date(29/9/2021));
        Campaign campaign1=new Campaign(2,"kıs sezonu sezonu",25,new Date(29/3/2021));
        campaignManager.add(campaign);
        campaignManager.update(campaign);
        campaignManager.delete(campaign);
        campaignManager.add(campaign1);
        campaignManager.update(campaign1);
        campaignManager.delete(campaign1);
        campaignManager.add(campaign);
        campaignManager.add(campaign1);

        GameManager gameManager=new GameManager();
        Game game=new Game(1,"GTA 8","gta oyunu",799,new Date(29/3/2025));
        Game game1=new Game(2,"pes 2023","pes oyunu",1500,new Date(29/3/2023));
        gameManager.add(game);
        gameManager.update(game);
        gameManager.delete(game);
        gameManager.add(game1);
        gameManager.update(game1);
        gameManager.delete(game1);
        gameManager.add(game);
        gameManager.add(game1);
        SaleManager saleManager=new SaleManager();
        saleManager.Sale(user,game);
        saleManager.Sale(user1,game1);
        saleManager.CampaignSale(user1,game,campaign);
        saleManager.CampaignSale(user,game1,campaign1);

    }

}
