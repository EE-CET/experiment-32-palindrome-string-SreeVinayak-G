import java.util.Scanner;
public class Palindrome {
        private static boolean isPalindrome(String s){
                int n = s.length();
                int i=0;
                int j = n-1;
                while(i<j){
                        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
                        i++;
                        j--;
                }
                return true;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = isPalindrome(s);
        if(flag) System.out.println(1);
        else System.out.println(0);
    }
    
}
