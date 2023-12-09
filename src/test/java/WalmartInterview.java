/**/

import java.io.*;
import java.util.*;

interface IAnimal {
    void setId(int id);
    int getId();
    void setSpecies(String species);
    String getSpecies();
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
}

interface IZoo {
    void addAnimal(IAnimal animal);
    void removeAnimal(int id);
    int countAnimals();
    List<IAnimal> getAnimalsBySpecies(String species);
    List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();
}
class Animal implements IAnimal {
    int id;
    String species;
    String name;
    int age;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

class Zoo implements IZoo {
    private List<IAnimal> animals = new ArrayList<>();

    public void addAnimal(IAnimal animal){
        animals.add(animal);
    }

    public void removeAnimal(int id){
        int index = animals.indexOf(animals.get(id));
        animals.remove(index);
    }

    public int countAnimals(){
        int count = animals.size();
        return count;
    }

    public List<IAnimal> getAnimalsBySpecies(String species){
        /*
          1 animal1, mammal, 12
        2 animal2, bird, 12
        3  animal3, mammal, 15

        mammal:
        animal1, animal3
        */

        List<IAnimal> matchedAnimals = new ArrayList<>();
        for(int i = 0; i< animals.size(); i++){
            if(species.equalsIgnoreCase(animals.get(i).getSpecies())){//Str (species) = Str (species)
                matchedAnimals.add(animals.get(i));
            }
        }
        return matchedAnimals;
    }

    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge(){
        /*
        1 animal1, mammal, 15
        2 animal2, bird, 15
        3  animal3, mammal, 12

        K           V

        15          animal3 - mammal
        12          animal1 - mammal, animal2 - bird
        */

        Map<Integer, List<IAnimal>> result = new HashMap<>();

        for(IAnimal animal : animals){
            int age = animal.getAge();
            if(!result.containsKey(age)){
                result.put(age, new ArrayList<IAnimal>());
            }
            result.get(age).add(animal);
        }

        List<Map.Entry<Integer, List<IAnimal>>> entryList = new ArrayList<>(result.entrySet());

        Collections.sort(entryList, Map.Entry.comparingByKey());

        Map<Integer, List<IAnimal>> sortedMap = new LinkedHashMap<>();
        for ( Map.Entry<Integer, List<IAnimal>>  entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        List<Map.Entry<Integer, List<IAnimal>>> resultOut = new ArrayList<>(sortedMap.entrySet());
        return resultOut;
    }
}
public class WalmartInterview {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        IZoo zoo = new Zoo();
        int aCount = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= aCount; i++) {
            String[] a = br.readLine().trim().split(" ");
            IAnimal e = new Animal();
            e.setId(Integer.parseInt(a[0]));
            e.setSpecies(a[1]);
            e.setName(a[2]);
            e.setAge(Integer.parseInt(a[3]));
            zoo.addAnimal(e);
        }

        out.println("There are " + zoo.countAnimals() + " animals in the zoo");
        String[] b = br.readLine().trim().split(" ");
        String species = b[0];
        List<IAnimal> specAnimals = zoo.getAnimalsBySpecies(species);
        out.println(species + ":");
        for (IAnimal sp : specAnimals) {
            out.println("" + sp.getName() + " (" + sp.getAge() + " years old)");
        }
        List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();
        out.println("Animals by age:");
        for (Map.Entry<Integer, List<IAnimal>> groups : animalsByAge) {
            out.println("" + groups.getKey() + " year(s) old:");
            for (IAnimal animal : groups.getValue()) {
                out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
        String[] c = br.readLine().trim().split(" ");
        int id = Integer.parseInt(c[0]);
        zoo.removeAnimal(id);
        out.println("There are now " + zoo.countAnimals() + " animals in the zoo");

        out.flush();
        out.close();
    }
}