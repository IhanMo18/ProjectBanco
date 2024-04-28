package ArrayList_Test;
import java.util.Random;
import java.util.stream.LongStream;

public class Clientes {
     private String name;
     private int edad;
     private String key;
     private LongStream ID;
     private String mail;
     private double money;


     Clientes(String name,int edad,String key,String mail){
         this.name=name;
         this.edad=edad;
         this.key=key;
         this.mail=mail;
     }

     Clientes(double moneyCliente){
         this.money=moneyCliente;
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
         Random numeroRandom=new Random(1000);
        this.ID= numeroRandom.longs();
     }
     public LongStream GetID(){
         return ID;
     }

     public void SetMoney(double money){
         this.money=money;
     }

     public double GetMoney(){
         return money;
     }


     public double DepositMoney(double moneyTransfer){
         this.money+=moneyTransfer;
         return this.money;
     }











}
