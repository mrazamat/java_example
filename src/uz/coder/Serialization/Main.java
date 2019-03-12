package uz.coder.Serialization;

import java.io.*;
// Сериализация
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.lifeLevel = 55;
        user.staticField=11;
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        user.staticField = 22;
        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser=(User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.staticField);
        System.out.println(newUser.sord);


    }
}
