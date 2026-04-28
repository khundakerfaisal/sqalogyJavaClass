package OOPB1;

public class encapsulateb2 {

    public String name="Aslam";
    private int nid;
//    public void setNid(int nid){
//        this.nid=nid;
//    }
//
//    public int getNid(){
//       return nid;
//    }

    int age=25;

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    protected int mobileNumber;



}
class Employee{
    public static void main(String[] args) {
        encapsulateb2 encapsulateb2=new encapsulateb2();
        System.out.println(encapsulateb2.name);
        System.out.println(encapsulateb2.age);
        encapsulateb2.setMobileNumber(121515511);
//        System.out.println(encapsulateb2.getMobileNumber());

    }

}

class personal extends Employee{


}
