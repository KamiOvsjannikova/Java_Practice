package lessonQA1512.mapTest;

import java.util.*;

public class DoctorTest {
    public static void main(String[] args) {
        // Petrov, Maximov, Olegov
        //key - doctor, value - work or not

        // petrov - timetable(9,10,11,12)
        // maximov- timetable(11,12)
        // olegov - timetable(13,14,15,16)

        Map<String, Boolean> map = new HashMap<>();
        //key - doctor , value - work or not
        map.put("Petrov", true); // v etot denj rabotaet
        map.put("Maximov", false);
        map.put("Olegov", true);

        // checkDoctorsAvailable(map);

        List<Integer> petrovSlot = Arrays.asList(9, 10, 11, 12);
        List<Integer> maximovSlot = Arrays.asList(11, 12);
        List<Integer> olegovSlot = Arrays.asList(13, 14, 15, 16);

        Map<String, List<Integer>> doctorsSchedule = new HashMap<>();
        doctorsSchedule.put("petrov", petrovSlot);
        doctorsSchedule.put("maximov", maximovSlot);
        doctorsSchedule.put("olegov", olegovSlot);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor surname :");
        String surname = scanner.next().toLowerCase();

        printDoctorSchedule(surname, doctorsSchedule);
    }
    private static void printDoctorSchedule(String doctorSurname, Map<String, List<Integer>> doctorsSchedule) {
        if (doctorsSchedule.containsKey(doctorSurname)) {
            List<Integer> timeslots = doctorsSchedule.get(doctorSurname);
            System.out.println("Time slot for doctor " + doctorSurname + " : ");
            for (Integer slot : timeslots) {
                System.out.print(" " + slot);
            }
        } else {
            System.out.println("There is no doctor with this surname");
        }
    }

//        map.forEach((key, value) -> { //key =doctor , value = works
//            System.out.println("Doctor "+ key + " works today : " + value);
//        });
//        System.out.println("Enter doctor's surname : ");
//        Scanner scanner = new Scanner(System.in);
//        String surname = scanner.next();
//        if (map.containsKey(surname)) {
//            Boolean isWork = map.get(surname);
//            System.out.println("Doctor " + surname + " works today: " + isWork);
//        } else {
//            System.out.println("There is no doctor with this surname");
//        }
//    }
    private static boolean checkDoctorsAvailable(Map<String, Boolean> map) {
        System.out.println("Enter doctor's surname : ");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.next().toLowerCase();

        if (map.containsKey(surname)) {
            Boolean isWork = map.get(surname);
            System.out.println("Doctor " + surname + " works today: " + isWork);
        } else {
            System.out.println("There is no doctor with this surname");
        }
        return false;
    }
    private  static void  printAllDoctorsSchedule(Map<String, Boolean> map) {
        map.forEach((key, value) -> { //key =doctor , value = works
            System.out.println("Doctor "+ key + " works today : " + value);
        });
    }
}

