package com.OOPS.Lec5.Interfaces;

public class MyCar {

    private Engine engine;
    private MediaPlayer jbl ;

    public MyCar() {
        engine = new PowerEngine();
        jbl = new MediaPlayer();
    }

    public MyCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        jbl.start();
    }

    public void stopMusic(){
        jbl.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }


    public static void main(String[] args) {
        Engine e1 = new ElectricEngine();   //we're using engine to toogle between power and electric engine
        MyCar m1 = new MyCar(e1);
        m1.start();
        MyCar m2 = new MyCar();
        m2.start();
        m2.stop();
        m2.startMusic();
        m2.stopMusic();
        m2.upgradeEngine(e1);
        e1.start();
    }
}
