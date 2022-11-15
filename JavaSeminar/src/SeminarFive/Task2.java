package SeminarFive;

import java.util.HashMap;
import java.util.Map;

/*
���� 2 ������, �������� �����, ������� ������ true, ���� ��� ������ �������� ����������� � false,
���� ���. ������ ���������, ���� ���� ����� � ������ ����� ����� �������� �� ��������� ����� �� ������ �����, ��� ����
������������� ����� ������ ����� �������� �� ���� � �� �� ����� � ����������� ������� ����������. (��������, add - egg ���������)
����� ����� �� ��������, � �������� ����� ��. (��������, note - code)
������ 1:
Input: s = "foo", t = "bar"
Output: false
������ 2:
Input: s = "paper", t = "title"
Output: true
 */
public class Task2 {
    public static Boolean checkSymbol (String word1, String word2){
        Map<String, String> map = new HashMap<>();
        if (word1.length()!=word2.length()) return false;
        var wordArr1 = word1.split("");
        var wordArr2 = word2.split("");
        for (int i = 0; i < wordArr1.length; i++) {
            if(map.containsKey(wordArr1[i])){
                if(!map.get(wordArr1[i]).equals(wordArr2[i])) return false;
            }else {
                map.put(wordArr1[i], wordArr2[i]);
            }
        }
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkSymbol("paper", "title"));
        System.out.println(checkSymbol("paper", "tille"));
        System.out.println(checkSymbol("papper", "tittle"));
        System.out.println(checkSymbol("paperrrrr", "titleeeee"));
        System.out.println(checkSymbol("foo", "bar"));
        System.out.println(checkSymbol("paper", "titleeee"));
        System.out.println(checkSymbol("paaaaaper", "title"));
    }
}
