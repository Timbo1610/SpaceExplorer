package sample.Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class SkeletonNode extends GameObject {

    ArrayList<SkeletonNode> nodes;
    int rotation = 0;

    public SkeletonNode()
    {
        nodes = new ArrayList<>();

        Color color = Color.BLUE;

        Rectangle rect = new Rectangle(100,100,100,100);
        rect.setFill(color);

        getChildren().add(rect);
    }




}
