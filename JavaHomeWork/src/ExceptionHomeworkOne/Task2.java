package ExceptionHomeworkOne;

public class Task2 {
//    ���������� �����, ����������� � �������� ���������� ��� ������������� �������,
//    � ������������ ����� ������, ������ ������� �������� ����� �������� ��������� ���� ��������
//    �������� � ��� �� ������. ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������.
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        arrayDifElement(arr1,arr2);
    }
    public static int[] arrayDifElement(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) {
            throw new RuntimeException("length of arrays not same");

        }
        int[]arrDif = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrDif[i] = arr1[i]-arr2[i];
        }
        return arrDif;
    }
}
