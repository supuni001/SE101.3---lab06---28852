package com.mycompany.p33;

public class circle extends shape
{
    private float radius;
    public circle(float r)
    {
        radius=r;
    }
    public float calculateArea()
    {
        return 3.141*radius*radius;
    }
}
