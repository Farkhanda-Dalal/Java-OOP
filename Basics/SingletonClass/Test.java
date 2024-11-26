import java.util.Scanner;

class Test{
    private int id;
    private String name;

    private Test(int id,String name){
        this.id=id;
        this.name=name;
    }

    static private Test instance;

    static Test getObjTest(){
        if(instance==null){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id and name:");
            instance=new Test(sc.nextInt(),sc.next());
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + "]";
    }

   

    


}
