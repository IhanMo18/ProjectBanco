package ArrayList_Test;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        boolean confirmMail;
        boolean salir=true;
        ArrayList<Clientes> listaClientes=new ArrayList<>();  //Duda

        //Creacion de perfil
        JOptionPane.showMessageDialog(null,"         Bienvenido a este Software Bancario  \n    ########################## 99%     ");

        JOptionPane.showMessageDialog(null,"Primero debe crear su usuario en nuestro Banco");
        String name=JOptionPane.showInputDialog("Introduzca su nombre completo: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));

        String mail;//Creacion del correo
        do {
            mail = JOptionPane.showInputDialog("Introduzca su direccion de gmail: ");
            if (mail.contains("@gmail.com")) {
                confirmMail = true;
            } else {
                confirmMail = false;
                JOptionPane.showMessageDialog(null, "Direccion de gmail INVALIDA!");
            }
        }while(!confirmMail);

        //Contrasena
        String key;
        do {
            key = JOptionPane.showInputDialog("Introduzca su clave de usuario: ");
            if (key.length() < 8) {
                JOptionPane.showMessageDialog(null, "Error,clvae invalida,debe ser mayor de 8 digitos");
            } else if (key.length()>8) {
                JOptionPane.showMessageDialog(null,"Clave Guardada con Exito!!!");
            }
        }while(key.length()<8);


        do {
            int operacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opcion que desea realizar: \n" +
                    " 1-Agregar usuario \n " + "2-Consultar Saldo \n" + " 3-Informacion general \n " + "4-Realizar Retiro \n " +
                    "5-Realizar Transferencia \n" + " 6-Configurar Usuario "));

            switch (operacion) {
                case 1:
                    String quest = JOptionPane.showInputDialog("Desea agregar un nuevo usuario ? \n Yes \n No");
                    if (quest.equalsIgnoreCase("yes")) {
                        //NOMBRE
                        String newUser = JOptionPane.showInputDialog("Introduzca su nombre y apellidos : ");
                        //Edad
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
                        //Mail
                        String mailUser;
                        do {
                            mailUser = JOptionPane.showInputDialog("Introduzca su correo electronico (gmail): ");
                            if (mail.contains("@gmail.com")) {
                                confirmMail = true;
                            } else {
                                confirmMail = false;
                                JOptionPane.showMessageDialog(null, "  !!!Dirrecion de Gmail no valida!!!  ");
                            }
                        } while (!confirmMail);
                        //Key
                        String keyUser;
                        do {
                            keyUser = JOptionPane.showInputDialog("Introduzca su nueva clave: ");
                            if (keyUser.length() < 8) {
                                JOptionPane.showMessageDialog(null, "Error,clvae invalida,debe ser mayor de 8 digitos");
                            }
                        } while (keyUser.length() < 8);

                        Clientes cliente = new Clientes(newUser, edad, key, mail);
                        listaClientes.add(cliente);
                        String cuestion = JOptionPane.showInputDialog("Desea continuar: \n");
                        if (cuestion.equalsIgnoreCase("si")) {
                            break;
                        } else {
                            salir = false;
                        }

                    } else if (quest.equalsIgnoreCase("no")) {
                        salir = false;
                    }

            }

            case 2:


        }while(salir=true);
    }


}
}