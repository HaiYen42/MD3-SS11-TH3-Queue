public class QueueClient {
    public static void main(String[] args) {
        //Thêm đuôi xóa đầu
        MyQueue queue = new MyQueue(3);
//        queue.enqueue(4);
//        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(67);
//        queue.enqueue(5);
//        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
//        queue.enqueue(24);
//        queue.dequeue();
//        queue.enqueue(98);
//        queue.enqueue(45);
//        queue.enqueue(23);
//        queue.enqueue(435);

    }
}
