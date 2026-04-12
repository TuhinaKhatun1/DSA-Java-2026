import java.util.*;
public class chatjava {
   public static void  main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = sc.nextInt();
     if (num < 0) {
            System.out.println("Not Armstrong number");
            return;
        }
int n = num;
int count =0;
 if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }
        n = num;
int totalsum =0;

while(n>0){
   int last = n%10;
   int sum =1;
    for(int i =1; i<=count ;i++){
    sum = sum*last;
    }
    
    totalsum += sum;
     n= n/10;
}
 if (num == 0) {
            totalsum = 0;
        }
 
if(totalsum == num){
    System.out.println("armstrong number");
}else{
   System.out.println(" not armstrong number"); 
}

}
}
  
