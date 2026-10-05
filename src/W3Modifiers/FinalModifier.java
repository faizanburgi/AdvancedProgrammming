package W3Modifiers;

/* 2. final - cannot be changed
                  for method, it means the method cannot be overridden
                  for class ,it means the class cannot be inherited
                  for variable, it means the variable cannot be changed  */

public final class FinalModifier {
    // if we try to extend this class it wont work because this is final so cannot be changed
    // same is the case with methods if declared final it cannot be overridden in the subclass.
    public final int i = 10;

    public static void main(String[] args) {

    }
}
