import java.util.Arrays;

/**
 * Problem: Connect two interfaces which are not compatible with each other. This usually
 * arises when a legacy code needs to be integrated with a new code which are incompatible with
 * legacy code.
 * */


public class Main {
    public static void main(String[] args) {


        AppleCharger appleCharger = new AdapterCharger(new DKCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargeIPhone();

//        AndroidCharger androidCharger = new DKCharger();
//        Android android = new Android(androidCharger);
//        android.chargePhone();

    }
}