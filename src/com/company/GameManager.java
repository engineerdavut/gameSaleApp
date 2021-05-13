package com.company;

public class GameManager implements GameService{
    @Override
    public void add(Game game) {
        System.out.println(game.getName()+ " oyunumuz "+ game.getPrice()+" fiyatıyla "
                +game.getBroadcastingDate()+ " tarihinde yayınlamıştır.(eklenmiştir)");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName()+ " oyunumuz "+ game.getPrice()+" fiyatıyla "
                +game.getBroadcastingDate()+ " tarihinde güncellenmiştir.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+ " oyunumuz silinmiştir.");
    }
}
