package batandball; 
import java.util.ArrayList;
import java.util.List; 
public class Game<T extends GameObject> {
    public List<T> allObjects;
    public int width;
    public int height;
    public Game(){
        allObjects = new ArrayList<>();
        width = 100;
        height = 100;
    }
    public void run() throws InterruptedException{
        while(true){
            for(T obj : allObjects){
                obj.update();
                obj.draw();
            }
            Thread.sleep(100);
        }
    }
}
