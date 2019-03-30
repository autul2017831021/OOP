public class SyncronizedThread {

    public static void main(String[] args) throws InterruptedException {
        Mythread obj1 = new Mythread();
        Op a = new Op();
        obj1.setname("one", a);
        Mythread obj2 = new Mythread();
        obj2.setname("two", a);

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();

        System.out.println(a.num);
    }
}
