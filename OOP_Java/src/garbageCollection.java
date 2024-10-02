//Garbage collection  is the process that is automatically performed by the java
//to remove the unwanted object the that are nt in used is removed automatically by the java
// the garbage collector use the finilize method for this work
//finilize methid:
// finilize method the method which is performed by the garbage collector it called automatically at the time when the nonusefull object is removed


public class garbageCollection {
    public static void main(String[] args) {
        A obj;  // Reference variable declaration outside the loop
        for (int i = 0; i < 100000000; i++) {
            obj = new A("hellothere");  // Creating new objects in a loop
            // The previously created object becomes unreachable and eligible for GC
        }
        // Note: The finalize method may not be called immediately or at all for every object
    }

    static class A {
        String name;

        public A(String name) {
            System.out.println("Object is Created");
            this.name = name;  // Initializing the name field
        }

        @Override
        protected void finalize() throws Throwable {  // finalize method is overridden
            System.out.println("Object is destroyed ");
        }
    }
}

