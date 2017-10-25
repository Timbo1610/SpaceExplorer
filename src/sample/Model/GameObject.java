package sample.Model;


import javafx.scene.layout.Region;

public class GameObject extends Region{

    Vector vector;

    public GameObject(){
        vector  = new Vector();
    }

    public GameObject(double x, double y){
        vector  = new Vector(x,y);
    }


    @Override
    public void relocate(double x, double y) {
        vector.setX(x);
        vector.setY(y);
        super.relocate(x, y);
    }

    public void update()
    {
        vector.setX(vector.getX()+vector.getdX());
        vector.setY(vector.getY()+vector.getdY());
        relocate(vector.getX(),vector.getY());

        //System.out.println("moved to " + vector.getX() + " " + vector.getY());

    }

    public void accUp(double delta)
    {
        vector.setdY(vector.getdY() - delta);
        System.out.println("moving up");
    }

    public void accLeft(double delta)
    {
        vector.setdX(vector.getdX() - delta);
    }

    public void accDown(double delta)
    {
        vector.setdY(vector.getdY() + delta);
    }

    public void accRight(double delta)
    {
        vector.setdX(vector.getdX() + delta);
    }
}
