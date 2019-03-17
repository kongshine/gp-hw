package kong.study.myproxy;
import kong.study.myproxy.*;
import java.lang.reflect.*;
public class $MyProxy0 implements kong.study.myproxy.Payment{
MyInvocationHandle h;
public $MyProxy0(MyInvocationHandle h) { 
this.h = h;}
public void doPay() {
try{
Method m = kong.study.myproxy.Payment.class.getMethod("doPay",new Class[]{});
this.h.invoke(this,m,new Object[]{});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}}
