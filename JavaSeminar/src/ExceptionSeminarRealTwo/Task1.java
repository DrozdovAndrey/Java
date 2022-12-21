package ExceptionSeminarRealTwo;

public class Task1 {
    public static void main(String[] args) {
        String [][] arr = {{null, "0", "d"},{"1", "0", "2"},{"1", "a", "2"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isInt(arr[i][j])){
                    val = Integer.parseInt(arr[i][j]);
                } else if (arr[i][j]==null) {
                    val = 0;
                } else val = 0;
                sum+= val;

            }
        }
        return sum;
    }
    public static boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
