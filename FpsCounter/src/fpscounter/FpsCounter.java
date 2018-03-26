/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpscounter;

/**
 *
 * @author Nemanja Djorovic
 */
public class FpsCounter {

    static int fps = 0;

    public static void tick() {
        System.out.println("Current fps: " + fps );
    }

    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        float estimated_interval = 1000.0f / 55.0f;
        long last_time = System.currentTimeMillis();
        long current_time = last_time;
        long last_second = last_time;
        int curr_frame = 0;
        while(true){
         current_time = System.currentTimeMillis();
            if ((current_time-last_time)>= estimated_interval) {
                curr_frame++;
                tick();
                last_time = current_time;
            }
            if ((current_time - last_second)>=1000) {
                fps = curr_frame;
                curr_frame = 0;
                last_second = current_time;
            }
            
        }
    }

}
