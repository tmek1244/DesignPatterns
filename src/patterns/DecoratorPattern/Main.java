package patterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        var espresso = new Espresso();
        var decaf = new Decaf();

        System.out.println(espresso);
        System.out.println(decaf);

        var espressoWithCaramel = new CaramelDecorator(espresso);
        var decafWithSoy = new SoyDecorator(decaf);

        System.out.println(espressoWithCaramel);
        System.out.println(decafWithSoy);

        var espressoWithCaramelAndSoy = new SoyDecorator(espressoWithCaramel);
        var decafWithTwoSoy = new SoyDecorator(decafWithSoy);

        System.out.println(espressoWithCaramelAndSoy);
        System.out.println(decafWithTwoSoy);
    }
}
