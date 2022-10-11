import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong myQueue tu Interface Queue va Class PriorityQueue
        Queue<String> myQueue = new PriorityQueue<>();
        //offer(Element E): Them 1 phan tu vao hang doi

        myQueue.offer("Minh Thoa");
        myQueue.offer("Khanh Kha Banh");
        myQueue.offer("Ngoc Mai");
        myQueue.offer("Chi Thanh");

        //poll(): Lay phan tu dau tien va xoa phan tu cua queue, neu khong co phan tu tra ve null
        System.out.println("----------Lay phan tu dau tien cua myQueue voi poll-----------");
        System.out.println(myQueue.poll());
        //remove(): Lay phan tu dau tien va xoa phan tu cua queue, neu khong co phan tu tra ve exception
        System.out.println("----------Thuc hien xoa phan tu cua queue------------ ");
        System.out.println(myQueue.remove());
//        peek():
        System.out.println("----------Lay phan tu voi peek------------");
        System.out.println(myQueue.peek());
//        In cac phan tu cua myQueue
        System.out.println("--------------Cac phan tu cua myQueue------------");
        for (String str : myQueue) {
            System.out.println(str);
        }
    }
}