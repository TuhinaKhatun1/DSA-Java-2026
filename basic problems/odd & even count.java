import java.util.*;
public class chatjava {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the numsber: ");
       int num = sc.nextInt();
       int oddcount=0;
       int evencount =0;
       int totalcount =0;
       int sum =0;
        int lastdigit =0;
       while(num>0){
        lastdigit =num%10;
        
         
        if(lastdigit%2 ==0 ){
            evencount ++;
        }else{
            oddcount ++;
        }
      num =num/10;
         sum += lastdigit;
        totalcount++;
        
    
       }
       
       System.out.println("Total digits: "+ totalcount);
        System.out.println("Even digits: " + evencount);
         System.out.println("odd digits: " + oddcount);
          System.out.println("sum : " + sum);
}
 }
