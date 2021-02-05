package cor;

/**
 * первое звено цепи
 */
public class FirstConcreteChainLink extends BaseChainLink<Integer> {
    @Override
    public void handle(Integer o) {
        System.out.println("1st chain link: " + o.getClass().getName());
        sendToNext(o);
    }
}