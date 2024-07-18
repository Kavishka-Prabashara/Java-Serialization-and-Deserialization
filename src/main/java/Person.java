import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Person implements Serializable {
    private String name;
    private String nic;
    private Integer age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}



