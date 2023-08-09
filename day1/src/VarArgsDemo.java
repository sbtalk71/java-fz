public class VarArgsDemo {

    public void add(int ...nums){
        System.out.println("No of arguments : "+nums.length);
    }


    public static void main(String[] args) {
        VarArgsDemo va= new VarArgsDemo();
        va.add(1,2,3,4,5,6);
    }
}
