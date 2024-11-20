public class Android {

    private AndroidCharger androidCharger;

    public Android(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    public void chargePhone() {
        androidCharger.chargeAP();
    }
}
