package com.rudolf;

import java.util.ArrayList;

/**
 * Created by rudi on 10/4/2016.
 */
public class ITECCourseManager {

        public static void main(String args[]){

            //Name: Info Tech Concepts, code 1100, max students 30, room T3050.
            // Enroll Max and Nancy and Orson.


            ITECCourse java = new ITECCourse("InfoTech Concepts", 1100, 30, "T3050", 3 );

            //add some students to the java Class
            java.addStudent("Max");
            java.addStudent("Nancy");
            java.addStudent("Orson");

            java.writeCourseInfo();

            java.fSpaces();
        }
        ArrayList<ITECCourse> CourseNames = new ArrayList<>();
        //for(String ITC: ITECCourse){
        // CourseNames.add(ITC);
        //  System.out.println(ITC);}
    }



