
package logicgates;

public class gates {
    
    int buttoncount = 0;
    String gate1 = "";
    String gate2 = "";
    
    public boolean and(boolean bool1, boolean bool2){
        //eğer bool1 ve bool2 true ise
        return (bool1 && bool2);    
    }
    
    public boolean or(boolean bool1, boolean bool2){
        //eğer bool1 ve bool2 false ise
        return !(!bool1 && !bool2);
    }
    
    public boolean xor(boolean bool1, boolean bool2){
        //eğer bool1 ve bool2 aynı değil ise
        return (bool1!=bool2);
    }
    
    public boolean xnor(boolean bool1,boolean bool2){
        //eğer bool1 ve bool2 aynı ise
        return (bool1==bool2);
    }
    
    public boolean nor(boolean bool1,boolean bool2){
        //eğer bool1 ve bool2 true ise
        return (!bool1 && !bool2);
    }
    
    public boolean nand(boolean bool1, boolean bool2){
        //eğer bool1 ve bool2 true ise
        return !(bool1 && bool2);    
    }
    
    
    
}
