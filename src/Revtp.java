import java.util.Scanner;
public class Revtp {
    /*
    UC9.0git add
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String input=sc.nextLine();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev+=input.charAt(i);
        }
        System.out.println("the reversed string is: ");
        System.out.println(rev);
        boolean isPalindrome=input.equals(rev);
        System.out.println(isPalindrome);
    }
}
