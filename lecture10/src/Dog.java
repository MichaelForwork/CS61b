/** according lecture10, we want to build a project that we can return a biggest
 * dog to bark.
 */
public class Dog implements COMparable<Dog> {
    private double size;
    private String name;

    public Dog(double s, String n){
        this.size = s;
        this.name = n;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public static Dog maxDog(Dog dog1, Dog dog2){
        if(dog1.compareTo(dog2) > 0){
            return dog1;
        }
        return dog2;
    }

    /** return negative when smaller than dog,
     * otherwise return positive.
     * @param dog
     * @return
     */
    @Override
    public double compareTo(Dog dog) {
        return this.size - dog.size;
    }


}
