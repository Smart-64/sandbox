package string;

public class StringExample {
    public static void main(String[] args) {
        String str = "str";
        String str1 = new String("str");
        System.out.println(str == str1); // false

        String str2 = str1.intern();
        System.out.println(str == str2); // true
    }
}
