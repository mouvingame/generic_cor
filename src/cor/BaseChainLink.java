package cor;

/**
 * общая логика звена цепи
 * @param <T> тип сущности, поочередно обрабатываемой звеньями цепи
 */
public abstract class BaseChainLink<T> implements ChainLink<T> {
    private ChainLink<T> next;

    @Override
    public ChainLink<T> bind(ChainLink<T> next) {
        this.next = next;
        return next;
    }

    @Override
    public void sendToNext(T t) {
        if (next != null) next.handle(t);
    }
}