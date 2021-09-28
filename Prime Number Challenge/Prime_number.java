import java.util.*;
public class Prime_number{    
    public static void main(String args[]){    
     int i,n,m=0,f=0; 
     System.out.println("Enter a number");     
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     m=n/2;      
     if(n==0||n==1){  
      System.out.println(n+" is not a prime number");      
     }else{  
      for(i=2;i<=m;i++){      
       if(n%i==0){      
        System.out.println(n+" is not a prime number");      
        f=1;      
        break;      
       }      
      }      
      if(f==0)  { System.out.println(n+" is a prime number"); }  
     }//end of else  
   } 
}   