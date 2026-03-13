public class Example1 {
    public static void main(String[] args){
        String name5="Vaishnavi";
        System.out.println(name5.length()); //no.of characters

        String name3="java programming";
        System.out.println(name3.toUpperCase()); //all to upper

        String name4 ="JAVA";
        System.out.println(name4.toLowerCase()); //all to lower

        String n="Hello,Character";
        System.out.println(n.startsWith("H")); //returns boolean value (true for starting with "H" else false)

        String String1 = "Java";
        String String2 ="Java";
        System.out.println(String1.equals(String2)); //checking content equality

        String name1="Programming";
        System.out.println(name.charAt(3)); //retrieving character from a location

        String name2="Programming";
        System.out.println(name2.substring(0,4));

        String str="I like Java";
        System.out.println(str.replace("Java","Python"));

        String str5=" Hello World ";
        System.out.println(str5.trim()); //remove start and end white spaces

        String str6="Hello World";
        String str7=str6.replace(" ","");
        System.out.println(str7.length());

        StringBuilder str =new StringBuilder("Hello");
        str.append("World"); //Add
        System.out.println(str);
        System.out.println(str.insert(5,"Java")); //Insert at a location

        StringBuilder str9=new StringBuilder("hello");
        System.out.println(str9.deleteCharAt(1)); //Delete a character at a specified position

        StringBuilder str10=new StringBuilder("Java");
        System.out.println(str10.reverse());

        StringBuilder str11=new StringBuilder("HelloWorld");
        System.out.println(str11.replace(0,5,"Java"));
 }
}
