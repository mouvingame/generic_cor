package cor;

/**
 * второе звено цепи
 */
public class SecondConcreteChainLink extends BaseChainLink<Integer> {
    @Override
    public void handle(Integer o) {
        System.out.println("2nd chain link: " + o.getClass().getSimpleName());
        sendToNext(o);
    }
}