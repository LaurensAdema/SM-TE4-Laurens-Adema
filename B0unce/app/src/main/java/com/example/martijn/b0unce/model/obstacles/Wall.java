package com.example.martijn.b0unce.model.obstacles;

import android.graphics.Point;

import com.example.martijn.b0unce.model.ball.Ball;
import com.example.martijn.b0unce.model.resources.GamePoint;

/**
 * Created by Martijn on 20-4-2016.
 */
public class Wall extends Obstacle {

    public Wall(GamePoint position) {
        super(position);
        this.texture = 0xff000000;
    }

    @Override
    public void enter(Ball ball) {
        
    }

    @Override
    public void leave(Ball ball) {

    }
}
