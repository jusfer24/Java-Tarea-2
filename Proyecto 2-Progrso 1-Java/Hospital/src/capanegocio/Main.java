package capanegocio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String cedula,nombre,apellido,fecha;
        int edad;
        cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula: ");
        JOptionPane.showMessageDialog(null, "La cedula es "+cedula);
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));
        JOptionPane.showMessageDialog(null, "La edad es "+edad);
    }
}