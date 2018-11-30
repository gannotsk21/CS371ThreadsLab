package edu.up.cs301threadslab;

public class LAB11 extends Thread {
    private AnimationView ref;

    LAB11(AnimationView v)
    {
        ref = v;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(50);
        }
        catch(InterruptedException e){
            //do nothing
        }
        ref.postInvalidate();
    }
}
