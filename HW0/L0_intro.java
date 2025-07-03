public class L0_intro {
    String model;
    int wheels;

    public L0_intro(String m){
        this.model=m;
        this.wheels=4;
    }

    public void drive(){
        if(this.wheels<4){
            System.out.println(this.model+" no go vroom");
            return;
        }
        System.out.println(this.model+" go vroom");
    }

    public int getNumWheels(){
        return this.wheels;
    }

    public void driveIntoDitch(int wheelslost){
        this.wheels=this.wheels-wheelslost;
    }

    public static void main(String[] args){
        L0_intro C1;
        L0_intro C2;
        C1=new L0_intro("Ci");
        C2=new L0_intro("To");

        C1.drive();
        C1.driveIntoDitch(2);
        C1.drive();

        System.err.println(C2.getNumWheels());
    }
}
