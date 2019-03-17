package kong.study.myproxy;

import java.lang.reflect.Method;

public class PaymentProxy implements MyInvocationHandle {

    private Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;
        return MyProxy.newProxyInstance(new MyClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pay before....");
        return method.invoke(target,args);
    }
}
