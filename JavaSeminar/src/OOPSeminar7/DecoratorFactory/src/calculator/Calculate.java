package OOPSeminar7.DecoratorFactory.src.calculator;

public class Calculate implements Calculable{
    private final Calculable calc;
    private final Loggerable logger;

    public Calculate(Calculable calc, Loggerable logger) {

        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Stars calc sum, arg: " + arg);
        Calculable result = calc.sum(arg);
        logger.log("Completed: " + result.getResult());
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Stars calc multi, arg: " + arg);
        Calculable result = calc.multi(arg);
        logger.log("Completed: " + result.getResult());
        return result;
    }

    @Override
    public int getResult() {
        logger.log("Get result..");
        int result = calc.getResult();
        logger.log("result: " + result);
        return result;
    }
}
