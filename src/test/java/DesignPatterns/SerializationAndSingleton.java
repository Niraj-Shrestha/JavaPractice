package DesignPatterns;

import java.io.*;

public class SerializationAndSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationAndSingleton(){}

    private static class SingletonHelper {
        private static final SerializationAndSingleton instance = new SerializationAndSingleton();
    }

    public static SerializationAndSingleton getInstance(){
        return SingletonHelper.instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationAndSingleton instanceOne = SerializationAndSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializationAndSingleton instanceTwo = (SerializationAndSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }

}
