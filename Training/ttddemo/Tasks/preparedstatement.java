import java.sql.*;

public class preparedstatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // Writing the SQL query with placeholders for parameters
            String sql = "SELECT * FROM users WHERE username = ?";

            // Creating a PreparedStatement object and setting parameter value
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "desired_username");

            // Executing the query
            resultSet = preparedStatement.executeQuery();

            // Processing the results
            while (resultSet.next()) {
                // Accessing the data
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                // Print or process the retrieved data
                System.out.println("Username: " + username + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing the resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}