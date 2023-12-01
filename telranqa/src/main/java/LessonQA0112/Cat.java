package LessonQA0112;

public class Cat {

    private int age;

    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // odin iz objectov ne null
        if (obj == null) {
            return false;
        }

    //3 esli ne prinadlezit classu cat
    if(!(obj instanceof Cat)){
        return  false;
    }
    //4 privedenie tipa
    Cat cat = (Cat) obj;

        return this.name == cat.name && this.age == cat.age; // tolko esli eto usl. sobludeno
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

