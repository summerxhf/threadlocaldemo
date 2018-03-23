package threadlocal;

/**
 * read from threadlocal and read value
 */
public class BusinessService {
    public void businessMethod(){
        Context context = MyThreadLocal.get();//获取threadlocal中的user context
        System.out.println(context.getTransactionId());//获取用户的事务id.
    }
}
