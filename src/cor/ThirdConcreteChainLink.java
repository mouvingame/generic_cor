package cor;

/**
 * третье звено цепи
 */
public class ThirdConcreteChainLink extends BaseChainLink<Integer> {
    @Override
    public void handle(Integer o) {
        System.out.println("3rd chain link: " + o.getClass().getCanonicalName());
        sendToNext(o);
    }
}