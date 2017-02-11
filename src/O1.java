/**
 * Created by Vadus on 11.02.2017.
 */
public class O1 {
}
class ParentMessage {
    void call() {
        System.out.println("Parent");
        System.out.println("Ok");
    }
}
class ChildMessage extends ParentMessage {
    void call() {
        System.out.println("Child");
    }
}
class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
        msg.call();
    }
}
