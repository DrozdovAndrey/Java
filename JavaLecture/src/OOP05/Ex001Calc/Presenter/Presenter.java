package OOP05.Ex001Calc.Presenter;

import OOP05.Ex001Calc.Model.*;
import OOP05.Ex001Calc.View.Commands;
import OOP05.Ex001Calc.View.View;

public class Presenter {
    View view;
//    Model model;

    public Presenter( View v) {
//        model = m;
        view = v;
    }

    public void buttonClick(){
        Commands com = Commands.NONE;
        while (true){
            String command = view.getCommand("Input command");
            try{
                com = Commands.valueOf(command);
            }catch (IllegalArgumentException e){
                System.out.println("I don't now this command");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case SUM -> {
                        SumModel sum = new SumModel();
                        setValue(sum);
                        int result = sum.result();
                        view.print(result, "Sum: ");
                    }
                    case DIV -> {
                        DivModel div = new DivModel();
                        setValue(div);
                        int resultDiv = div.result();
                        view.print(resultDiv, "Div: ");
                    }
                    case DIF -> {
                        DifModel dif = new DifModel();
                        setValue(dif);
                        int resultDif = dif.result();
                        view.print(resultDif, "Dif: ");
                    }
                    case MULT -> {
                        MultModel mult = new MultModel();
                        setValue(mult);
                        int resultMult = mult.result();
                        view.print(resultMult, "Mult: ");
                    }
                }
            }catch (Exception e){
                System.out.println();
            }
        }



    }
    public void setValue(Model model){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
    }

}
