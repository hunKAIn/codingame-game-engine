package com.codingame.gameengine.module.entities;

/**
 * The function that will be used to animate the transition of given properties between two states of an <code>Entity</code>.
 */
public enum Curve {
    /**
     * The default simple linear interpolation.
     */
    LINEAR,

    /**
     * Don't animate the transition.
     */
    NONE,

    /**
     * Start changing slowly, accelerate, then slowly again.
     */
    EASE_IN_AND_OUT,

    /**
     * The value quickly increases and wobbles around the final value before settling.
     */
    ELASTIC;
    
    static final Curve DEFAULT = Curve.LINEAR;
}