package Fetch.method;

import java.util.HashMap;
import java.util.Map;


public class Demo {
public static void main(String[] args) {
	// Creating a map of method names to method objects 
    Map<String, Runnable> methodMap = new HashMap<String,Runnable>();
    methodMap.put("method4", new Demo()::method4);
    methodMap.put("method5", new Demo()::method5);

    // Calling the methods using the map
    Demo obj = new Demo();
    methodMap.get("method4").run();
    methodMap.get("method5").run();
}

public void method1() {
System.out.println("this is Method X1 ");
}

public void method2() {
System.out.println("this is Method X2 ");
}

public void method3() {
System.out.println("Method X3 called");
}

public void method4() {
System.out.println("Method X4 called");
}

public void method5() {
System.out.println("Method X5 called");
}

public void method6() {
System.out.println("Method X6 called");
}

public void method7() {
System.out.println("Method X7 called");
}

public void method8() {
System.out.println("Method X8 called");
}

public void method9() {
System.out.println("Method X9 called");
}

public void method10() {
System.out.println("Method X10 called");
}
}





