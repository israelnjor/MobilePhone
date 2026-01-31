public class MobilePhone {
    private String brand;
    private String model;
    private int storageSize;
    private int batteryCapacity;
    private double price;

    //Default Constructor
    public MobilePhone() {}

    //Parameterized Constructor
    public MobilePhone(String brand, String model, int storageSize, int batteryCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.storageSize = storageSize;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel() {
        this.model = model;
    }
    public void setStorageSize() {
        this.storageSize = storageSize;
    }
    public void setBatteryCapacity() {
        this.batteryCapacity = batteryCapacity;
    }
    public void setPrice() {
        this.price = price;
    }

    //GETTERS
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getStorageSize() {return storageSize;}
    public int getBatteryCapacity() {return batteryCapacity;}
    public double getPrice() {return price; }

    //Full Getter
    public String getFullDetails(){
        return "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Device Storage: " + storageSize + "GB" + "\n" +
                "Battery Capacity: " + batteryCapacity + "mAH" + "\n" +
                "Price: " + price + "$";

    }
}

