package LessonQA0112;

import java.util.Objects;

public class Address {

    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override // pri pomowi Generate
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        // odin iz objectov ne null
//        if (obj == null) {
//            return false;
//        }
//
//        //3 esli ne prinadlezit classu cat
//        if(!(obj instanceof Cat)){
//            return  false;
//        }
//        //4 privedenie tipa
//        Address address = (Address) obj;
//
//        return (this.address.equals(address.address));
//    }
}
