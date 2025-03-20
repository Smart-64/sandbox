package innotech;

public class Main {
    public static void main(String[] args) {
//        Данная строка, написать алгоритм сжатия за один проход O(N)
//        aaabbcccddf -> a3b2c3d2f
//        acggjtttta -> acg2jt4a

        System.out.println(compress("acggjtttta"));
        System.out.println(compress("aaabbcccddf"));
    }

    public static String compress(String input) {
        if (input == null) {
            throw new RuntimeException("Пустая строка");
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        int left = 0;
        int right = 1;

        // aaabbcccddf
        while (right < input.length()) {

            if (input.charAt(left) == input.charAt(right)) {
                count = count + 1;
            } else {
                if (count > 1) result.append(input.charAt(left) + "" + count);
                if (count == 1) result.append(input.charAt(left));
                left = right;
                count = 1;
            }

            if (right + 1 != input.length()) {
                right = right + 1;
            } else {
                if (count > 1) result.append(input.charAt(left) + "" + count);
                if (count == 1) result.append(input.charAt(left));
                break;
            }
        }

        return result.toString();
    }
}

