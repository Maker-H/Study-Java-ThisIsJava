package sec06_LIFOFIFO.exam02_queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messagequeue = new LinkedList<Message>();

        messagequeue.offer(new Message("Send Mail", "heesom"));
        messagequeue.offer(new Message("Send SMS", "java"));
        messagequeue.offer(new Message("Send KAKAOTALK", "jsp"));

        while(!messagequeue.isEmpty()) {
            Message message = messagequeue.poll();
            switch(message.command) {
                case "Send Mail" :
                System.out.println("Send mail to : "+message.to);
                break;
                case "Send SMS" :
                System.out.println("Send sms to : "+message.to);
                break;
                case "Send KAKAOTALK" :
                System.out.println("Send kakao to : "+message.to);
                break;
            }
        }
    }
}
