public void comer(){
        energia=energia+20;
        }
public void jugar (){
        energia= energia +20;

public void dormir(){
        energia= energia + 20;
        }
public void baño(){
        energia= energia + 20;
        }
public void pasear(){
        energia= energia + 20;
        }
public void status (){
        string estado;
        if(estaVivo){
        estado= "vivo";
        }else{
        estado ="muerto";
        }
        System.out.println(nombre+"-"+estado+"-"+energia+"%");
        {
public boolean estavivo(){
        return energia>0;
        }
