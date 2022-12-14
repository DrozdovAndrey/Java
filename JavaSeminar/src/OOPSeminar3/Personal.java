package OOPSeminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Personal implements Iterable<User>{
    private List<User> users = new ArrayList<>();


    public Personal(List<User> users) {
        this.users = users;
    }


    @Override
    public Iterator<User> iterator() {
        Iterator<User> it = new Iterator<User>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }

        };
        return it;

    }


    public int size() {
        return users.size();
    }
}
