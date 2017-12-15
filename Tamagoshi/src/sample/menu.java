import java.util Scanner;

public class menu{
    private int opcion;
    private mascota mascota;
    private Scanner leer;

    public menu(){
        mascota=new mascota ("Babas");
        public void desplegar(){
            while(opcion¡=5){
                mascota.status();
                System.out.printl ("1.Comer");
                System.out.printl ("2.Jugar");
                System.out.printl ("3.Dormir");
                system.out.printl ("4.Pasear");
                system.out.printl ("5. baño");
                system.out.printl ("OP: ");
                opcion=leer.nextInt();
                switch(opcion){
                    case 1:
                        mascota.comer();
                        break;
                    case2:
                    mascota.jugar();
                    break;
                    case3:
                    mascota.dormir();
                    break;
                    case4:
                    mascota.pasear();
                    break;
                    case5:
                    mascota.baño();
                    break;