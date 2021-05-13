package com.company;

public class MernisServiceAdapter implements UserCheckService{
    @Override
    public boolean UserCheckIfRealPerson(User user) {
        if(user.getNationalityId().length()==11){
            return true;
        }else{
            return false;
        }

    }
}
