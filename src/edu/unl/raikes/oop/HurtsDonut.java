package edu.unl.raikes.oop;

public class HurtsDonut implements Edible {

    public HurtsDonut() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void consume(Object eater) {
        System.out.println(eater+"asked if I wanted a Hurts Donut. But then they ate it themselves. Rude.");
    }

}
