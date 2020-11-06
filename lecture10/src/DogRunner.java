public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog(45.435,"Cuudle");
        Dog dog2 = new Dog(324.324,"aldslfdj");

        System.out.println(Dog.maxDog(dog1,dog2).getName());
    }
}
