/*
 * Ну вы же понимаете, что код здесь только мой?
 * Well, you do understand that the code here is only mine?
 */

package net.steelswing.engine.opengl;

/**
 *
 * @author MrJavaCoder
 */
public interface WindowListener {

    public default void init() {
        // default
    }

    public default void update() {
        // default
    }

    public default void destroy() {
        // default
    }
}
