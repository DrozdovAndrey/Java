package OOP_HomeworkThree;


public class LikeNode<E> {
    E element;
    LikeNode<E> next;

    public LikeNode(E element, LikeNode<E> next) {
        this.element = element;
        this.next = next;
    }

}
