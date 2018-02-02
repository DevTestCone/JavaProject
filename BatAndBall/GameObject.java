package batandball;
public abstract class GameObject {
    public int posx;
    public int posy;
    public int speed; 
    public abstract void update();
    public abstract void draw();
}
