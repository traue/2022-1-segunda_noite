package br.uninove.model;

public class Bhaskara {

    private int a;
    private int b;
    private int c;
    private double delta;
    private double xP;
    private double xN;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getxP() {
        return xP;
    }

    public void setxP(double xP) {
        this.xP = xP;
    }

    public double getxN() {
        return xN;
    }

    public void setxN(double xN) {
        this.xN = xN;
    }

    //métodos de cálculo...:
    public double calculaDelta() {
        setDelta((b * b) - 4 * a * c);
        return getDelta();
    }

    public double[] calculaRaizes() {

        if (getDelta() >= 0) {
            setxP((-getB() + Math.sqrt(getDelta()) / 2 * getA()));
            setxN((-getB() - Math.sqrt(getDelta()) / 2 * getA()));
            return new double[]{getxP(), getxN()};
        } else {
            return null;
        }

    }
}
