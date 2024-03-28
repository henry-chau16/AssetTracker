package mapping;

public class DBinit {
    private SQLController sqlite = SQLController.getConnector();
    
    DBinit(){
    	
    }

    public void dbInit() {
    	
    	if(!sqlite.dbExists()) {
    		System.out.println(sqlite.connectDB());
            System.out.println(sqlite.createTables("Categories",
            		"CategoryID INTEGER PRIMARY KEY, Name TEXT unique not null"));
            System.out.println(sqlite.createTables("Locations",
            		"LocationID INTEGER PRIMARY KEY, Name TEXT unique not null, Description TEXT"));  
            
    	}
    	else {
    		System.out.println(sqlite.connectDB());
    	}
      
    }
    
    public void closeDB() {
    	System.out.println(sqlite.closeConnection());
    }

}



