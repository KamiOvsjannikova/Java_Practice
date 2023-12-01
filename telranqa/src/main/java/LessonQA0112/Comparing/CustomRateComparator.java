package LessonQA0112.Comparing;

import java.util.Comparator;

public class CustomRateComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRate() - o2.getRate();
    }
}