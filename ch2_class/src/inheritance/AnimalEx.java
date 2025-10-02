package inheritance;
// 다형성 

// 여러가지 형태를 가질 수 있는 능력 
// 부모 = new 자식()
// print(자식)
// void print(부모){};

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Animal animal = new Animal();
        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();

        // ClassCastException
        // 자식 = 부모(x)
        Herbivore herbivore = new Herbivore();
        herbivore = (Herbivore) animal;
        herbivore.eat();

        // Animal animal = new Carnivore();
        // animal.eat();
        // ((Carnivore) animal).print();

        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore) carnivore2;
    }
}
