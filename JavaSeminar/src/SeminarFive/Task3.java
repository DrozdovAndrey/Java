package SeminarFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
�������� ���������, ������������ ������������ ����������� ������ � ���������.
������ 1: a+(d*3) - ������
������ 2: [a+(1*3) - ����
������ 3: [6+(3*3)] - ������
������ 4: {a}[+]{(d*3)} - ������
������ 5: <{a}+{(d*3)}> - ������
������ 6: {a+]}{(d*3)} - ����
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
