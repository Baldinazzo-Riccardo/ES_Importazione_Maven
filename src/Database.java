import java.sql.Connection;

import static java.lang.IO.println;

public class Database {

    private Connection connection;

    public Database(){
        if(connect()){
            println("Connessione riuscita");
        }
        else{
            println("Connessione fallita");
        }
    }

    private boolean connect(){
        return true;
    }

}
