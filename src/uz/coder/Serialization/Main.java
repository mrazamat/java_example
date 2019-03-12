package uz.coder.Serialization;

import java.io.*;
// Сериализация
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.lifeLevel = 55;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser=(User) objectInputStream.readObject();
        System.out.println(newUser.lifeLevel);

    }
}
