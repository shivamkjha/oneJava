package com.OOPS.Lec5.Interfaces;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");

    }
}
