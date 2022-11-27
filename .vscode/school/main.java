package school;

class dd{
   int name=5;
}
class parent extends dd{
   
}
public class main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRollno(22);
        System.out.print(s1.getRollno());
        s1.setName("hinansg");
        System.out.print(s1.getName());

    }
}
