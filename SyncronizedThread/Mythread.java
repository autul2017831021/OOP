class Mythread extends Thread {

    String ThreadName = "";
    Op a;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            a.operation(2, ThreadName);
            System.out.println(a.num);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void setname(String name, Op x) {
        ThreadName = name;
        a = x;

    }
}