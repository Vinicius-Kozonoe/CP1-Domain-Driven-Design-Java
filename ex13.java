//13- Crie uma classe chamada Car com os atributos: brand, model, year. No main, crie dois objetos da classe e exiba as informações.

public class ex13 {
    public static void main(String[] args) {
        Car carro1 = new Car("Fiat", "Argo", 2022);
        Car carro2 = new Car("Toyota", "Corolla", 2020);

        System.out.println("--- Carro 1 ---");
        carro1.exibirInformacoes();

        System.out.println("--- Carro 2 ---");
        carro2.exibirInformacoes();
    }
}

class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println();
    }
}