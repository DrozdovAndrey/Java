package OOP05.Ex001Calc.Presenter;

import OOP05.Ex001Calc.Model.CalcModel;
import OOP05.Ex001Calc.Model.Model;
import OOP05.Ex001Calc.View.View;

public class PresenterOfT<T extends CalcModel> {
 

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
