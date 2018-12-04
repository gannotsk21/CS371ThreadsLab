package edu.up.cs301threadslab;

import android.util.Log;

import java.util.Random;

public class part5 extends Thread {

    Random rand = new Random();
    StarAnimation starRef;

    public part5(StarAnimation s){
        starRef = s;
    }

    @Override
    public void run() {
        Log.i("Thread: ", "is running");
        while (true) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                //do nothing
            }

            if (rand.nextInt(2) == 0) {

                starRef.addStar();
                Log.i("Star: ", "Added");

            }
            else{
                starRef.removeStar();
                Log.i("Star: ", "Removed");
            }


        }
    }



    }
