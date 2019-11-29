package pl.agh.db2.northwind.controllers;

import com.ibatis.common.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class ImportDataController {


    private String user;
    private String password;
    private String url;
    private String driver;


    @GetMapping("/import")
    @ResponseBody
    public String categoryList() throws ClassNotFoundException, SQLException, IOException {
        Class.forName(driver);
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String scriptName = "test-data.sql";
            importFromResource(connection, scriptName);
        }
        return "Done";
    }

    private void importFromResource(Connection connection, String scriptName) throws IOException, SQLException {
        ScriptRunner scriptRunner = new ScriptRunner(connection, false, true);
        InputStreamReader reader = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(scriptName));
        scriptRunner.runScript(reader);
    }


    @Value("${spring.datasource.username}")
    public void setUser(String user) {
        this.user = user;
    }

    @Value("${spring.datasource.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${spring.datasource.url}")
    public void setUrl(String url) {
        this.url = url;
    }

    @Value("${spring.datasource.driver-class-name}")
    public void setDriver(String driver) {
        this.driver = driver;
    }
}
