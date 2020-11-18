package models;
import config.PostgresManager;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.Map;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Service
@RequiredArgsConstructor
public class ChildService {
    public Child createChild(Child child) {
        Connection connection = PostgresManager.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into child(name, contact, address,guardian,idCard ) values (?,?,?,?,?)");
            preparedStatement.setString(1, child.getName());
            preparedStatement.setLong(2, child.getContact());
            preparedStatement.setString(3, child.getAddress());
            preparedStatement.setString(4, child.getGuardian());
            preparedStatement.setLong(5,child.getIdCard());
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("select * from Passenger where name = ?");
            preparedStatement.setString(1, child.getName());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Child(resultSet.getString("name"), resultSet.getInt("age"), resultSet.getString("address"),resultSet.getInt("idCard"),resultSet.getLong("contact"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Map<String, Object> createPassenger(Map<String, Object> passenger) {
        ChildService childService;
        return childService.createPassenger(passenger);
    }
}
