    //modifiers - static, final, abstract

package W3Modifiers;

public class StaticModifier {

    public int a= 10;
    public void Display(){
        System.out.println("Display Method");
    }

    /* 1. static -  belongs to the class, not the object, one and only one copy!
                    static can be accessed only once but without static it can be accessed wherever needed.
                    can be prefixed to variables adn methods*/

    public static int b= 10;
    public static void DisplayStatic(){
        System.out.println("Display Method");
    }

    /* constructor - special method that isd called when an object is created
                     it does not have a return type */
    public StaticModifier(int b){
        this.b = b;
    }

    public static void main(String[] args) {
        StaticModifier i = new StaticModifier(30);
        StaticModifier j = new StaticModifier(40);
        i.Display();
        j.Display();
        DisplayStatic();
    }
}
