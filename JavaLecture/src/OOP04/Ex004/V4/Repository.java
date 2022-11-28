package OOP04.Ex004.V4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> implements Iterable<T>{
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    public void merge(Repository<T> repo){
        for (int i = 0; i < repo.count(); i++) {
            this.add(repo.get(i));
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count = 0;
            @Override
            public boolean hasNext() {
                return count< ds.size();
            }

            @Override
            public T next() {
                return ds.get(count++);
            }
        };
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
