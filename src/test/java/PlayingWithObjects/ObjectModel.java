package PlayingWithObjects;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjectModel {
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "ObjectModel{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    ObjectModel(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
}
