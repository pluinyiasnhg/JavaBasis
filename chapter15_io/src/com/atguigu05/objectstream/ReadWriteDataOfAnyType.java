package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ReadWriteDataOfAnyType
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author pluinyiasnhg
 * @Create 2026/3/9 15:17
 * @Version 1.0
 */
public class ReadWriteDataOfAnyType {
    @Test
    public void save() throws IOException {
        String name = "巫师";
        int age = 300;
        char gender = '男';
        int energy = 5000;
        double price = 75.5;
        boolean relive = true;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("game.dat"));
        oos.writeUTF(name);
        oos.writeInt(age);
        oos.writeChar(gender);
        oos.writeInt(energy);
        oos.writeDouble(price);
        oos.writeBoolean(relive);

        oos.close();
    }

    @Test
    public void reload() throws IOException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("game.dat"));

        String name = ois.readUTF();
        int age = ois.readInt();
        char gender = ois.readChar();
        int energy = ois.readInt();
        double price = ois.readDouble();
        boolean relive = ois.readBoolean();

        System.out.println(name+"," + age + "," + gender + "," + energy + "," + price + "," + relive);

        ois.close();
    }
}
