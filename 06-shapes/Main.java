class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //Rectangle(6,3);
    rightTriangle(7);


    
  }


  public static void Rectangle(int x, int y){
    
    for(int length = 0; length < y; length++){
      
      for(int width = 0; width < x; width++){
        System.out.print("* ");
        
      }
      System.out.println();
    }
  }

  public static void rightTriangle(int x){
    String star = "* ";
    for(int i = 0; i<=x; i++){
      for(int j = 0; j<=i; j++){
        for(int g = 0; g >= x ; g++){
        System.out.print(" ");
    } 
        System.out.print(star);
    }
      System.out.println();
    }
  }
}
