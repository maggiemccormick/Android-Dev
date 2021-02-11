package com.mccormick.fibonnaciflowerapp;

import androidx.constraintlayout.solver.GoalRow;

public class Flower {

    public final double GOLDEN_RATIO = 0.618033989;
    public final double GROWTH_WIDTH = 0.03 * GOLDEN_RATIO;
    public final double GROWTH_HEIGHT = 0.03 * GOLDEN_RATIO;

    // PETAL ATTRIBUTES
    private double angle;
    private int rotate;
    private float scaleX;
    private float scaleY;
    private int xCenter;
    private int yCenter;
    private float degenerate;

    public Flower(){
        rotate = 0;
        scaleX = (float) 0.3;
        scaleY = (float) 0.3;
        degenerate = (float) 1.001;
        angle = 360 * GOLDEN_RATIO;
    }

    public void initialize(){
        // TASK 1: INITIALIZE THE SETTINGS FOR THE FIRST FLOWER PETAL
        rotate = 0;
        scaleX = (float) 0.3;
        scaleY = (float) 0.3;
        degenerate = (float) 1.001;
        angle = 360 * GOLDEN_RATIO;
    }

    // SETTER AND GETTER METHODS
    public float getScaleX(){return scaleX;}
    public void setScaleX(float scale){scaleX = scale;}
    public float getScaleY(){return scaleY;}
    public void setScaleY(float scale){scaleY = scale;}
    public void setRotate(int rot){rotate = rot;}
    public int getRotate(){return rotate;}
    public void set_xCenter(int x){xCenter = x;}
    public int get_xCenter(){return xCenter;}
    public void set_yCenter(int y){yCenter = y;}
    public int get_yCenter(){return yCenter;}
    public void setDegenerate(float deg){degenerate = deg;}

    public void initializeAngle(){angle = 360 * GOLDEN_RATIO;}

    public void updatePetalValues(){
        rotate += angle;
        scaleX += scaleX * GROWTH_WIDTH;
        scaleY += scaleY * GROWTH_HEIGHT;
        angle *= degenerate;
    }
}