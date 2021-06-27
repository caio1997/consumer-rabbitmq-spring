package caio.home.springconsumerrabbitmq.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
