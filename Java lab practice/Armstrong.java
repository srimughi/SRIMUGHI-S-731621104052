import java.util.*;
public class Armstrong{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n ;
    int num = 0;

    while(temp > 0){
    num ++;
    temp/= 10;
   }
    int sum = 0;
    while(temp > 0 ){
       int digit = temp % 10;  
       int power = 1;
       for(int i = 0; i<num ; i++){
           power*= digit;
      }
       sum+= power;
       temp/= 10;
}
if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
