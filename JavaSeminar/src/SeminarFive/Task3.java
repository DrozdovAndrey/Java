package SeminarFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */
public class Task3 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String equation = "a+(d*3)";
        Map<Character, Character> chars = new HashMap<>();
        chars.put('}', '{');
        chars.put(')', '(');
        chars.put(']', '[');
        chars.put('>', '<');

        boolean t = true;
        for (int i = 0; i < equation.length(); i++) {
            if(chars.containsValue(equation.charAt(i))){
                st.add(equation.charAt(i));
            } else if (chars.containsKey(equation.charAt(i))){
                char a = st.pop();
                if (a != chars.get(equation.charAt(i)) || !st.isEmpty()){
                    t = false;
                    break;
                }
            }
        }
        if(t){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
