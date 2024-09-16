/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author Quent
 */
public class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point2D (int a, int b){
        this.x=a;
        this.y=b;
    
    }

    public Point2D() {
    }
    
    public Point2D(Point2D p) {
        this(p.getX(),p.getY());
    }
    public void SetPosition(int x,int y){
        this.x=x;
        this.y=y;
    } 
    public void affiche(){
        System.out.println("["+x+";"+y+"]");
    }
    public void translate(int dx, int dy){
        this.x +=dx;
        this.y +=dy;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Point2D)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members 
        Point2D c = (Point2D) o;
        System.out.println("est du meme type");
        // Compare the data members and return accordingly 
        return x == c.x && y == c.y;
        //&& Double.compare(y, c.y) == 0;
    }
}
