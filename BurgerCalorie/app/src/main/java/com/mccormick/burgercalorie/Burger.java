package com.mccormick.burgercalorie;

public class Burger {
    static final int BEAN = 100;
    static final int BEYOND = 170;
    static final int PORTA = 150;
    static final int ONIONS = 90;
    static final int AVO = 120;
    static final int CHEESE = 115;

    private int mPattyCal;
    private int mCheeseCal;
    private int mOnionsCal;
    private int mSauceCal;

    public Burger(){
        mPattyCal = BEAN;
        mCheeseCal = CHEESE;
        mOnionsCal = 0;
        mSauceCal = 0;
    }

    public void setPattyCalories(int calories){mPattyCal = calories;}
    public void setCheeseCalories(int calories){mCheeseCal = calories;}
    public void setOnionsCal(int calories){mOnionsCal = calories;}
    public void clearOnionsCal(){mOnionsCal = 0;}
    public void setSauceCalories(int calories){mSauceCal = calories;}
    public int getTotalCalories(){return mPattyCal + mCheeseCal + mOnionsCal + mSauceCal;}
}
