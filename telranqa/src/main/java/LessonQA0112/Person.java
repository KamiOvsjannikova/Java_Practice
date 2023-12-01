package LessonQA0112;

import java.util.Objects;

public class Person {

        private int year;

        private Address address;

        public Person(int year, Address address) {
                this.year = year;
                this.address = address;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return year == person.year && Objects.equals(address, person.address);
        }

        @Override
        public int hashCode() {
                return Objects.hash(year, address); // takie ze polja dolzni bitj kak i v return year == person.year && Objects.equals(address, person.address);
        }

//        @Override
//        public boolean equals(Object obj) {
//                if (this == obj) {
//                        return true;
//        }
//                if(obj == null) {
//                        return false;
//                }
//                //3
//                if(!(obj instanceof Person)){
//                        return false;
//                }
//                //4
//                Person person  = (Person) obj;
//                return this.year == person.year && this.address.equals(person.address);
//        }
//


}
