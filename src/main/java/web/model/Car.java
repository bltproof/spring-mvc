package web.model;

public class Car {
    private String model;
    private String body;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, String body, int maxSpeed) {
        this.model = model;
        this.body = body;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
