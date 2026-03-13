import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        /*String str1 ="Hi";
        String str2="hi";
        String str3="Hi";
        String str4="py";
        //System.out.println(str1.equals(str4));
        System.out.println(str1.compareTo(str4));*/

        /*StringBuffer S1=new StringBuffer("java");
        System.out.println(S1);

        System.out.println(S1.append("program"));

        System.out.println(S1.reverse());

        System.out.println(S1.replace(0,S1.length(),"Python"));*/

        /*StringBuilder S2 = new StringBuilder("java");
        System.out.println(S2);

        System.out.println(S2.append("program"));

        System.out.println(S2.reverse());

        System.out.println(S2.replace(0,S2.length(),"python"));*/

        /*String s="User Student";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));*/

        /*for(int i=0;i<26;i++){
            System.out.println((char)('A'+i)+"->"+('A'+i));*/

        /*for(int i=0;i<26;i++){
            System.out.println((char)('a'+i)+"->"+('a'+i));*/

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);

        if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
            System.out.println(ch + "is an alphabet");

        else if((ch >=48 && ch<=57))
            System.out.println(ch + "is a digit");

        else
            System.out.println(ch + "is a special character");*/


 //Project 1
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name= sc.nextLine();
        if(name.contains(" "))
            System.out.println("Invalid..Enter a valid username!");
        else
            System.out.println("Valid username");*/

//Project 2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email id : ");
        String name= sc.nextLine();
        int index=name.indexOf("@");
        System.out.println(name.substring(index+1,name.length()));*/

//Project 3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password :");
        String password =sc.nextLine();
        if(password.length()>=8)
            System.out.println("Password accepted");
        else
            System.out.println("Password too short");*/

 //Project 4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Hello"+ name +",Welcome to the platform!");*/

//Project 5
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product category");
        String Product_c=sc.nextLine();
        System.out.println(Product_c.charAt(0));*/

//Project 6
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the feedback:");
        String feedback=sc.nextLine();
        if(feedback.contains("Java"))
            System.out.println("Java Found");
        else
            System.out.println("Java not found");*/

        //Project 7
        /*Scanner sc=new Scanner(System.in);
        System.out.println("The name is:");
        String name =sc.nextLine();
        System.out.println(name.trim());*/

//Project 8
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the content :");
        String content =sc.nextLine();
        System.out.println(content.replace("bad","good"));*/



//Project 9
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
String name = sc.nextLine();
int count=0;
for( int i=0;i<name.length();i++) {
    if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') { // if lowercase 'a' and 'z'
        count++;
    }
}
    System.out.println(count);*/

//Project 10
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter the content:");
String name = sc.nextLine();
int count=0;
for( int i=0;i<name.length();i++) {
    if (name.charAt(i) >= '0' && name.charAt(i) <= '9') { // if lowercase 'a' and 'z'
        count++;
    }
}
System.out.println(count);*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String string=sc.nextLine();
        int count=0;
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
            }
        }
        System.out.println(count);*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String string=sc.nextLine();
        String result= string.replaceAll("[AEIOUaeiou]","");
        System.out.println(result);*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the link:");
        String string = sc.nextLine();
        int index = string.indexOf('/');
        System.out.println(string.substring(index+1,string.length()));*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter OTP:");
        String input=sc.nextLine();
        String otp="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(i)){
                otp=otp+ch;
            }
        }
        System.out.println(otp);*/

        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the message:");
        String message=sc.nextLine();
        if(message.contains("spam"))
            System.out.println(message.replace("spam","****"));
        else
            System.out.println("No change needed");*/







    }


        }


