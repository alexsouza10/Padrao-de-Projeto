// Interface para o comportamento de dirigir
interface DriveBehavior {
    void drive();
}


// Comportamento de dirigir um carro
class DriveCar implements DriveBehavior {
    @Override
    public void drive() {
        System.out.println("Dirigindo um carro.");
    }
}


// Comportamento de dirigir uma moto
class DriveMotorcycle implements DriveBehavior {
    @Override
    public void drive() {
        System.out.println("Pilotando uma moto.");
    }
}


// Comportamento de dirigir uma bicicleta
class DriveBicycle implements DriveBehavior {
    @Override
    public void drive() {
        System.out.println("Pedalando uma bicicleta.");
    }
}


// Implementações concretas de veículos
abstract class Vehicle {
    private DriveBehavior driveBehavior;

    public Vehicle(DriveBehavior driveBehavior) {
        this.driveBehavior = driveBehavior;
    }

    public void setDriveBehavior(DriveBehavior driveBehavior) {
        this.driveBehavior = driveBehavior;
    }

    public void drive() {
        driveBehavior.drive();
    }

    abstract void stop();

    abstract void accelerate();
}


// Implementações concretas de veículos
class Car extends Vehicle {
    public Car() {
        super(new DriveCar());
    }

    @Override
    void stop() {
        System.out.println("Parando o carro.");
    }

    @Override
    void accelerate() {
        System.out.println("Acelerando o carro.");
    }
}


class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(new DriveMotorcycle());
    }

    @Override
    void stop() {
        System.out.println("Parando a moto.");
    }

    @Override
    void accelerate() {
        System.out.println("Acelerando a moto.");
    }
}


class Bicycle extends Vehicle {
    public Bicycle() {
        super(new DriveBicycle());
    }

    @Override
    void stop() {
        System.out.println("Parando a bicicleta.");
    }

    @Override
    void accelerate() {
        System.out.println("Acelerando a bicicleta.");
    }
}


// Classe principal para testar a implementação
public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos veículos
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        // Testando os veículos
        car.drive();
        car.accelerate();
        car.stop();

        motorcycle.drive();
        motorcycle.accelerate();
        motorcycle.stop();

        bicycle.drive();
        bicycle.accelerate();
        bicycle.stop();
    }
}
