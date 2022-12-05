# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`


  * **YOUR WRITING HERE**
  
 Since a prime is any positive odd integer greater than 1 only divisible by 1 and itself. 
 So we can run a for loop to divide the integer by an incrementing I and if it finishes the for loop and doesnt give a remainder of 0 when modulo by I it is a prime number. 11 follows this case, and 23 also follows this case.
 
 public static boolean(int n){
    for(int = 2; i<n; i++){
       if(n%i == 0){
       return false;
       }
       
       
       return true;
 }
