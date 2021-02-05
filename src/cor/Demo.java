package cor;

public class Demo {
    public static void main(String[] args) {
        final String s = "Chain of Responsibility pattern";
        System.out.println(s);
        FirstConcreteChainLink first = new FirstConcreteChainLink();
        first.bind(new SecondConcreteChainLink()).bind(new ThirdConcreteChainLink());
        first.handle(1);
    }
}