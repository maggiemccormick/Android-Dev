package com.mccormick.eatcookie;

public class CookieMonster {
    private boolean isHungry;

    public CookieMonster(){isHungry = true;}
    public void changeStatus(){isHungry = !isHungry;}
    public boolean getStatus(){return isHungry;}
}
