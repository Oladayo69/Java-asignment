/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author Emmanuel Olukomogbon
 */
public class JavaAssignment {

    /**
     * @param args the command line arguments
     * 
     */
   public String collectGrade (double score){
        String grade = "";
        if (score >= 70 && score <=100){
            grade = "A";
        }else if(score >= 55 && score <=69){
            grade = "B";
        }else if(score >= 50 && score <=54){
            grade = "C";
        }else if(score >= 45 && score <=50){
            grade = "D";
        }else if(score >= 40 && score <=44){
            grade = "E";
        }else if(score >= 0 && score <=39){
            grade = "F";
        } 
return grade;
    }
    
    public int collectPoint(String grade){
        int point = 0;
        switch(grade){
            case "A" -> point = 5;
            case "B" -> point = 4;
            case "C" -> point = 3;
            case "D" -> point = 2;
            case "E" -> point = 1;
            case "F" -> point = 0;
        }
return point;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Simple Grading System");
        Scanner i = new Scanner(System.in);
        
        //Course1
        System.out.println("Enter Course 1");
        String course1 = i.nextLine();
        
        System.out.print("Enter" + course1 + "grade: ");
        int gradeUnit1 = i.nextInt();
        
         System.out.print("Enter" + course1 + "Score :  ");
        double Score1 = i.nextDouble();
        
        i.nextLine();
        
          //Course2
        System.out.println("Enter Course 2");
        String course2 = i.nextLine();
        
        System.out.print("Enter" + course2 + "grade: ");
        int gradeUnit2 = i.nextInt();
        
         System.out.print("Enter" + course2 + "Score :  ");
        double Score2 = i.nextDouble();
        
        i.nextLine();
        
          //Course3
        System.out.println("Enter Course 3");
        String course3 = i.nextLine();
        
        System.out.print("Enter" + course3 + "grade: ");
        int gradeUnit3 = i.nextInt();
        
         System.out.print("Enter" + course3 + "Score : ");
        double Score3 = i.nextDouble();
        
        i.nextLine();
        
          //Course4
        System.out.println("Enter Course 4");
        String course4 = i.nextLine();
        
        System.out.print("Enter" + course4 + "grade: ");
        int gradeUnit4 = i.nextInt();
        
         System.out.print("Enter" + course4 + "Score :  ");
        double Score4 = i.nextDouble();
        
        i.nextLine();
        
          //Course5
        System.out.println("Enter Course 5");
        String course5 = i.nextLine();
        
        System.out.print("Enter" + course5 + "grade: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.print("Enter" + course5 + "Score :  ");
        double Score5 = i.nextDouble();
        
        JavaAssignment ds = new JavaAssignment();
        
        String grade1 = ds.collectGrade(Score1);
        String grade2 = ds.collectGrade(Score2);
        String grade3 = ds.collectGrade(Score3);
        String grade4 = ds.collectGrade(Score4);
        String grade5 = ds.collectGrade(Score5);
         
         double point1 = ds.collectPoint(grade1);
        double point2 = ds.collectPoint(grade2);
         double point3 = ds.collectPoint(grade3);
         double point4 = ds.collectPoint(grade4);
         double point5 = ds.collectPoint(grade5);
         
         
    double totalGradeUnit= gradeUnit1+gradeUnit2+gradeUnit3+gradeUnit4+gradeUnit5;
    double totalQualityPoint=point1*gradeUnit1;
    totalQualityPoint+=point2*gradeUnit2;
    totalQualityPoint+=point3*gradeUnit3;
    totalQualityPoint+=point4*gradeUnit4;
    totalQualityPoint+=point5*gradeUnit5;
        
         double gpa =totalQualityPoint/totalGradeUnit;
         
           System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|COURSE CODE |  COURSE UNIT   |  GRADE  | POINT  |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course1+ "   |       " + gradeUnit1 + "        |    " + grade1 + "    |    " + point1 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course2+ "   |       " + gradeUnit2 + "        |    " + grade2 + "    |    " + point2 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course3+ "   |       " + gradeUnit3 + "        |    " + grade3 + "    |    " + point3 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course4+ "   |       " + gradeUnit4 + "        |    " + grade4 + "    |    " + point4 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course5+ "   |       " + gradeUnit5 + "        |    " + grade5 + "    |    " + point5 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println(" Your Gpa for the semester is: " + gpa);     
                         
    }
    
}
