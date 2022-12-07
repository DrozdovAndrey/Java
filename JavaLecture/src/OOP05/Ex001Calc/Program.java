package OOP05.Ex001Calc;

import OOP05.Ex001Calc.Model.SumModel;
import OOP05.Ex001Calc.Presenter.Presenter;
import OOP05.Ex001Calc.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter( new View());
        p.buttonClick();

    }
}
