package OOPSeminar4;

public class Program {
    public static void main(String[] args) {
        Commander commander1 = new Commander("Jonh", new Staff(), 150);
        Commander commander2 = new Commander("Billy", new Bow(), 150);
        Team<Archer> teamArcher = new Team<>(commander1);
        teamArcher.add(new Archer("Bobbie", new Bow(), 100, 50));
        teamArcher.add(new Archer("Lamie", new LongBow(), 100, 50));
        teamArcher.add(new Archer("Ralf", new Bow(), 100, 50));
        Team<Warrior> teamWarrior = new Team<>(commander2);
        teamWarrior.add(new Archer("Bany", new Bow(), 100, 50));
        teamWarrior.add(new Mage("Moguchiy", new Staff(), 100, 80, 45));
        System.out.println(teamWarrior);
        System.out.println(teamArcher);
        System.out.println(teamArcher.getTeamHP());
        System.out.println(teamWarrior.getTeamHP());
    }
}
