/*
 * Ну вы же понимаете, что код здесь только мой?
 * Well, you do understand that the code here is only mine?
 */

package test;

import net.steelswing.engine.opengl.Window;
import net.steelswing.engine.opengl.WindowListener;

/**
 *
 * @author MrJavaCoder
 */
public class GameTest implements WindowListener {

    public GameTest() throws Exception {
        Window window = new Window(this);
        window.create("Hello World", 1280, 720);
    }

    @Override
    public void init() {
        System.out.println("Game inited!");
    }

    
    
    public static void main(String[] args) throws Exception {
        GameTest t = new GameTest();
    }
}
