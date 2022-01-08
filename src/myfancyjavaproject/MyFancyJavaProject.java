package myfancyjavaproject;

public class MyFancyJavaProject {
    private static TestClass tc;

    private int id;
    private String name;
    
    private MyFancyJavaProject(String name){
        this.id = id;
        this.name = name;
    }
    
    public static TestClass gettc(int id,String name){
        if(tc == null){ 
            tc = new TestClass(id,name);
        }
        return tc;
    }
   public static void main(String args[])
   {
  
   }

    private static class TestClass {

        public TestClass() {
        }

        private TestClass(int id, String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
   
}