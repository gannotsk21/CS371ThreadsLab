package edu.up.cs301threadslab;

import java.util.Random;

public class part5 extends Thread {

    Random rand = new Random(1);
    StarAnimation starRef;

    public part5(StarAnimation s){
        starRef = s;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(40);
        }
        catch(InterruptedException e) {
            //do nothing
        }

        if(rand.nextInt() == 0 ) {
            starRef.addStar();
        }
        else if (rand.nextInt() == 1) {
            starRef.removeStar();
        }

    }
    }
