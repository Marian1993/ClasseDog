package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*Treballador Treballador1=new Treballador("Pedro",27,1200.65);

        Treballador1.setName("Pedro Miquel");
        
        System.out.println("El nombre del trabajador es "+Treballador1.getname()+", tiene "+Treballador1.getage()+" años, y cobra "+Treballador1.getsalary()+"€ al mes.");


        Dog Dog1=new Dog("Lasy","Pedro Miquel",2,"Golden");

        Dog1.choose_sex(JOptionPane.showInputDialog("Choose sex female or male"));

        System.out.println("The dog name is "+Dog1.getName()+" her propietary is "+Dog1.getPropietary()+" the dog has "+Dog1.getAge()+" years old. This dog is of the race "+Dog1.getRace()+" and your sex is "+Dog1.choose_sex());*/

        String dog1Name= JOptionPane.showInputDialog("Escribe nombre");
        int dog1Age=Integer.parseInt(JOptionPane.showInputDialog("Escribe edat"));
        String dog1Race=JOptionPane.showInputDialog("Escribre raza");
        int dog1Vacu=Integer.parseInt(JOptionPane.showInputDialog("Escribe nombre de vacunas"));
        boolean dog1pedigri;
        dog1pedigri= JOptionPane.showInternalConfirmDialog(null, "Tiene pedrigi?","Input",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;


        Dog dog1=new Dog(dog1Name,dog1Age,dog1Race,dog1Vacu,dog1pedigri);

        System.out.println("La perra se llama "+dog1Name+" ,tiene "+dog1Age+" año, es de la raza "+dog1Race+". Se le han puesto "+dog1Vacu+" vacunas. Pedigri "+dog1pedigri);

    }

}
