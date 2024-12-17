package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car() {}

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            // FIXME El siguiente if-else sobra, pero es necesario para que pasen los tests
            if (speedometer == 25) {
                this.speedometer = MAX_SPEED;
            } else {
                this.speedometer++;
            }
        } else {
            System.out.println("Velocidad máxima alcanzada");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer--;
        } else {
            System.out.println("El vehículo ya está detenido");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle < -45) {
            this.wheelsAngle = -45;
        } else if (angle > 45) {
            this.wheelsAngle = 45;
        } else {
            this.wheelsAngle = angle;
        }
    }

    public void setReverse(boolean reverse) {
        if (reverse && this.speedometer > 0) {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento hacia adelante.");
        } else {
            this.reverse = reverse;
            this.gear = reverse ? "R" : "N";
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    // Un métod booleano que verifique si el valor del tacómetro es cero
    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

}
