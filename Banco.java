package ArrayList_Test;
import javax.swing.*;
import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {
        boolean confirmMail;
       ArrayList<Clientes> listaClientes=new ArrayList<>();  //No lo voy a usar por ahora

        JOptionPane.showMessageDialog(null,"         Bienvenido a este Software Bancario  \n    ########################## 99%     ");

        int operacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opcion que desea realizar: \n"+
                " 1-Agregar usuario \n "+"2-Consultar Saldo \n"+" 3-Informacion general \n "+"4-Realizar Retiro \n "+
                "5-Realizar Transferencia \n"+" 6-Configurar Usuario "));

       switch (operacion){
           case 1:
               String quest = JOptionPane.showInputDialog("Desea agregar un nuevo usuario ? \n Yes \n No");
               if(quest.equalsIgnoreCase("yes")) {
                   //Name
                    String name = JOptionPane.showInputDialog("Introduzca su nombre y apellidos : ");
                   //Edad
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
                    //Mail
                   String mail;
                    do {
                         mail = JOptionPane.showInputDialog("Introduzca su correo electronico (gmail): ");
                        if (mail.contains("@gmail.com")) {
                            confirmMail = true;
                        } else {
                            confirmMail = false;
                            JOptionPane.showMessageDialog(null, "  !!!Dirrecion de Gmail no valida!!!  ");
                        }
                    } while (!confirmMail);
                   //Key
                   String key=JOptionPane.showInputDialog("Introduzca su nueva clave: ");

                   Clientes cliente= new Clientes(name,edad,key,mail);
                   listaClientes.add(cliente);
               }else if (quest.equalsIgnoreCase("no")){

               }


           case 2:

       }



    }
  /*  public static boolean KeyReview(String key){
      String keyUser=
        if(key==)*/
}