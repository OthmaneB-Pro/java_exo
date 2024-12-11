package Exo1;

public class Chat extends AnimalBase {
    public Chat(String name, int age) {
        super(name, age);
    }

    @Override
    public void manger(){
        System.out.println("Mange : croquettes pour chats");
    }
    @Override
    public void emettreSon(){
        System.out.println("Émet un son : Miaou !");
    }
}
