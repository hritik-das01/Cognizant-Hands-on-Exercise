package HandsOn_Exercises;
//Factory Method Pattern :

public class Ex_2_FactoryMain{
    public static void main(String[] args) {
        
        Ex_2_operatingFactory osf = new Ex_2_operatingFactory();
        Ex_2_OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}
