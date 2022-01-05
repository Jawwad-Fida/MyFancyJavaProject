package myfancyjavaproject;

class TestClass {
    int id;
    String name;

    TestClass(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class MyFancyJavaProject {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int id = 181;
        String name = "Sam";
        
        TestClass tc;
        tc = new TestClass(id,name);  
    } 
}
