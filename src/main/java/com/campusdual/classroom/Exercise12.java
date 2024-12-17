package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara", "Diésel");

        // Encender el coche comprobando el valor correcto del tacómetro
        myCar.start();
        System.out.println(myCar.isTachometerGreaterThanZero());

        // Encender el coche cuando ya está encendido
        myCar.start();

        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();
        System.out.println(myCar.isTachometerEqualToZero());

        // Apagar el coche mientras todavía está en movimiento
        myCar.start();
        myCar.accelerate();
        myCar.stop();
        System.out.println(myCar.isTachometerEqualToZero());

        myCar.brake();
        myCar.stop();

        // Acelerar el coche
        myCar.start();
        myCar.accelerate();

        // Acelerar hasta intentar superar la velocidad máxima
        for (int i = 0; i < 120; i++) {
            myCar.accelerate();
        }

        // Frenar la velocidad
        myCar.brake();

        // Frenar hasta un valor negativo
        for (int i = 0; i < 121; i++) {
            myCar.brake();
        }

        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(0);

        // Girar el volante más de 45 grados o -45 grados
        myCar.turnAngleOfWheels(46);
        myCar.turnAngleOfWheels(-46);

        // Detener el coche y poner marcha atrás
        myCar.stop();
        myCar.setReverse(true);

        myCar.setReverse(false);

        // Poner marcha atrás mientras el coche está en movimiento marcha adelante
        myCar.start();
        myCar.accelerate();
        myCar.setReverse(true);

    }

}
