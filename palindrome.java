package LocolDemo;

public class palindrome {
    
        static int reverseNumber(int n){
            int reverseNo=0;
            while(n>0){
                reverseNo=reverseNo*10+n%10;
                n=n/10;
            }
            return reverseNo;
        }
    
    public static void main(String[] args){
        int n=123455;
        int reverseN=reverseNumber(n);
        System.out.println("Reverse of n = "+reverseN);

        if(n==reverseN){
            System.out.println("Palindrome=yes");

        }
        else
        System.out.println("palindrome=no");
    }
}
