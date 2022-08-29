/*
 * Author Name: Philip Meshach
 * Date: 29-08-2022
 * Praise The Lord
 */

public class Engine {
    int modelNumber;
    String displacement;
    String maxPower;
    int maxRpm;
    String noOfCylinders;

    public Engine() {
    }

    public Engine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders) {
        super();
        this.modelNumber = modelNumber;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.noOfCylinders = noOfCylinders;
    }

    class ElectricEngines extends Engine {
        public ElectricEngines(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders, String voltage) {
            super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
            Voltage = voltage;
        }

        String Voltage;

    }

    class petrolEngine extends Engine {
        public petrolEngine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders) {
            super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        }
    }

    class dieselEngine extends Engine {
        public dieselEngine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders) {
            super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        }
    }


}
