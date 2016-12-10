package java3d;

import java.awt.GraphicsConfiguration;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;




public class ConeDemo {

	public static void main(String[] args) throws IOException {
		//Alternatively, could specify buffering, depth, antialiasing
		GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();

		//Canvas drawing takes places on
		Canvas3D canvas = new Canvas3D(gc);
		canvas.setSize(1024, 768);

		//Put canvas in universe
		SimpleUniverse universe = setUpUniverse(canvas);
		//Create content
		BranchGroup content = createContent();
		
		//Add content BranchGroup to universe so it's displayed
		universe.addBranchGraph(content);
		
		//Panel to hold the canvas
		JPanel panel = new JPanel();
		panel.add(canvas);
		
		//JFrame = stand-alone window
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		//Otherwise, program won't exit when you close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static BranchGroup createContent() throws IOException {
		BranchGroup content = new BranchGroup();
		
		Cone c = createCone();
		//add the cone to the BranchGroup
		content.addChild(c);

		//Let's do a 2nd code, rotated and scaled
		c = createCone();
		//Create transform group
		TransformGroup tg = new TransformGroup();
		//Create actual transform
		Transform3D t3d = new Transform3D();
		
		//Modify the transform
		//Rotate 45 degrees
		t3d.rotZ(Math.PI/4);
		//Make it bigger
		t3d.setScale(1.5);
		//Move it
		Vector3f translate = new Vector3f(0.4f, 0.4f, 0.0f);
		t3d.setTranslation(translate);
		//Update the transform in the transform group
		tg.setTransform(t3d);
		//Add the cone as a child
		tg.addChild(c);
		//Add it to the top-level branch group
		content.addChild(tg);
		
		return content;
	}
	
	
	private static Cone createCone() throws IOException {
		//create a cone
		float radius = 0.3f;
		float height = 0.6f;
		Cone c = new Cone(radius, height);
		
		
		//Let's make it purple
		//create a coloring attributes object
		ColoringAttributes ca = new ColoringAttributes();
		//set color to purple
		//red, green, blue
		ca.setColor(0.5f, 0.5f, 0.5f);
                //Create an appearance object and add coloring attributes
                Appearance a = new Appearance();
                a.setColoringAttributes(ca);
                c.setAppearance(a);
                
		return c;
	}

	private static SimpleUniverse setUpUniverse(Canvas3D canvas) {
		
		//Sets up the things needed for the display branch
		SimpleUniverse su = new SimpleUniverse(canvas);
		
		//Back up a small distance
		su.getViewingPlatform().setNominalViewingTransform();
		
		//Return so we can add things to it
		return su;
	}
}