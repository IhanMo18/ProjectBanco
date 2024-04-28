package ArrayList_Test;
import java.util.Random;

public class Clientes {
     private String name;
     private int edad;
     private String key;
     private  int ID;
     private String mail;
     private double money;


     Clientes(String name,int edad,String key,String mail){
         this.name=name;
         this.edad=edad;
         this.key=key;
         this.mail=mail;
     }

     Clientes(double money){
         this.money=money;
     }

     //Getters and Setter
     public void SetName(String name){
         name=this.name;
     }
     public String GetName(){
         return name;
     }
     /////
    public void SetEdad(int edad){
        edad=this.edad;
    }
    public int GetEdad(){
         return edad;
     }
     //////
     public void SetKey(String key){
         key=this.key;
     }

     public String GetKey(){
         return key;
     }

     /////
     public void SetMail(String mail){
         mail=this.mail;
     }
     public String Getmail(){
         return mail;
     }

     public void SetID(){
         var random = Math.random()*10000;
         random=this.ID;
     }
     public int GetID(){
         return ID;
     }

     public double GetMoney(){
         return money;
     }

     public void Depositar(double money){
         money=this.money;
     }








}
