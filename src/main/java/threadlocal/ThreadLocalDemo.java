package threadlocal;

public class ThreadLocalDemo extends Thread{
    public static void main(String[] args) {
        Thread threadOne = new ThreadLocalDemo();
        threadOne.start();

        Thread threadTwo = new ThreadLocalDemo();
        threadTwo.start();
    }
    @Override
    public void run(){
       Context context = new Context();
       context.setTransactionId(getName());//线程名称
       MyThreadLocal.set(context);

       new BusinessService().businessMethod();
       MyThreadLocal.unset();//移出threadlocal变量,防止内存泄漏.

    }
}
