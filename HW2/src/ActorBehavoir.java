public interface ActorBehavoir {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();

    String getName();
}
