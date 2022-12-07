package OOP05.Ex001Calc.Model;

public class MultModel extends CalcModel {

    public MultModel() {
        
    }
    // do_it
    @Override
    public int result() {
        return x * y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
