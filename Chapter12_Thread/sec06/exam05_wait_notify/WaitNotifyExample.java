package sec06.exam05_wait_notify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        DataBox databox = new DataBox();

        ProducerThread producerthread = new ProducerThread(databox);
        ConsumerThread consumerthread = new ConsumerThread(databox);

        producerthread.start();
        consumerthread.start();
    }
}
