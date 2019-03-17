package kong.study.myproxy;

import java.lang.reflect.Method;

public interface MyInvocationHandle {
    Object invoke(Object proxy, Method method, Object[] args)throws Throwable;
}
