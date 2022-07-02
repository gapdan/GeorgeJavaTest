public class Vehicle {
    public static final String producedBy = "Dacia";
    private final int productionYear;
    private final String vin;
    private String plateNumber;
    private int kilometers;
    private int lastSoldOnYear;
    private double positionX;
    private double positionY;

    Vehicle() {
        this(0, "UNKNOWN");
    }
    Vehicle(int productionYear, String vin) {
        this.vin = vin;
        this.productionYear = productionYear;
    }

    Vehicle(int productionYear, String vin, double positionX, double positionY) {
        this(productionYear, vin);
        this.positionX = positionX;
        this.positionY = positionY;
    }

    Vehicle(int productionYear, String vin, String plateNumber) {
        this(productionYear, vin);
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void  sellVehicle(String plateNumber, int lastSoldOnYear) {

    }

    public void moveCare(double newPositionX, double newPositionY) {
        double difX = positionX - newPositionX;
        double difY = positionY - newPositionY;

    }

    public void printVinDecomposed() {
        String producerIdentifier = vin.substring(0, 3);
        System.out.println("Identificatorul producatorului este: " + producerIdentifier);
    }

}
