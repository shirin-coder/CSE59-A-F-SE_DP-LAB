

interface clickable {

    void onClick();
}

class Button implements clickable{
    public void onClick(){
        System.out.println("Button was clicked");
    }
}

public class main7 {
    public static void main(String[] args) {
        Button myButton = new Button();
        myButton.onClick();
    }
}
