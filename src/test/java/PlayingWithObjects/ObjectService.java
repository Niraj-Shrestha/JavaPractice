package PlayingWithObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ObjectService {
    public ObjectModel getData(){
        ObjectModel objectModels = new ObjectModel(11, "niraj", "male");
        return objectModels;
    }
}
