package com.epam.rd.autotasks;

//import java.util.Arrays;

public class CarouselRun {

   int capacity;
   public int count;
   public static int [] decrementingCarousel;

  public CarouselRun() {

      capacity = DecrementingCarousel.capacity;
      count=0;
      for (int i=0; i<capacity; i++){
          if (DecrementingCarousel.decrementingCarousel[i]!=0) {
              count++;
          }
      }

     decrementingCarousel=new int[count];
      System.arraycopy(DecrementingCarousel.decrementingCarousel, 0, decrementingCarousel, 0, count);
      capacity=count;
      count=0;
      //System.out.println(capacity);
  }

    public int next() {

        //System.out.println(Arrays.toString(decrementingCarousel));
        int summa=0;
        for (int a:decrementingCarousel){
            summa+=a;}
        //System.out.println(summa);
        if (summa==0) return (-1);
        else{
            if (decrementingCarousel[count]==0){
            if (count!=(capacity-1)) {count++;}
            else count =0;  }

        int carouselDouble2 =decrementingCarousel[count];
        decrementingCarousel[count]=decrementingCarousel[count]-1;

        if (count!=(capacity-1)) {count++;}
        else count =0;

        if (decrementingCarousel[count]==0){
           summa=0;
           for (int a:decrementingCarousel){
               summa+=a;}
           if (summa!=0){
               while (decrementingCarousel[count]==0 ) {
                   if (count!=(capacity-1)) {count++;}
                   else count =0;
               }
           }
        }
        return carouselDouble2;}
    }

    public boolean isFinished() {
        int summa=0;
        for (int a:decrementingCarousel){
            summa+=a;}
        // DecrementingCarousel.runBe=true;
        return summa == 0;
    }

}
