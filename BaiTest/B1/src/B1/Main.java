import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();

        boolean unique = checkUniqueLetters(input);
        System.out.println("Chuỗi có mỗi ký tự chữ cái chỉ xuất hiện 1 lần? " + unique);

        long countSpaces = input.chars().filter(ch -> ch == ' ').count();
        System.out.println("Số ký tự khoảng trắng: " + countSpaces);

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }

    public static boolean checkUniqueLetters(String str) {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }
        return true;
    }
}
