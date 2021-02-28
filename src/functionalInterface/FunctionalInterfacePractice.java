package functionalInterface;

public class FunctionalInterfacePractice implements sayable{

    public static void main(String[] args) {
        FunctionalInterfacePractice f1 = new FunctionalInterfacePractice();
        f1.say("Prakash");
    }


    @Override
    public void say(String msg1) {
        System.out.println(msg1);
    }
}

interface sayable{
    void say(String msg1);
}
