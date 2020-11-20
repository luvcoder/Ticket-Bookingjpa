package service;
import config.PostgresManager;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class TestService {
    public String toUpperCase(String name, Integer age) {
        return name != null && age != null ? name.toUpperCase() + ": " + age : "Empty Input";
    }
    public  List<Map<String, String>> getDataFromDB() {
        Connection connection = PostgresManager.getConnection();
        try {
           Statement preparedStatement  = connection.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery("select * from Passenger");
            List<Map<String, String>> resultList = new ArrayList<>();
            while (resultSet.next()) {
                Map<String, String> result = new HashMap<>();
                result.put("ticket ID", String.valueOf(resultSet.getObject("ticketID")));
                result.put("Name", String.valueOf(resultSet.getObject("name")));
                result.put("Contact", String.valueOf(resultSet.getObject("contact")));
                result.put("Address", String.valueOf(resultSet.getObject("address")));
                resultList.add(result);
            }
            return resultList;
        } catch (SQLException e) {
            System.out.println("Error getting data from table");
            return null;
        }
    }
}

