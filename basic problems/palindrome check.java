import java.util.*;
public class chatjava {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = sc.nextInt();
       if(num<0){
        System.out.println("not palindrom");
        return;
       }
      int n = num;
      int rev =0;
      while(n >0){
        int lastdigit = n%10;
       
        rev = rev*10 +lastdigit; 
        n = n/10;

      }
      if(rev == num){
        System.out.println("palindrom");
      }else{
        System.out.println("not palindrom");
      }
}
 }
