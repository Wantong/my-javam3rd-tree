import java.io.Serializable;
import java.io.*;
class Book implements Serializable {
    int id;
    String name;
    String author;
    float price;
    public Book(int id, String name, String author, float price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
public class SerializationTester{
    public static void main(String args[])throws IOException,ClassNotFoundException{
        Book book=new Book(100032,"Java Program Skills","Wang Sir",30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
        oos.writeObject(book);
        oos.close();
        book=null;
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.dat"));
        book=(Book) ois.readObject();
        ois.close();
        System.out.println("ID is:" + book.id);
        System.out.println("name is:" + book.name);
        System.out.println("author is:" + book.author);
        System.out.println("price is:" + book.price);



    }


}

