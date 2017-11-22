package ec.edu.ister.modelo;

import javax.swing.JOptionPane;
/**
  * @Instituto Rumiñahui
 * @author Edison Chanataxi
 */
public class EjerciciosDeber {
    public static void Ejercicio1(){
        //1
        
        int i;
        for( i=1;i<=100;i++){
            if(i%5==0 && i%25==0)
                System.out.println(i+",");  
           
        }
        
        //2
        int a;
        for(  a=1;a<=100;a++){
            if(a%75==0)
                System.out.println(a+",");
        }
        JOptionPane.showMessageDialog(null,"Ejercicio #1"
                +"\nEl primer valor es : "+i
                +"\nEl segundo valor es : "+a
                +"\nLos valores son iguales");   
    }
    
    public static void Ejercicio2(){
        int total=0;
        for(int i=0;i<=5;i++){
            total+=2;
        }
        JOptionPane.showMessageDialog(null,"Ejercicio #2"
                +"\nLa salida del codigo es: "+total);
        
    }
    public static void Ejercicio3(){
        
        int [] primes = {1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t; 
        }System.out.println(sum++);
        JOptionPane.showMessageDialog(null,"Ejercicio #3"
                +"\nLa salida del codigo es: "+sum++);   
    }
    
    public static void Ejercicio4(){
       
        for(int i=1;i <6;i +=2){
            for(int j=0;j<3;j++){
                if(i+j>4)
                  break;
                System.out.println(i*j);
        JOptionPane.showMessageDialog(null,"Ejercicio #4"
                +"\nLa salida del codigo es: "+i*j);
            }
            
        } 
        
    }
    
    public static void Ejercicio5(){
        
        int x=0;
        do{
            System.out.print(x);
            x++;
            break;
        }
        while(x>0);
         JOptionPane.showMessageDialog(null,"Ejercicio #5"
                +"\nLa salida del codigo es: "+x);
        
    }
    public static void Ejercicio6(){
        
        int [] n={0,1,0,-1};
        for (int i=1;i<n.length;i++)
            if(n[i]==0&&n[i-1]!=0){
                int x=n[i-1];
                n[i-1]=n[i];
                n[i]=x;
                
            }
        JOptionPane.showMessageDialog(null,"Ejercicio #6"
                +"\nLa salida del codigo es: "+n[2]);
    }
    
    public static void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio 1\n"
                    + "2.- Ejercicio 2\n"
                    + "3.- Ejercicio 3\n"
                    + "4.- Ejercicio 4\n"
                    + "5.- Ejercicio 5\n"
                    + "6.- Ejercicio 6\n"
                    + "7.- Salir\ningrese opcion"));
            switch(op){
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                    case 6:
                    Ejercicio6();
                    break;
            }
        } while (op!=7);
    }
}