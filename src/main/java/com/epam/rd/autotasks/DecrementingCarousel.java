package com.epam.rd.autotasks;

public class DecrementingCarousel {

    public static int capacity;
    public int count;
    public static int counts;
    public boolean runBe=false;
    static int element2;
    public static int [] decrementingCarousel;


    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        decrementingCarousel = new int [capacity];
    }

    public boolean addElement(int element){
        if (element<=0 || count==capacity || runBe) return false;
        else {
            element2=element;
            decrementingCarousel[count] = element2;
            count++;
            counts=count;
            return true;}
    }

    public CarouselRun run(){
        if (runBe) {return null;}
        else {
        runBe=true;
        return new CarouselRun();}
    }
}
