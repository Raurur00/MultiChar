package me.tortugagris.nabradia.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CharacterSheetMapper {
    
    private Connection DBconnection;
    private String DatabaseName;
    private static CharacterSheetMapper instance;

    private CharacterSheetMapper() {
        this.DatabaseName = "MultiChar.db"
        createDatabase();
    }

    public static CharacterSheetMapper getInstance() {
        if (instance == null) {
            // Initalize Instace
            instance = new CharacterSheetMapper();
        }
        
        return instance;
        
    }

    public createDatabase() {
        String url = "jdbc:sqlite:" + this.DatabaseName;

        try (this.DBconnection = DriverManager.getConnection(url)) {

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //Create tables
    }
    //save character
    //reconnect
}