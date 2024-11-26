public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A class that is only allowed to have one obj is called singleton class");

        Test obj1=Test.getObjTest();
        Test obj2=Test.getObjTest();
        Test obj3=Test.getObjTest();
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        System.out.println("All 3 refernce vars are pointing to same obj");

    }
}
