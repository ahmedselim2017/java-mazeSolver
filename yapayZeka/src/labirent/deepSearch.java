//EuzubillAhimineşşeydanirracim Bismillahirrahmanirrahim
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labirent;

import java.util.List;

/**
 *
 * @author ahmed
 */
public class deepSearch {
    
    public deepSearch (){

    }
    public boolean labirentOlustur(int[][]labirent){
        
        return false;
    }
    public static boolean yolAra(int[][]labirent,int x,int y,List<Integer>yol){
        if(labirent[y][x]==9){//eğer varışa ulaşıldıysa dur 
            yol.add(x);
            yol.add(y);
            return true;
        }
        if(labirent[y][x]==0){
            labirent[y][x]=2;//gidilen yeri işaretle
            
            int deltaX=-1;
            int deltaY=0;
            if(yolAra(labirent, x+deltaX, y+deltaY, yol)){
                yol.add(x);
                yol.add(y);
                return true;
            }
            
            deltaX=1;
            deltaY=0;
            if(yolAra(labirent, x+deltaX, y+deltaY, yol)){
                yol.add(x);
                yol.add(y);
                return true;
            }
            
            deltaX=0;
            deltaY=-1;
            if(yolAra(labirent, x+deltaX, y+deltaY, yol)){
                yol.add(x);
                yol.add(y);
                return true;
            }
            
            deltaX=0;
            deltaY=1;
            if(yolAra(labirent, x+deltaX, y+deltaY, yol)){
                yol.add(x);
                yol.add(y);
                return true;
            }
        }
        return false;
    }

}
