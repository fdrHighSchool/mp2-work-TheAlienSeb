  public static void isLeapYear(int x){
    if(x%4 == 0){
      
      if(x%100 == 0){

        if(x%400 == 0){
          System.out.println("is a leap year");
        } else {
          System.out.println("is not a leap year");
        }
        
      } else{
        System.out.println("is a leap year");
      }
      
    } else {
      System.out.println("is not a leap year");
    }
  }
