package dev.game.tilegame;

//IMPORT
import dev.game.tilegame.display.Display;
import dev.game.tilegame.gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nemanja Djorovic
 */
// ubacijuemo Thread 
public class Game implements Runnable {

//    instanciranje klase Display
    private Display display;
    public String title;
    public int width, height;
    private boolean running = false;

// Deklarisanje thread-a i dva metoda start i stop
    private Thread thread;

//    za metod render i koriscenje platna
    private BufferStrategy bs;
    private Graphics g;

//    Game Loop Timer
    int x = 0;

// SpriteSheet
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    //    inicijalizira sve komponente.... grafika...
    private void init() {
        //    Pokretanje ekrana
        display = new Display(title, width, height);
//        Koriscenjem klase Asset koju smo napravili 
        Assets.init();
    }

    private void update() {
        x += 1;
    }

    private void render() {
//  BufferStrategy - Nesto kao sakriveni ekran unutar kompijutera pomaze pri crtanju 
        bs = display.getCanvas().getBufferStrategy();
//        prvi put kad se igra pokrene Buffer-a nema
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
//        kreirati "cetkicu za crtanje :D"
        g = bs.getDrawGraphics();

//        "cistiti ekran"
        g.clearRect(0, 0, width, height);

//        ovde se crta *******************************************
        g.drawImage(Assets.grass, 0, 0, null);
        g.drawImage(Assets.player, x, 0, null);

//        ovde se zavrsava **********************************************
        bs.show();
        g.dispose();
    }

//    Kada se implementira Runnuble mora da se ima run metoda
    @Override
    public void run() {
        init();
//FPS
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double deltaTime = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int tick = 0;

//    GAME LOOP
        while (running) {
//            Fps count
            now = System.nanoTime();
            deltaTime += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;
            
            if (deltaTime >= 1) {
                update();
                render();
                tick++;
                deltaTime--;
            }
// Show FPS on console
            if (timer >= 1000000000) {
                System.out.println("Ticks and Frames: " + tick);
                tick = 0;
                timer = 0;
            }
        }
        stop();
    }

// Metodi za Thread sart and stop
    public synchronized void start() {
//        pokretanje game loop-a 
        if (running) {
            return;
        }

        running = true;
//        Na ovaj nacin klasa Game se pokrece u thread-u
        thread = new Thread(this);
//        Ovaj metod ce pozvati metod run
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
