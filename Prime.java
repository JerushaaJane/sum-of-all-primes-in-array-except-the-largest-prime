import java.util.*;
public class Prime {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int ip2=sc.nextInt(); //no of elems in array
      int[]a=new int[ip2];
      for(int i=0;i<ip2;i++){
          a[i]=sc.nextInt();
          //System.out.println(a[i]);
      }
      //maxPrimeOfArray(a);
      printResult(a,ip2);
      
    }
    static int checkPrime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){flag=1;break;}
        }
        if(flag==0){return 1;}
        else{return 0;}
    }
    static int maxPrimeOfArray(int[]a){
        int maxPrime=a[0];
        for(int i=0;i<a.length;i++){
            if(checkPrime(a[i])==1 && a[i]>maxPrime){
                maxPrime=a[i];
            }
        }
        return maxPrime;
    }
    static void printResult(int[]a,int ip2){
        int sum=0;
        for(int i=0;i<ip2;i++){
            int maxPrime=maxPrimeOfArray(a);
            if(checkPrime(a[i])==1 && a[i]!=maxPrime){
                //System.out.println(a[i]);
                sum=sum+a[i];
                
            }
        }
        System.out.println(sum);
    }
    
    
}
