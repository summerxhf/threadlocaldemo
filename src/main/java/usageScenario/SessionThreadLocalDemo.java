package usageScenario;

/**
 * threadlocal 用于session管理(仅仅作为示例,代码会飘红).
 */
//public class SessionThreadLocalDemo {
//    private static final ThreadLocal threadSession = new ThreadLocal();
//
//
//    public static Session getSession() throws InfrastructureException {
//        Session s = (Session) threadSession.get();
//        try {
//            if (s == null) {
//                s = getSessionFactory().openSession();
//                threadSession.set(s);
//            }
//        } catch (HibernateException ex) {
//            throw new InfrastructureException(ex);
//        }
//        return s;
//    }
//
//}
