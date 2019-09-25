package com.ted.mailbox;

public class BoxTester {
    float length;
    float width;
    int height;
    //box3 Box3: 長23，寬14，高13 (cm)
    public boolean validate(float length, float width, int height) {
        this.length=length;
        this.width=width;
        this.height=height;

        if(length<=23 && width <=14 && height<=13){
            System.out.println("box3");
        }else if (length<=39.5 && width <=27.5 && height<=23){
            System.out.println("box5");
        }else{
            System.out.println("your box not according to mailbox size");
        }
        return false;
    }
    //when的寫法是??
    //box5 Box5: 長39.5，寬27.5，高23 (cm)
//    public boolean validate1(float length, float width, int height) {
//        this.length=length;
//        this.width=width;
//        this.height=height;
//        if(length<=39.5 && width <=27.5 && height<=23){
//            System.out.println("box5");
//        }else {
//            System.out.println("your box no fit this size");
//        }
//
//        return false;
//    }


}
