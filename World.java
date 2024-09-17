/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author Quent
 */
import java.util.Random;

public class World {
    public Lapin lapin1;
    public Lapin lapin2;
    public Paysan paysan1;
    public Archer archer1;

    public World() {
        this.lapin1=new Lapin();
        this.lapin2=new Lapin();
        this.archer1=new Archer();
        this.paysan1=new Paysan();
    }
    public void creerMondeAlea(){
        int largeurMonde=2;
        int[][] coordonnees=new int[4][2];
        boolean test;
        Random generateur= new Random();
        //coordonnees[0][0]=generateur.nextInt(largeurMonde);
        //coordonnees[0][1]=generateur.nextInt(largeurMonde);
        for (int i=0;i<4;i++){
            test=false;
            while(test==false){
                coordonnees[i][0]=generateur.nextInt(largeurMonde);
                coordonnees[i][1]=generateur.nextInt(largeurMonde);
                test=true;
                for(int j=0;j<i;j++){
                    if (coordonnees[i][0]==coordonnees[j][0] && coordonnees[i][1]==coordonnees[j][1]){
                        test=false;
                    }
                }
            }
            
        }
        lapin1.setPos(new Point2D(coordonnees[0][0],coordonnees[0][1]));
        lapin2.setPos(new Point2D(coordonnees[1][0],coordonnees[1][1]));
        paysan1.setPos(new Point2D(coordonnees[2][0],coordonnees[2][1]));
        archer1.setPos(new Point2D(coordonnees[3][0],coordonnees[3][1]));
    }
    
}
