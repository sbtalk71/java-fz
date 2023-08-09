import com.demo.Duck;
import static com.demo.Duck.getDuckCount;
public class DuckMain {

    public static void main(String[] args){

        Duck d1= new Duck("Rita");
        Duck d2= new Duck("Shane");
        Duck d3= new Duck("tiku");
        Duck d4= new Duck("Justin");
        Duck d5= new Duck("poko");


        System.out.println(getDuckCount());


    }
}
