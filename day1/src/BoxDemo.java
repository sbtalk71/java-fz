

public class BoxDemo {

    public static void main(String[] args){

        Box b1= new Box(10,10,20);
        double vol=b1.getVolume();
        System.out.println("Volume = "+vol);

        Box b2= new Box(10,10,20,"red");

        //System.out.println("Volume = "+b2.getVolume());
    }
    
    
}
