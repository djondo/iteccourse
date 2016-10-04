package com.rudolf;

import java.util.ArrayList;

/**
 * Created by rudi on 10/4/2016.
 */
public class ITECCourse {

        // set instance variables for each object
        String name;
        int code;
        ArrayList<String> students;
        int maxStudents;
        private String roomNumber;
        int numberOfStudents;

        // Constructor
        ITECCourse(String CourseName, int Ccode, int MaxStudents, String RoomNumber, int NumberOfStudents) {
            this.name = CourseName;
            this.code = Ccode;
            this.students = new ArrayList<String>();
            this.maxStudents = MaxStudents;
            this.roomNumber = RoomNumber;
            this.numberOfStudents = NumberOfStudents;
        }

        void addStudent(String studentName) {
            students.add(studentName);
        }

        void writeCourseInfo() {
            System.out.println("Course name: " + name);
            System.out.println("Course code: " + code);
            System.out.println("Students enrolled are: ");
            for (String student : students) {
                System.out.println(student);


            }
            System.out.println("There are " + getNumberOfStudents() + " students enrolled");
            System.out.println("The max number of students is " + maxStudents);
            System.out.println("Class room number is: " + getRoomNumber());
        }

        int getNumberOfStudents() {
            return this.students.size();
        }

        public String getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }



    // free space method
        public int fSpaces() {

            int freeSpaces = maxStudents - students.size();

            System.out.println("We have " + freeSpaces + " free spaces");

            return freeSpaces;

        }
    }




