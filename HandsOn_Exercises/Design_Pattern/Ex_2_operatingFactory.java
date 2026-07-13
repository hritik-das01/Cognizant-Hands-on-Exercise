package HandsOn_Exercises.Design_Pattern;

public class Ex_2_operatingFactory {
    public Ex_2_OS getInstance(String str){
        if(str.equals("open"))
            return new Ex_2_Android();
        else if(str.equals("Closed"))
            return new Ex_2_IOS();
        else{
            return new Ex_2_Windows();
        }
    }
    
}
