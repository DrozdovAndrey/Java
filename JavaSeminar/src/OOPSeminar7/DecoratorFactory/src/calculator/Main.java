package OOPSeminar7.DecoratorFactory.src.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory1 = new CalculateFactory(calculableFactory, new Logger("C:\\Users" +
                "\\drozd\\Documents\\GB\\Java\\JavaSeminar\\src\\OOPSeminar7\\DecoratorFactory" +
                "\\src\\calculator\\logger.txt"));
        ViewCalculator view = new ViewCalculator(calculableFactory1);
        view.run();
    }
}
