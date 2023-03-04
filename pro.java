//  * Написать метод, определяющую правильность расстановки скобок в выражении.
//  * Могут содержаться следующие скобки: ()[]{}<>
//  * () -> true
//  * []{}((<>)) -> true
//  * ) -> false
//  * [) -> false
//  * []{}(<)> -> false

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class pro {
    public static void main(String[] args) {
        Collection<String> parentheses = List.of("(", ")", "{}", "[", "]");

        String collect = parentheses.stream().collect(Collectors.joining("<>"));
        System.out.println(collect);

        System.out.println(isCorrectParentheses (collect));
    }      
    private static boolean isCorrectParentheses(String collect){
        Map<Character, Character> db = new HashMap<>();
        for (int i = 0; i < collect.length(); i++){
            Character temp = collect.charAt(i);
        }
        return false;

        // парсим текст на слова
        // печатаем слова в порядке возрастания длины
        
        // throw new UnsupportedOperationException();
    }
}