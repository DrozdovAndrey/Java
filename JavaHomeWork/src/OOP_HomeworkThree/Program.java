package OOP_HomeworkThree;

public class Program {
    public static void main(String[] args) {
        LikeLinkedList<Integer> llk = new LikeLinkedList<>();
        llk.add(1);
        llk.add(2);
        llk.add(18);
        llk.add(3);
        for(Integer ln : llk){
            System.out.println(ln.toString());
        }
        System.out.println("size: " + llk.getSize());
    }
}
