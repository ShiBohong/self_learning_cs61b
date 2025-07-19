package lec10_inheritance3;

public class Dog implements Comparable<Dog> {
    public String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    @Override
    public int compareTo(Dog o) {
        //assume nobody is messing up and giving us
        //something that isn't a dog.
        Dog otherDog=(Dog) o;
        return size - o.size;
    }



    public void bark() {
        System.out.println(name + " says: bark");
    }

    public static class NameComparator implements Comparator<Dog>{
        @Override
        public int compare(Dog o1, Dog o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static Comparator<Dog> getNamrComparator(){
        return new NameComparator();
    }


}