package lec10_inheritance3;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};

        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

        Dog d4=new Dog("Oski",200);
        Dog d5=new Dog("Caiwen",999999);

        Comparable<Dog> nc=new Dog.getNamrComparator();
        int cmp=nc.compare(d4,d5);
        if(cmp>0){
            d4.bark();
        }
        else{
            d5.bark();
        }


    }
}
