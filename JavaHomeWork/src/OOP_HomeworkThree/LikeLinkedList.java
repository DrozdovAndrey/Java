package OOP_HomeworkThree;

import java.util.Iterator;

public class LikeLinkedList<E> implements Iterable<E>{

    private LikeNode<E> first;
    private LikeNode<E> last;

    public int getSize() {
        return size;
    }

    private int size;

    public LikeLinkedList() {

        this.last = null;
        this.size = 0;
    }

    public void add(E e) {
        LikeNode<E> l = last;
        LikeNode<E> newLikeNode = new LikeNode<>( e, null);
        last = newLikeNode;
        if (l == null)
            first = newLikeNode;
        else
            l.next = newLikeNode;
        size++;
    }






    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            public LikeNode<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E item = current.element;
                current = current.next;
                return item;
            }
        };
    }
}
