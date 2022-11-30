package OOPSeminar4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private Commander commander;
    private List<T> teamList = new ArrayList<>();

    public Team(Commander commander) {
        this.commander = commander;
    }

    public void add(T hero){
        teamList.add(hero);
    }

    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(commander.toString() + "\n");
        for (T hero:this) {
            sb.append(hero.toString() + "\n");
        }
        return sb.toString();
    }
    public int getTeamHP(){
        int sum = commander.getHealthPoint();
        for (T hero:this) {
            sum+= hero.getHealthPoint();
        }
        return sum;
    }
}
