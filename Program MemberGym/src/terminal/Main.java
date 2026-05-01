package terminal;

public class Main {
    public static void main (String[] args){
        var m1 = new memberGym("Anton", 12, 4, true);
        System.out.println(m1);
        
        var m2 = new memberGym("Ariel", 24, 3, false);
        System.out.println(m2);
    }
}
