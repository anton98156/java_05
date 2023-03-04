//  * Написать метод, определяющую правильность расстановки скобок в выражении.
//  * Могут содержаться следующие скобки: ()[]{}<>
//  * () -> true
//  * []{}((<>)) -> true
//  * ) -> false
//  * [) -> false
//  * []{}(<)> -> false

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class pro {
    public static void main(String[] args) {

        String brackets = "()}";
        System.out.println(isCorrectBrackets(brackets));
    }      
    private static boolean isCorrectBrackets(String brackets){

        ArrayList<Character> openedBrackets = new ArrayList<Character>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                openedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == '{') {
                    openedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == '[') {
                openedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == '<') {
                openedBrackets.add(brackets.charAt(i));
            }
        }

        ArrayList<Character> closedBrackets = new ArrayList<Character>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == ')') {
                closedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == '}') {
                closedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == ']') {
                closedBrackets.add(brackets.charAt(i));
            }
            else if (brackets.charAt(i) == '>') {
                closedBrackets.add(brackets.charAt(i));
            }
        }

        System.out.println(openedBrackets);
        System.out.println(closedBrackets);

        // код ниже не доработан, просто набросок
        Map<Character, Character> matchingBrackets = new HashMap<>();
        if (openedBrackets.size() == closedBrackets.size()) {
            while (openedBrackets.contains('(') && closedBrackets.contains(')')) {
                matchingBrackets.put('(', ')');
                int x = openedBrackets.indexOf('(');
                int y = closedBrackets.indexOf(')');
                openedBrackets.remove(x);
                closedBrackets.remove(y);
            }
            System.out.println(matchingBrackets);
        }

        return false;
    }
}
