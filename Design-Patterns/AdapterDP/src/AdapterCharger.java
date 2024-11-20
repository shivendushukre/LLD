public class AdapterCharger implements AppleCharger {

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        androidCharger.chargeAP();
        System.out.println("Android charger charginh IPhone");
    }


}
