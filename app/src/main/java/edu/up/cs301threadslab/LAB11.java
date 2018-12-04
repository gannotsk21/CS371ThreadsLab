package edu.up.cs301threadslab;

import android.util.Log;

public class LAB11 extends Thread {
    private AnimationView ref;

    LAB11(AnimationView v)
    {
        ref = v;
    }

    @Override
    public void run() {
        Log.i("Twinkle Thread: ", "is running");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                //do nothing
            }
            ref.postInvalidate();
        }
    }
}
