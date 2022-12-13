package OOPSeminar7.DecoratorFactory.src.calculator;

public class CalculateFactory implements ICalculableFactory{
    ICalculableFactory iCalculableFactory;
    Loggerable logger;

    public CalculateFactory(ICalculableFactory iCalculableFactory, Loggerable logger) {
        this.iCalculableFactory = iCalculableFactory;
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new Calculate(iCalculableFactory.create(primaryArg), logger);
    }
}
