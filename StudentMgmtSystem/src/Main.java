import com.airtribe.studentmgmt.entity.GraduateStudent;
import com.airtribe.studentmgmt.entity.Student;
import com.airtribe.studentmgmt.service.StudentService;
import com.airtribe.studentmgmt.util.DateUtil;
import com.airtribe.studentmgmt.util.InputValidationUtil;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main() throws Exception {
        StudentService service = new StudentService();
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("-----AirTribe Learning Mgmt System------");
            System.out.println("1. Add a student");
            System.out.println("2. List all students");
            System.out.println("3. Search a student");
            System.out.println("4. Delete a student");
            System.out.println("0. Exit\n");

            int choice = Integer.parseInt(scn.nextLine());
            System.out.println("\n");


            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scn.nextLine();

                    if (!InputValidationUtil.isValidName(name)) {
                        throw new Exception("Invalid name format");
                    }

                    System.out.print("Enter ID: ");
                    String id = scn.nextLine();

                    if (!InputValidationUtil.isValidId(id)) {
                        throw new Exception("Invalid ID");
                    }

                    System.out.print("Enter Cohort (Java/NodeJS): ");
                    String cohort = scn.nextLine();

                    if (!InputValidationUtil.isValidCohort(cohort)) {
                        throw new Exception("Invalid cohort name");
                    }

                    String createdOn = DateUtil.getCurrentDate(); // using DateUtil

                    GraduateStudent gs = new GraduateStudent(id, name, cohort, "Backend");
                    gs.setCreatedOn(createdOn);  // optional if your Student has a date field

                    service.addStudent(gs);
                    System.out.println("Student added successfully!");
                    System.out.println();
                    break;


                case 2:
                    service.listStudents();
                    System.out.println("\n");
                    break;


                case 3:
                    System.out.print("Enter name keyword: ");
                    String keyword = scn.nextLine();
                    service.searchByName(keyword)
                            .forEach(s -> s.printInfo(true));
                    System.out.println();
                    break;


                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scn.nextLine();

                    if (service.deleteStudentById(deleteId)) {
                        System.out.println("Student deleted successfully.");
                        System.out.println();
                    }else
                        System.out.println("Student not found.");
                    break;


                case 0:
                    System.out.println("Goodbye!");
                    scn.close();
                    return;
            }
        }
    }
}
