//  * Написать метод, определяющую правильность расстановки скобок в выражении.
//  * Могут содержаться следующие скобки: ()[]{}<>
//  * () -> true
//  * []{}((<>)) -> true
//  * ) -> false
//  * [) -> false
//  * []{}(<)> -> false


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Write line: ");
        String s1 = iScanner.nextLine();
        System.out.println("Write line: ");
        String s2 = iScanner.nextLine();
        iScanner.close();
        System.out.println(isIsomorphic (s1, s2));
    }      
    public static boolean isIsomorphic(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.putIfAbsent(s1.charAt(i), s2.charAt(i));
        }
        System.out.println(map);
        // List<Character> check = new ArrayList<>(10);
        // for (int i = 0; i < s1.length(); i++) {
        //     Character temp = s1.charAt(i);
        //     check.add(i, temp);
        // }
        // System.out.println(check);
        return false;
    }  
}      
//     public static boolean isIsomorphic(String s1, String s2) {
//         Map<Character, Character> map = new HashMap<>();
//         if (s1.length() == s2.length()) {
//             for (int i = 0; i < s1.length(); i++) {
//                 Character temp = s1.charAt(i);
//                 System.out.println(temp);
//                 if (temp != null && !temp.equals(s2.charAt(i))) {
//                     return false;
//                 }
//             }
//             System.out.println(map);
//             return true;
//         } 
//         else {
//             return false;
//         }
//     }
// }

// private static boolean isCorrectParentheses(String parentheses){
// // парсим текст на слова
// // печатаем слова в порядке возрастания длины
// throw new UnsupportedOperationException();
// }