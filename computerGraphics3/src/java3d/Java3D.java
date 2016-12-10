/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3d;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author hasal
 */
public class Java3D extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        primaryStage.setTitle("Computer Graphics 3D");
        
        Box cube = new Box(200, 200, 200);
        
        Image rgb = new Image("rgbtexture.jpg", true);
        
        PhongMaterial red = new PhongMaterial();
        red.setDiffuseMap(rgb);
        red.setSpecularMap(rgb);
        red.setSpecularColor(javafx.scene.paint.Color.BLACK);
        
        cube.setMaterial(red);
        
        cube.setRotationAxis(Rotate.Y_AXIS);
        
        Timeline animation = new Timeline();
        animation.getKeyFrames().addAll(
        new KeyFrame(Duration.ZERO, new KeyValue(cube.rotateProperty(), 0)),
        new KeyFrame(Duration.millis(5000), new KeyValue(cube.rotateProperty(), 360)
        ));
        
        animation.setCycleCount(Animation.INDEFINITE);
        
        Group root = new Group(cube);
        
        Camera camera = new PerspectiveCamera();
        
        Scene scene = new Scene(root, 1024, 768);
        scene.setFill(javafx.scene.paint.Color.GRAY);
        scene.setCamera(camera);
        
        root.setTranslateX(scene.getWidth()/2);
        root.setTranslateY(scene.getHeight()/2);
        root.setTranslateZ(0);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        animation.play();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
