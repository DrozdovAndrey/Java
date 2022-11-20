package OOP02.Ex003;

import OOP02.Ex003.alliance.Dwarf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        // #region
        BaseHero dh = new Druid();
        /*BaseHero*/
        Dwarf dwarf = new Dwarf();
        dwarf.dwarf_method();
        //((Dwarf)dwarf).dwarf_method();
        System.out.println(dwarf.name);
        // #endregion
    }

}
