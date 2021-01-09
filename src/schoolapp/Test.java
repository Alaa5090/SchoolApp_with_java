/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolapp;

/**
 *
 * @author EGYPT
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student= new Student("Softwere", 21, 10000, "Alaa", "Tant City");
        System.out.println(student.getYear()+ " " +student.getProgram()+" "+ student.getFee());
        System.out.println(student);
        student.setFee(5000);
        student.setProgram("HardWere");
        student.setYear(22);
        System.out.println(student.getYear()+ " " +student.getProgram()+" "+ student.getFee());
        System.out.println(student);
    }
    
}
