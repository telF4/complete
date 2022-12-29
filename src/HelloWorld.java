public class HelloWorld {
    public String name;
    public String cardcode;
    public long learncode;

    public void setName(String name) {
        this.name = name;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }

    public void setLearncode(long learncode) {
        this.learncode = learncode;
    }

    public String getName() {
        return name;
    }

    public long getLearncode() {
        return learncode;
    }

    public String getCardcode() {
        return cardcode;
    }
    public void display(){
        System.out.println("name"+name);
        System.out.println("learncode"+learncode);
        System.out.println("cardcode"+cardcode);
    }

    public static void main(String[] args) {
        HelloWorld show=new HelloWorld();
        show.setCardcode("sdfsdfs");
        show.setLearncode(54656);
        show.setName("mike");
    show.display();
    }
}




