package day10;

public class fun {
    public static void main(String[]args){
        String name=new String("hello world");
        StringBuilder name1=new StringBuilder("helloo");
        String name2=name.toString();
        String name3=name.toString();
        System.out.println(name2.equals(name3));
        System.out.println(name.replace('h','S'));
        System.out.println(name.replaceAll("hello","hi"));
        System.out.println(name.contains("helloo"));
        String str="apple,grapes,banana";
        String[]fruits = str.split(",");
        StringBuilder name4=new StringBuilder("hiii");
        name4.append(" spidey");
        name4.insert(4,100);
        System.out.println(name4);
        name4.replace(0,4,"spideyyyyy");
        System.out.println(name4);
    }
}

