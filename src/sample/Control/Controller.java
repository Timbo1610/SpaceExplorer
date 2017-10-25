package sample.Control;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import sample.Model.SkeletonNode;

public class Controller {

    private AnimationTimer gameTimer;
    private Pane root;

    private boolean wKey;
    private boolean aKey;
    private boolean sKey;
    private boolean dKey;

    public Controller(Pane root, Scene scene)
    {
        this.root = root;
        SkeletonNode mainNode = new SkeletonNode();

        mainNode.relocate(500,500);


        root.getChildren().add(mainNode);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode().equals(KeyCode.W))
                    wKey = true;
                if(event.getCode().equals(KeyCode.A))
                    aKey = true;
                if(event.getCode().equals(KeyCode.S))
                    sKey = true;
                if(event.getCode().equals(KeyCode.D))
                    dKey = true;
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode().equals(KeyCode.W))
                    wKey = false;
                if(event.getCode().equals(KeyCode.A))
                    aKey = false;
                if(event.getCode().equals(KeyCode.S))
                    sKey = false;
                if(event.getCode().equals(KeyCode.D))
                    dKey = false;
            }
        });






        gameTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if(wKey)
                   root.relocate(root.getLayoutX(),root.getLayoutY()-5);
                if(aKey)
                    root.relocate(root.getLayoutX() -5,root.getLayoutY());
                if(sKey)
                    root.relocate(root.getLayoutX(),root.getLayoutY()+5);
                if(dKey)
                    root.relocate(root.getLayoutX()+5,root.getLayoutY());



            }


        };

        gameTimer.start();

    }
}
