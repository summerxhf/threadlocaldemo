package threadlocal;

/**
 * read from threadlocal and read value
 */
public class BusinessService {
    public void businessMethod(){
        Context context = MyThreadLocal.get();//��ȡthreadlocal�е�user context
        System.out.println(context.getTransactionId());//��ȡ�û�������id.
    }
}
