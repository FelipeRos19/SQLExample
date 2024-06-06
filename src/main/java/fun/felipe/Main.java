package fun.felipe;

import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("localhost", 3306, "test", "root", "");

        try (Query query = database.executeQuery("SELECT * FROM test;")) {
            ResultSet resultSet = query.getResultSet();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (Exception exception) {
            exception.printStackTrace(System.err);
        }
    }
}