/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tattoo;
import java.sql.*;

/**
 *
 * @author kaydr
 */
public class Admin {
    
    //Variables
        String id, fnam, lnam, unam, passwd, day, apmnttime, apptID, artID, SchedID, ArtistName, Hours, Working, WeekOf;
        Connection connection;
    
     //Constructors 
     public Admin(String a, String b, String c, String d, String e, String f, String g, String h, String i)
		{
                    id = a;
                    fnam = b;
                    lnam = c;
                    unam = d;
                    passwd = e;
                    day = f;
                    apmnttime = g;
                    apptID = h;
                    artID = i;
                    
		}//end constructor
     
     public Admin() throws SQLException, ClassNotFoundException {
	    
                //Try/catch stateament for setting up and connecting to the database
	   	try{
	   		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	   		System.out.println("Driver loaded");

	   		
	   		// Connect to a database
	   		connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/kaydr/Documents/School/Java/TattooParlorDatabase.accdb"); 
	   		System.out.println("Database connected");
	    }
	   	catch (Exception e){
			System.out.println("Could not complete database task");
		}
	    
	    }
     
     

     //get and set methods
    public void setapmnttime(String at) {apmnttime = at;}
    public String getapmnttime() {return apmnttime;}
    
    public void setWeekOf(String wo) {WeekOf = wo;}
    public String getWeekOf() {return WeekOf;}
    
    public void setWorking(String wk) {Working = wk;}
    public String getWorking() {return Working;}
    
    public void setHours(String hr) {Hours = hr;}
    public String getHours() {return Hours;}
    
    public void setSchedID(String scid) {SchedID = scid;}
    public String getSchedID() {return SchedID;}
    
    public void setArtistName(String artidd) {ArtistName = artidd;}
    public String getArtistName() {return ArtistName;}
    
    public void setapptID(String ai) {apptID = ai;}
    public String getapptID() {return apptID;}
    
    public void setartID(String aid) {artID = aid;}
    public String getartID() {return artID;}
             
    public void setunam(String un) {unam = un;}
    public String getunam() {return unam;}
    
    public void setday(String dy) {day = dy;}
    public String getday() {return day;}
    
    public void setpassword(String pw) {passwd = pw;}
    public String getpassword() {return passwd;}
    
    public void setid(String i) {id = i;}
    public String getid() {return id;}
    
    public void setfname(String fn) {fnam = fn;}
    public String getfname() {return fnam;}
    
    public void setlname(String ln) {lnam = ln;}
    public String getlname() {return lnam;}
     
     
    //displays info using variables previously instantiated
    public void display() throws SQLException, ClassNotFoundException{

    
        System.out.println("Customer Username        = "+getunam());
        System.out.println("Customer Password        = "+getpassword());
        System.out.println("Customer  ID             = "+getid());
        System.out.println("Customer FirstName       = "+getfname());
        System.out.println("Customer LastName        = "+getlname());
      

          

    }//end display
    
        public void displayDaySchedule() throws SQLException, ClassNotFoundException{

    
        System.out.println("DayFirstNAme        = "+getfname());
        System.out.println("DayFirstNAme        = "+getlname());
        System.out.println("AppointmentTime     = "+getapmnttime());
        System.out.println("Day                 = "+getday());

      

          

    }//end displayDaySchedule
        
        public void displaySingleCustomer() throws SQLException, ClassNotFoundException{

    
        System.out.println("CustFirstNAme        = "+getfname());
        System.out.println("CustFirstNAme        = "+getlname());
        System.out.println("AppointmentTime     = "+getapmnttime());
        System.out.println("Day                 = "+getday());

      

          

         }//end displaySingleCustomer
        
        
        public void displayAppointment() throws SQLException, ClassNotFoundException{

    
      
        System.out.println("CustFirstNAme       = "+getfname());
        System.out.println("CustLastNAme        = "+getlname());
        System.out.println("AppointmentTime     = "+getapmnttime());
        System.out.println("Day                 = "+getday());
        System.out.println("apptID              = "+getapptID());
        System.out.println("artID               = "+getartID());
        System.out.println("id                  = "+getid());
        
        

      

          

         }//end displaySingleCustomer
        
                public void displayWeeklySchedule() throws SQLException, ClassNotFoundException{

    
        System.out.println("SchedID             = "+getSchedID());
        System.out.println("day                 = "+getday());
        System.out.println("ArtistName          = "+getArtistName());
        System.out.println("Hours               = "+getHours());
        System.out.println("Working             = "+getWorking());
        System.out.println("WeekOf              = "+getWeekOf());
        System.out.println("artID               = "+getartID());
        
        
        

      

          

         }//end displayWeeklySchedule
        
        
    
    
    public void selectDB(String SID) throws SQLException, ClassNotFoundException{

	id = SID;
	//create Statement
    

	 Statement statement = connection.createStatement();



	 //execute statement
	 ResultSet resultSet = statement.executeQuery ("select CustomerID, FName, LName, Username, Password from customer where CustomerID = \"" + SID + "\"");


	 resultSet.next();
	  passwd = resultSet.getString(5);
	  id = resultSet.getString(1);
	  fnam = resultSet.getString(2);
	  lnam = resultSet.getString(3);
	  unam = resultSet.getString(4);



	

    }//end select db
    
    
    
    
    //update db method
    
    public void updateDB(String a, String b, String c, String d, String e)  throws SQLException, ClassNotFoundException{
	

	 id = a;
         fnam = b;
         lnam = c;
         unam = d;
         passwd = e;
         
         System.out.println("A = " + a);
	//create Prepared Statement
        
        //PreparedStatement preparedStatement = connection.prepareStatement(
        //  "UPDATE patients SET firstName = ?, lastName = ?, email = ?, addr = ?, insCo = ?");// WHERE patID = \"" + f + "\"");

         PreparedStatement preparedStatement = connection.prepareStatement(
         "UPDATE Customer SET FName = ?, LName = ?, Username = ?, Password = ? WHERE CustomerID = " + a  );
         //UPDATE Customer SET FName = "CoRalinE", LName = "JonEs", Username = "ItsCORaline", Password = "COR"  WHERE CustomerID = 3001;
	

// set values 

	preparedStatement.setString(1, b);
	preparedStatement.setString(2, c);
	preparedStatement.setString(3, d);
        preparedStatement.setString(4, e);

	
	
	
	// execute update
	
	preparedStatement.executeUpdate();
	}//end update
    
    
    public void createDB(String a, String b, String c, String d, String e) throws SQLException, ClassNotFoundException{
        
         id = a;
         fnam = b;
         lnam = c;
         unam = d;
         passwd = e;
         

	//create Prepared Statement
        
        //PreparedStatement preparedStatement = connection.prepareStatement(
        //  "UPDATE patients SET firstName = ?, lastName = ?, email = ?, addr = ?, insCo = ?");// WHERE patID = \"" + f + "\"");

         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Customer (CustomerID, FName, LName, Username, Password)\n" +
"VALUES (?,?,?,?,?)");
         


// set values 
        preparedStatement.setString(1, a);
	preparedStatement.setString(2, b);
	preparedStatement.setString(3, c);
	preparedStatement.setString(4, d);
        preparedStatement.setString(5, e);


	
	
	// execute update
	
	preparedStatement.executeUpdate();
    

    
    }//end createDB
    
        public void createArtistDB(String a, String b, String c, String d, String e) throws SQLException, ClassNotFoundException{
        
         id = a;
         fnam = b;
         lnam = c;
         unam = d;
         passwd = e;
         

	//create Prepared Statement
        
        //PreparedStatement preparedStatement = connection.prepareStatement(
        // INSERT INTO Artist (ArtistID, FName, LName, Username, Password) VALUES ('2004','Chicken','Noodle','CN','CNN');


         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Artist (ArtistID, FName, LName, Username, Password)\n" +
"VALUES (?,?,?,?,?)");
         


// set values 
        preparedStatement.setString(1, a);
	preparedStatement.setString(2, b);
	preparedStatement.setString(3, c);
	preparedStatement.setString(4, d);
        preparedStatement.setString(5, e);


	
	
	// execute update
	
	preparedStatement.executeUpdate();
    

    
    }//end createArtistDB
        
 public void createWeeklyScheduleDB(String a, String b, String c, String d, String e) throws SQLException, ClassNotFoundException{
        
         id = a;
         fnam = b;
         lnam = c;
         unam = d;
         passwd = e;
         

	//create Prepared Statement
        
        //PreparedStatement preparedStatement = connection.prepareStatement(
        // INSERT INTO Artist (ArtistID, FName, LName, Username, Password) VALUES ('2004','Chicken','Noodle','CN','CNN');


         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Artist (ArtistID, FName, LName, Username, Password)\n" +
"VALUES (?,?,?,?,?)");
         


// set values 
        preparedStatement.setString(1, a);
	preparedStatement.setString(2, b);
	preparedStatement.setString(3, c);
	preparedStatement.setString(4, d);
        preparedStatement.setString(5, e);


	
	
	// execute update
	
	preparedStatement.executeUpdate();
    

    
    }//end createWeeklyScheduleDB
    
    public void createAppointmentDB(String a, String b, String c, String d, String e, String f, String g) throws SQLException, ClassNotFoundException{
        
        
         apptID = a;
         apmnttime = b;
         artID = c;
         id = d;
         day = e;
         fnam = f;
         lnam = g;
         
         

	//create Prepared Statement
        
        //INSERT INTO Appointments (AppointmentID, ApmntTime, AritistID, CustomerID, Day, Fname, Lname)
         //VALUES ('7', '8am', '2001', '3002', 'TH', 'Man', "Wol");;

         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Appointments (AppointmentID, ApmntTime, AritistID, CustomerID, Day, Fname, Lname)\n" +
"VALUES (?,?,?,?,?,?,?)");
         


// set values 
        preparedStatement.setString(1, a);
	preparedStatement.setString(2, b);
	preparedStatement.setString(3, c);
	preparedStatement.setString(4, d);
        preparedStatement.setString(5, e);
        preparedStatement.setString(6, f);
        preparedStatement.setString(7, g);


	
	
	// execute update
	
	preparedStatement.executeUpdate();
    

    
    }//end createAppointmentDB
    
    
        public void selectArtistDB(String un) throws SQLException, ClassNotFoundException{

	unam = un;
	//create Statement
    

	 Statement statement = connection.createStatement();



	 //execute statement
	 ResultSet resultSet = statement.executeQuery ("select ArtistID, FName, LName, Username, Password from Artist where Username = \"" + un + "\"");


	 resultSet.next();
	  
	  id = resultSet.getString(1);
	  fnam = resultSet.getString(2);
	  lnam = resultSet.getString(3);
	  unam = resultSet.getString(4);
          passwd = resultSet.getString(5);


	

    }//end select Artistdb
        
         public void selectAdminDB(String un) throws SQLException, ClassNotFoundException{

	unam = un;
	//create Statement
    

	 Statement statement = connection.createStatement();



	 //execute statement
	 ResultSet resultSet = statement.executeQuery ("select AdminID, FName, LName, Username, Password from Admin where Username = \"" + un + "\"");


	 resultSet.next();
	  
	  id = resultSet.getString(1);
	  fnam = resultSet.getString(2);
	  lnam = resultSet.getString(3);
	  unam = resultSet.getString(4);
          passwd = resultSet.getString(5);


	

    }//end select AdminDB
        
        public void updateArtistDB(String a, String b, String c, String d, String e)  throws SQLException, ClassNotFoundException{
	

	 id = a;
         fnam = b;
         lnam = c;
         unam = d;
         passwd = e;
         
         System.out.println("A = " + a);
	//create Prepared Statement
        
        //PreparedStatement preparedStatement = connection.prepareStatement(
        //  "UPDATE patients SET firstName = ?, lastName = ?, email = ?, addr = ?, insCo = ?");// WHERE patID = \"" + f + "\"");

         PreparedStatement preparedStatement = connection.prepareStatement(
         "UPDATE Artist SET FName = ?, LName = ?, Username = ?, Password = ? WHERE ArtistID = " + a  );
         //UPDATE Customer SET FName = "CoRalinE", LName = "JonEs", Username = "ItsCORaline", Password = "COR"  WHERE CustomerID = 3001;
	

// set values 

	preparedStatement.setString(1, b);
	preparedStatement.setString(2, c);
	preparedStatement.setString(3, d);
        preparedStatement.setString(4, e);

	
	
	
	// execute update
	
	preparedStatement.executeUpdate();
	}//end updateArtistDB
        
    
        public void dailyAppointments(String ID, String dy) throws SQLException, ClassNotFoundException{

	id = ID;
        day = dy;
	//create Statement
    

	 Statement statement = connection.createStatement();



	 //execute statement
	 ResultSet resultSet = statement.executeQuery ("SELECT FName, LName, ApmntTime, Day from Appointments WHERE AritistID = \"" + ID + "\" AND day = \"" + dy + "\"");
//SELECT FName, LName, ApmntTime, Day from Appointments WHERE AritistID = "2001" AND day = "M";

	 resultSet.next();
	  
	  
	  fnam = resultSet.getString(1);
	  lnam = resultSet.getString(2);
          apmnttime = resultSet.getString(3);
          day = resultSet.getString(4);



	

    }//end select dailyAppointments
        

        public void singleCustomerSelect(String fn, String ln) throws SQLException, ClassNotFoundException{

        fnam = fn;
        lnam = ln;
	//create Statement
    

	 Statement statement = connection.createStatement();



	 //execute statement
	 ResultSet resultSet = statement.executeQuery ("SELECT FName, LName, ApmntTime, Day from Appointments where Fname = \"" + fn + "\" AND Lname = \"" + ln + "\"");
//SELECT FName, LName, ApmntTime, Day from Appointments where Fname = "Coraline" AND Lname = "jones";

	 resultSet.next();
	  
	  
	  fnam = resultSet.getString(1);
	  lnam = resultSet.getString(2);
          apmnttime = resultSet.getString(3);
          day = resultSet.getString(4);



	

    }//end select Artistdb
        
        
        
     //main method
     public static void main(String args[]) {
        
         
         try {
         //test code
        //create new admin object
             Admin a1 = new Admin();
             
            // a1.selectAdminDB("NG");
           //  a1.updateArtistDB("2001", "Jenny", "Lee", "JL", "JLL");
          //   a1.createArtistDB("2004", "Chicken", "Noodle", "CN", "CC");
             //a1.dailyAppointments("2001", "M");
            // a1.singleCustomerSelect("Coraline", "Jones");
           // a1.createAppointmentDB("8", "11am", "2003", "3002", "F", "Man", "Wol");
             
             //VALUES ('7', '8am', '2001', '3002', 'TH', 'Man', "Wol");;

          // a1.updateArtistDB("3001", "Coraline", "Jones", "CORALINE", "COR");
           //  a1.createDB("3007","Annie","Boora","AB","123");
             a1.displayWeeklySchedule();
            
         //  a1.display();
        
         }//end try
         catch (Exception e){System.out.println("Cannot complete task." + e);}//end catch
     }//end main
    
    
}
