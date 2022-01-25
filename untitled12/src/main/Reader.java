package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Reader {
    public Collection<User> getCollection() {
        Collection<User> collection = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/users");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                User user = new User(line, reader.readLine(), Integer.parseInt(reader.readLine()), reader.readLine());
                collection.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
// отсортировать пользователей по возрасту по убыванию
//сначала получаю коллекцию вывожу на экран
//        затем сортирую вывожу на экран
