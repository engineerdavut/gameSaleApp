package com.company;

public class UserManager implements UserService{
    private UserCheckService userCheckService;
    public  UserManager(UserCheckService userCheckService){
        this.userCheckService=userCheckService;
    }

    @Override
    public void add(User user) {
        if(userCheckService.UserCheckIfRealPerson(user)){
            System.out.println( user.getFirstName()+ " başarı ile kaydoldunuz. ");
        }else{
            System.out.println("böyle biri yok,lütfen bilgileri doğru girin . ");
        }

    }

    @Override
    public void update(User user) {
        System.out.println( user.getFirstName()+ " başarı ile bilgileriniz güncellendi. ");
    }

    @Override
    public void delete(User user) {
        System.out.println( user.getFirstName()+ " kaydınız silindi.. ");
    }
}
