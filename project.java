import java.util.*;
//Available Hotels
class Hotel
{
    static String skblue = "\u001B[36m";
    static String MAGENTA= "\u001B[35m";
    static String under ="\u001B[21m";
    static String backyellow="\u001B[140m";
    static String black="\u001B[40m";
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static  String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static  String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static  String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static  String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    static  String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static  String ANSI_CYAN_BACKGROUND = "\u001B[46m";
     static  String WHITE= "\u001B[47m";
    static String BLACK_BOLD = "\033[1;30m";  // BLACK
     static  String red = "\033[1;31m";    // RED
     static  String green = "\033[1;32m";  // GREEN
     static  String yellow  = "\u001B[40m"; // YELLOW
     static  String blue = "\033[1;34m";   // BLUE
     static  String purple = "\033[1;35m"; // PURPLE
     static final String cyan = "\033[1;36m";   // CYAN
     static final String white = "\033[1;37m"; 


  static Scanner sc=new Scanner(System.in);
  static Hotel obj=new Hotel();
  static double Roomprice;
  Double bill;
  static int total;
  static int Kind;
  static void displayhotels()
  {

System.out.println(green+blink+"\t\t\t\t\t\t\t***** WELCOME ******"+def);
System.out.println(yellow+      "                                                .=************************************************=.        ");                                         
            System.out.println("                                                .#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.       ");                                          
            System.out.println("                                                -@*::::::::::::::::::::::::::::::::::::::::::::::::*@-       ");                                          
            System.out.println( "                                                -@+................................................+@-        ");                                         
            System.out.println("                                                .#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.         "+def);                                        
     System.out.println(blue+ "                                                 .=+*%#****************************************#%*+=.          ");                                        
            System.out.println( "                                                    :%+                                        +%-             ");                                        
            System.out.println( "                                                    :%+   *-  :#.  =##*: :*****:=****+ +#      +%:              ");                                       
            System.out.println("                                                    :%+   %+  -@. *@+-#%:.+*@+=.+%*++= *@      +%:              ");                                       
            System.out.println("                                        ............-%+   %+  -@.:@=   #*  .@:  +%     *@      +%-............    ");                                     
            System.out.println("                                     :*%@@@@@@@@@@@@%%+   %#**#%.=%    =%  :@:  +@###- *@      +%%@@@@@@@@@@@@%*: ");                                     
            System.out.println("                                    :%%#++++++++++++*%+   %#==*@.-@    +%  :@:  +@===. *@      +%*++++++++++++#%%: ");                                    
            System.out.println("                                    %%%+++++++++++++*%+   %+  -@..@*. -@+  :@:  +@.... *@...   +%*++++++++++++*%%% ");                                    
            System.out.println("                                   :@%@@@@@@@@@@@@@@@%+   %+  -@. :%%%%#   :@:  +@%%%* #@%%%   +%@@@@@@@@@@@@@@@%@:"+def);                                    
    System.out.println(purple +"                                   :@*..............-%+   :.   :    :-:    .=.  .::::. :::::   +%-..............*@:");                                    
            System.out.println("                                   :@*              :%+                                        +%:              *@: ");                                   
            System.out.println("                                   :@*              :%+                                        +%:              *@:");                                    
            System.out.println("                                   :@*  :########=  :%+                                        +%:  =########:  *@: ");                                   
            System.out.println("                                   :@*  =@%%%%%%%*  :%+                                        +%:  *%%%%%%%@=  *@:  ");                                  
            System.out.println("                                   :@*  =@-    .%*  :%+                                        +%:  *%.    -@=  *@:");                                    
            System.out.println("                                   :@*  =@-    .%*  :%+  -@@@@@@@@@.  *@@@@@@@@*  .@@@@@@@@@-  +%:  *%.    -@=  *@: ");                                   
            System.out.println("                                   :@*  =@-    .%*  :%+  +%%%%%%%%%:  #%%%%%%%%#  :%%%%%%%%%+  +%:  *%.    -@=  *@:  ");                                  
            System.out.println("                                   :@*  =@-    .%*  :%+  +@-     +%:  #%      %#  :%+     -@+  +%:  *%.    -@=  *@:  ");                                  
            System.out.println("                                   :@*  =@-    .%*  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  *%.    -@=  *@:   ");                                 
            System.out.println("                                   :@*  =@-    .%*  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  *%.    -@=  *@:   ");                                 
            System.out.println("                                   :@*  =@%%%%%%%*  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  *%%%%%%%@=  *@:    ");                                
            System.out.println("                           :*%%%%%%%@*  -%%%%%%%%+  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  +%%%%%%%%-  *@%%%%%%%*. ");                           
            System.out.println("                         .#@@%%%%%%%%*   ........   :%+  +@=     +%:  %%      %%  :%+     =@+  +%:   ........   *@%%%%%%%%@*. ");                         
            System.out.println("                         #%#-:.....-@*  .+===++++:  :%+  +%%#####%%:  #%######%#  :%%#####%%+  +%:  :+++=++++.  *@-......-*@#     ");                     
            System.out.println("                        -%%:-------=@*  =@%@@@@%%*  :%+  -%%%%%%%%%.  *%%%%%%%%*  .%%%%%%%%@-  +%:  *%%@@@@%@=  *@=-------:%%- ");                        
            System.out.println("                        =@%@@@@@@@@@%*  =@+::::-%*  :%+                                        +%:  *%-::::+@=  *%@@@@@@@@@%@=  ");                       
            System.out.println("                        =@*========+@*  =@-    .%*  :%+  .*********   =********=   *********.  +%:  *%.    -@=  *@+========*@=  ");                       
            System.out.println("                        =@- .::::: :@*  =@-    .%*  :%+  +@%%%%%%%@:  #%%%%%%%%#  :@%%%%%%%@+  +%:  *%.    -@=  *@: :::::. -@=  ");                       
            System.out.println("                        =@-.%%%%%%-:@*  =@-    .%*  :%+  +@=:::::*%:  #%:.::.:%#  :%*.::::=@+  +%:  *%.    -@=  *@:-%%%%%%.-@=  ");                       
            System.out.println("                        =@-.%#**#@=:@*  =@-    .%*  :%+  +@-     +%:  %%      %%  :%+     -@+  +%:  *%.    -@=  *@:=@#**#%.-@=  ");                       
            System.out.println("                        =@-.%+  :@=:@*  =@-    .@*  :%+  +@-     +%:  %%      %%  :%+     -@+  +%:  *%.    -@=  *@:=@-  +%.-@=    ");                     
            System.out.println("                        =@-.%+  -@=:@*  =@*====+%*  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  *%+====*@=  *@:=@-  +%.-@=  ");                       
            System.out.println("                        =@-.%+  -@=:@*  -@@@@@@@@*  :%+  +@-     +%:  #%      %%  :%+     -@+  +%:  *@@@@@@@@-  *@:=@-  +%.-@=  ");                       
            System.out.println("                        =@-.@%**#@=:@*   --------.  :%+  +@-     +%:  %%      %%  :%+     -@+  +%:  .--------   *@:=@#**%@.-@= ");                        
            System.out.println("                        =@- @%%%%%-:@*   ::::::::.  :%+  +%#*****#%:  #%******%#  :%#*****#@+  +%:  .::::::::   *@:-@%%%%% -@= ");                        
            System.out.println("                        =@- #####%.:@*  -@@@@@@@@*  :%+  =@@@@@@@@@:  #@@@@@@@@#  :@@@@@@@@@=  +%:  *@@@@@@@@-  *@:.%%##%# -@= ");                        
            System.out.println("                        =@-.@@@@@@=:@*  =@*====+%*  :%+   .........   .:........   .........   +%:  *%+====*@=  *@:=@@@@@%.-@= ");                        
            System.out.println("                        =@-.%+..=@=:@*  =@-    .%*  :%+                                        +%:  *%.    -@=  *@:=@=..+%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  =@-    .%*  :%+                  .:::                  +%:  *%.    -@=  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  =@-    .%*  :%+                .*@@@@%=                +%:  *%.    -@=  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%*.:=@=:@*  =@-    .%*  :%+               -@%@%#@@%#               +%:  *%.    -@=  *@:=@=:.*%.-@= ");                        
            System.out.println("                        =@-.@%%%%@=:@*  =@-    .%*  :%+              :@@-    .#@#              +%:  *%.    -@=  *@:=@%%%%@.-@= ");                        
            System.out.println("                        =@- *#####.:@*  =@=::::-%*  :%+              %%-       *@=             +%:  *%-::::=@=  *@:.#####* -@= ");                        
            System.out.println("                        =@-.@%@%%@-:@*  =@@@@@@@%*  :%+             :@*        :%%             +%:  *%@@@@@@@=  *@:-@%%@%@.-@= ");                        
            System.out.println("                        =@-.%%**#@=:@*  .#*******-  :%+             +@-         #@.            +%:  -*******#.  *@:=@#**%%.-@= ");                        
            System.out.println("                        =@-.%+  :@=:@*              :%+             *@:         *@.            +%:              *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  -@@@@@@@@+  :%+             *@:         *@.            +%:  +@@@@@@@@-  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  =@######%*  :%+             *@:         *@.            +%:  *%######@=  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%%###@=:@*  =@-    .%*  :%+             *@:         *@.            +%:  *%.    -@=  *@:=@###%@.-@=");                         
            System.out.println("                        =@-.%%%%%%-:@*  =@-    .%*  :%+             *@:         *@.            +%:  *%.    -@=  *@:-%%%%%%.-@=");                         
            System.out.println("                        =@- *####*.:@*  =@-    .%*  :%+             *@:         *@.            +%:  *%.    -@=  *@:.**###* -@= ");                        
            System.out.println("                        =@-.@%@@@@=:@*  =@-    .%*  :%+             *@:         *@.            +%:  *%.    -@=  *@:=@@@@@@.-@= ");                        
            System.out.println("                        =@-.%+..=@=:@*  =@-    .%*  :%+             *@:         *@.            +%:  *%.    -@=  *@:=@=..+%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  =@=....:%*  :%+             *@:         *@.            +%:  *%:....=@=  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%+  -@=:@*  =@%%%%%%%*  :%+             *@:         *@.            +%:  *%%%%%#%@=  *@:=@-  +%.-@= ");                        
            System.out.println("                        =@-.%*:-+@=:@#==*%%%%%%%%#==+%#=============#%+=========#%+============#%+==#%%%%%%%%*==#@:=@+--*%.-@= "+def);                        
        System.out.println(green+"                        =@-.@@@@@@=:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:=@@@@@@.-@= ");                        
            System.out.println("                        =@- =-----.:@#:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-#@:.=-=-== -@= ");                        
            System.out.println("                        =@+::::::::=@*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*@=::::::::+@= ");                        
            System.out.println("                        =@@@@@@@@@@@%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@@@@@@@@@@=");                         
            System.out.println("                        .+***************************************************************************************************."+def);                         
        System.out.println(MAGENTA+"\t\t\t\t\t-------AVAILABLE HOTELS--------"+def);
	System.out.println(yellow+"\t\t\t--------------------------------------------------------------------------- "+def);
	System.out.println(red+"\t\t        S.NO         HOTEL          RATING(STAR)          RATING(CUSTOMER)        "+def);
	System.out.println(yellow+"\t\t\t---------------------------------------------------------------------------"+def);
	System.out.println(blue+"\t\t	  1         NOVOTEL 	    7-STAR	              4.7         "+def);      
	System.out.println(blue+"\t\t	  2         PARADISE	    5-STAR	              4.5 	      "+def);
	System.out.println(blue+"\t\t	  3         DOLPHINS	    4.5-STAR	              4.3         "+def);
	System.out.println(blue+"\t\t	  4         RADISSON	    4-STAR	              4.4         "+def);
	System.out.println(yellow+"\t\t\t----------------------------------------------------------------------------"+def+"\n\n");

        System.out.println(blue+"Choose which Hotel you want"+def);
        int Hotelname=sc.nextInt();
        switch(Hotelname)
        {
           case 1:
             new Hotel().NOVOTEL();
             break;
           case 2:
             new Hotel().PARADISE();
             break;
           case 3:
             new Hotel().DOLPHINS();
             break;
           case 4:
             new Hotel().RADISSON();
             break;
           default:
              System.out.println(red+"\t\t\t\t\tEnter Valid Input"+def+"\n\n");
              displayhotels();
        }
  }
  //HOTEL NOVOTEL
  void NOVOTEL()
  {
    System.out.println(purple+"************** WELCOME TO NOVOTEL**************"+def);
     System.out.println("Choose the kind of room you want"+"\n\n");
     System.out.println(blue+"\t\t\t\t\t1. AC"+def);
     System.out.println(red+"\t\t\t\t\t2. NON-AC"+def);
     while(true)
     {
        System.out.print(skblue+"Choose the option :"+def);
        int choice =sc.nextInt();
        System.out.println("\n\n");
        if (choice == 1) 
	{
                Kind = 1;
                novdisplayACRooms();
                break;
        } 
	else if (choice == 2) 
        {
                Kind = 2;
                novdisplayNonACRooms();
                break;
        } 
	else 
    	{
                System.out.println(red+"\t\t\t\t\tPlease enter a valid category."+def);
        }
     }
     novhotel();
  }
         static int Rooms;
         static int Roomtype;
         void novhotel()
         {
            System.out.println(MAGENTA+"Choose the type of room you want"+def);
            Roomtype=sc.nextInt();
            if(Roomtype<=4)
            {
               while(true)
               {
                  System.out.println(green+"Enter the number of rooms you want to be book"+def);
                  Rooms=sc.nextInt();
                  if(Rooms>0)
                  {
                      obj.bill=novtotalAmount(Rooms,Kind,Roomtype);
                      System.out.println(blue+"\t\t\t\t\tYour Total Hotel Bill is "+obj.bill+def);
                      System.out.println(yellow+"Do you want another Room"+def);
                      System.out.println(red+"Enter Yes or No"+def);
                      while(true)
                              {
                                  String choice=sc.next();
                                  if(choice.equalsIgnoreCase("yes"))
                                  {
                                        new Hotel().NOVOTEL();
                                        break;
                                  }
                                  else if(choice.equalsIgnoreCase("no"))
                                       break;
                                     else
                                     {
                                       System.out.println(red+"\t\t\t\t\tInvalid Input"+def);
                                       System.out.println("Enter Yes or No");
                                     }
                                  }
                             break;
                             }
                      
                  else
                  {
                      System.out.print(red+"\t\t\t\t\tEnter Valid no of Rooms"+def);
                  }
                  break;
               }
               }
            
            else
            {
                System.out.println(red+"\t\t\t\t\tInvalid Input"+def+"\n\n");
                novhotel();
            
            }
         }
         static double novtotalAmount(int Rooms,int Kind,int Roomtype)
         {
            if(Kind==1)
            {
               Roomprice=Roomprice+Rooms*novACRoomprice(Roomtype);
            }
            else
            {
               Roomprice=Roomprice+Rooms*novNonACRoomprice(Roomtype);
            } 
             return Roomprice;
         }
         static double novACRoomprice(int Roomtype)
         {
            switch(Roomtype)
            {
               case 1:
                 return 5000.0;    
               case 2:
                 return 10000.0; 
               case 3:
                 return 20000.0;    
               case 4:
                 return 40000.0;
               default:
                 return 0.0;
            }
         }
         static double novNonACRoomprice(int Roomtype)
         {
            switch(Roomtype)
            {
               case 1:
                 return 3000.0;    
               case 2:
                 return 5000.0; 
               case 3:
                 return 15000.0;    
               case 4:
                 return 25000.0;
               default:
                 return 0.0;
            }
         }
         static void novdisplayACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t       S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room  	AC             5000	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	        AC	       10000      "+def);
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	        AC	       20000      "+def);
	     System.out.println(blue+"\t\t\t\t\t	 4         Suite Room	        AC	       40000      "+def);
	     System.out.println(blue+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         static void novdisplayNonACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------");
	     System.out.println(red+"\t\t\t\t\t       S.NO          TYPE           CATEGORY          PRICE      ");
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------");
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room        Non-AC           3000	  ");
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	      Non-AC	       5000       ");
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	      Non-AC	       15000      ");
	     System.out.println(blue+"\t\t\t\t\t	 4         Suite Room	      Non-AC	       25000      ");
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+"\n\n");
         }
         //HOTEL PARADISE
         void PARADISE()
         {
              System.out.println(skblue+"**************WELCOME TO PARADISE**************"+def);
              System.out.println(yellow+"Choose the kind of room you want"+def);
              System.out.println(blue+"\t\t\t\t\t1. AC"+def);
              System.out.println(red+"\t\t\t\t\t2. NON-AC"+def);
              while(true)
              {
                 System.out.print("Choose the option :");
                 int choice =sc.nextInt();
                 System.out.println("\n\n");
                 if (choice == 1) 
	             {
                     Kind = 1;
                     paradisplayACRooms();
                     break;
                 } 
	            else if (choice == 2) 
                {
                    Kind = 2;
                    paradisplayNonACRooms();
                    break;
                } 
	            else 
    	        {
                     System.out.println(red+"\t\t\t\t\tPlease enter a valid category."+def);
                    
                }
            }
            parahotel();
        }
               void parahotel()
               {
                   System.out.println(MAGENTA+"Choose the type of room you want"+def);
            Roomtype=sc.nextInt();
            if(Roomtype<=4)
            {
               while(true)
               {
                  System.out.println(green+"Enter the number of rooms you want to be book"+def);
                  Rooms=sc.nextInt();
                  if(Rooms>0)
                  {
                      obj.bill=novtotalAmount(Rooms,Kind,Roomtype);
                      System.out.println(blue+"\t\t\t\t\tYour Total Hotel Bill is "+obj.bill+def);
                      System.out.println(yellow+"Do you want another Room"+def);
                      System.out.println(red+"Enter Yes or No"+def);
                      while(true)
                              {
                                  String choice=sc.next();
                                  if(choice.equalsIgnoreCase("yes"))
                                  {
                                        new Hotel().PARADISE();
                                        break;
                                  }
                                  else if(choice.equalsIgnoreCase("no"))
                                       break;
                                     else
                                     {
                                       System.out.println(red+"\t\t\t\t\tInvalid Input"+def);
                                       System.out.println("Enter Yes or No");
                                     }
                                  }
                             break;
                             }
                      
                  else
                  {
                      System.out.print(red+"\t\t\t\t\tEnter Valid no of Rooms"+def);
                  }
                  break;
               }
               }
            
            else
            {
                System.out.println(red+"\t\t\t\t\tInvalid Input"+def+"\n\n");
                parahotel();
            
            }
         }
            static double paratotalAmount(int Rooms,int Kind,int Roomtype)
            {
                 if(Kind==1)
                 {
                     Roomprice=Roomprice+Rooms*paraACRoomprice(Roomtype);
                 }
                 else
                 {
                     Roomprice=Roomprice+Rooms*paraNonACRoomprice(Roomtype);
                 } 
                  return Roomprice;
             }
              static double paraACRoomprice(int Roomtype)
              {
                   switch(Roomtype)
                   {
                    case 1:
                       return 4000.0;    
                    case 2:
                       return 8000.0; 
                    case 3:
                       return 10000.0;    
                    case 4:
                       return 20000.0;
                    default:
                      return 0.0;
                   }
              }
              static double paraNonACRoomprice(int Roomtype)
              {
                  switch(Roomtype)
                  {
                     case 1:
                       return 2500.0;    
                     case 2:
                       return 4500.0; 
                     case 3:
                       return 7000.0;    
                     case 4:
                       return 13000.0;
                     default:
                       return 0.0;
                  }
             }
         static void paradisplayACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t         S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room  	AC             4000	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	        AC	       8000       "+def);
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	        AC	       10000      "+def);
	     System.out.println(blue+"\t\t\t\t\t	 4         Suite Room	        AC	       20000      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         static void paradisplayNonACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t         S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room        Non-AC           2500	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	      Non-AC	       4500       "+def);
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	      Non-AC	       7000       "+def);
	     System.out.println(blue+"\t\t\t\t\t	 4         Suite Room	      Non-AC	       13000      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         //HOTEL DOLPHINS
         void DOLPHINS()
         {
              System.out.println(cyan+"*************** WELCOME TO DOLPHINS *******************"+def);
              System.out.println(purple+"Choose the kind of room you want"+def);
              System.out.println(blue+"\t\t\t\t\t1. AC"+def);
              System.out.println(red+"\t\t\t\t\t2. NON-AC"+def);
              while(true)
              {
                 System.out.print("Choose the option :");
                 int choice =sc.nextInt();
                 System.out.println("\n\n");
                 if (choice == 1) 
	             {
                     Kind = 1;
                     DPdisplayACRooms();
                     break;
                 } 
	            else if (choice == 2) 
                {
                    Kind = 2;
                    DPdisplayNonACRooms();
                    break;
                } 
	            else 
    	        {
                     System.out.println(red+"\t\t\t\tPlease enter a valid category."+def);
                }
            }
          
            DPhotel();
         }
               void DPhotel()
               {
                   System.out.println(MAGENTA+"Choose the type of room you want"+def);
            Roomtype=sc.nextInt();
            if(Roomtype<=4)
            {
               while(true)
               {
                  System.out.println(green+"Enter the number of rooms you want to be book"+def);
                  Rooms=sc.nextInt();
                  if(Rooms>0)
                  {
                      obj.bill=novtotalAmount(Rooms,Kind,Roomtype);
                      System.out.println(blue+"\t\t\t\t\tYour Total Hotel Bill is "+obj.bill+def);
                      System.out.println(yellow+"Do you want another Room"+def);
                      System.out.println(red+"Enter Yes or No"+def);
                      while(true)
                              {
                                  String choice=sc.next();
                                  if(choice.equalsIgnoreCase("yes"))
                                  {
                                        new Hotel().DOLPHINS();
                                        break;
                                  }
                                  else if(choice.equalsIgnoreCase("no"))
                                       break;
                                     else
                                     {
                                       System.out.println(red+"\t\t\t\t\tInvalid Input"+def);
                                       System.out.println("Enter Yes or No");
                                     }
                                  }
                             break;
                             }
                      
                  else
                  {
                      System.out.print(red+"\t\t\t\t\tEnter Valid no of Rooms"+def);
                  }
                  break;
               }
               }
            
            else
            {
                System.out.println(red+"\t\t\t\t\tInvalid Input"+def+"\n\n");
                DPhotel();
            
            }
         }
            static double DPtotalAmount(int Rooms,int Kind,int Roomtype)
            {
                 if(Kind==1)
                 {
                     Roomprice=Roomprice+Rooms*DPACRoomprice(Roomtype);
                 }
                 else
                 {
                     Roomprice=Roomprice+Rooms*DPNonACRoomprice(Roomtype);
                 } 
                  return Roomprice;
             }
              static double DPACRoomprice(int Roomtype)
              {
                   switch(Roomtype)
                   {
                    case 1:
                       return 3500.0;    
                    case 2:
                       return 5000.0; 
                    case 3:
                       return 6500.0;   
                    default:
                      return 0.0;
                   }
              }
              static double DPNonACRoomprice(int Roomtype)
              {
                  switch(Roomtype)
                  {
                     case 1:
                       return 2000.0;    
                     case 2:
                       return 3500.0; 
                     case 3:
                       return 5500.0;    
                     default:
                       return 0.0;
                  }
             }
         static void DPdisplayACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t         S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room  	AC             3500	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	        AC	       5000       "+def);
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	        AC	       6500       "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         static void DPdisplayNonACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t        S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room        Non-AC           2000	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	      Non-AC	       3500       "+def);
	     System.out.println(blue+"\t\t\t\t\t	 3         Deluxe Room	      Non-AC	       5500       "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         //HOTEL RADISSON
         void RADISSON()
         {
             System.out.println(cyan+"*************** WELCOME TO RADISSON *******************"+def);
              System.out.println("Choose the kind of room you want");
              System.out.println(blue+"\t\t\t\t\t1. AC"+def);
              System.out.println(red+"\t\t\t\t\t2. NON-AC"+def);
              while(true)
              {
                 System.out.print("Choose the option :");
                 int choice =sc.nextInt();
                 System.out.println("\n\n");
                 if (choice == 1) 
	             {
                     Kind = 1;
                     RaddisplayACRooms();
                     break;
                 } 
	         else if (choice == 2) 
                {
                    Kind = 2;
                    RaddisplayNonACRooms();
                    break;
                } 
	        else 
    	        {
                     System.out.println(red+"\t\t\t\t\tPlease enter a valid category."+def);
                }
            }
            Radhotel();
         }
               void Radhotel()
               {
                   System.out.println("Choose the type of room you want");
                   Roomtype=sc.nextInt();
                   if(Roomtype<=2)
                   {
                       while(true)
                       {
                            System.out.println(yellow+"Enter the number of rooms you want to book"+def);
                            Rooms=sc.nextInt();
                           if(Rooms>0)
                           {
                              obj.bill=RadtotalAmount(Rooms,Kind,Roomtype);
                              System.out.println(blue+"\t\t\t\t\tYour Total Hotel Bill is "+obj.bill+def);
                              System.out.println("Do you want another Room");
                              System.out.println("Enter Yes or No");
                              while(true)
                              {
                                  String choice=sc.next();
                                  if(choice.equalsIgnoreCase("yes"))
                                  {
                                        new Hotel().RADISSON();
                                        break;
                                  }
                                  else if(choice.equalsIgnoreCase("no"))
                                       break;
                                     else
                                     {
                                       System.out.println(red+"\t\t\t\t\tInvalid Input"+def);
                                       System.out.println("Enter Yes or No");
                                     }
                                  }
                             }
                             break;
                      
                        
                       }
                     
                 }
                 else
                 {
                     System.out.println(red+"\t\t\t\t\tInvalid Input"+def+"\n\n");
                     Radhotel();
                 }
            }
            static double RadtotalAmount(int Rooms,int Kind,int Roomtype)
            {
                 if(Kind==1)
                 {
                     Roomprice=Roomprice+Rooms*RadACRoomprice(Roomtype);
                 }
                 else
                 {
                     Roomprice=Roomprice+Rooms*RadNonACRoomprice(Roomtype);
                 } 
                  return Roomprice;
             }
              static double RadACRoomprice(int Roomtype)
              {
                   switch(Roomtype)
                   {
                    case 1:
                       return 1500.0;    
                    case 2:
                       return 2000.0; 
                    default:
                      return 0.0;
                   }
              }
              static double RadNonACRoomprice(int Roomtype)
              {
                  switch(Roomtype)
                  {
                     case 1:
                       return 900.0;    
                     case 2:
                       return 1400.0; 
                     default:
                       return 0.0;
                  }
             }
         static void RaddisplayACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t         S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room  	AC             1500	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	        AC	       2000       "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         static void RaddisplayNonACRooms()
         {
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(red+"\t\t\t\t\t         S.NO          TYPE           CATEGORY          PRICE      "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def);
	     System.out.println(blue+"\t\t\t\t\t	 1         Single Room        Non-AC           900	  "+def);
	     System.out.println(blue+"\t\t\t\t\t	 2         Double Room	      Non-AC	       1400       "+def);
	     System.out.println(yellow+"\t\t\t\t\t-----------------------------------------------------------------"+def+"\n\n");
         }
         //Hotel Bill
         double Hotelbill()
         {
            return obj.bill;
         }
}
//withdraw method in abstraction
abstract class Bank
{
  abstract void withdraw(double amount);
}
//SBI for payment
class SBI extends Bank
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
   static Scanner sc =new Scanner(System.in);
  double balance =450000;
  private int pin =1234;
  void setpin(int pin,double balance)
  {
    this.pin =pin;
    
  }
  int getpin()
  {
    return pin;
  }
  //overrided from abstract class
   void withdraw(double amount)
   {
   if(balance>=amount)
   {
     while(true)//invalid pin for payment
     {
            System.out.println(green+"\t\t\t\t\t\t\t\tEnter your PIN: "+def);
            int n =sc.nextInt();
            if(n==pin)
            {
             System.out.println(yellow+"\t\t\t\t\t\t\t\tPIN is Verified"+def);
             balance =balance-amount;
             System.out.println(blue+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
             System.out.println(green+"\t\t\t\t\t\t\t\tYour Booking is Successful."+def);
             System.out.println(yellow+"\t\t\t\t\t\t\t\tPlease Visit Again"+def);
             break;
            }
           else if(n!=pin)
           {
             System.out.println(blink+red+"\t\t\t\t\t\t\t\tIncorrect pin"+def);
             System.out.println(purple+"\t\t\t\t\t\t\t\tRe Enter the correct pin"+def);
           }
        }
    }
     else
     {
       System.out.println("Insufficent funds");
     }
 }

}
//ICIC for payment
class ICIC extends Bank
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static Scanner sc =new Scanner(System.in);
  double balance =500000;
  private int pin =1456;
  void setpin(int pin,double balance)
  {
    this.pin =pin;
    
  }
  int getpin()
  {
    return pin;
  }
  //overrided from abstract class
   void withdraw(double amount)
   {
   if(balance>=amount)
   {
     while(true) //for incorrect pin for ICIC
     {
             System.out.println(green+"\t\t\t\t\t\t\t\tEnter your PIN: "+def);
            int n =sc.nextInt();
            if(n==pin)
             {
             System.out.println(yellow+"\t\t\t\t\t\t\t\tPIN is Verified"+def);
             balance =balance-amount;
             System.out.println(blue+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
             System.out.println(green+"\t\t\t\t\t\t\t\tYour Booking is Successful."+def);
             System.out.println(yellow+"\t\t\t\t\t\t\t\tPlease Visit Again"+def);
             break;
            }
           else if(n!=pin)
           {
             System.out.println(blink+red+"\t\t\t\t\t\t\t\tIncorrect pin"+def);
             System.out.println(purple+"\t\t\t\t\t\t\t\tRe Enter the correct pin"+def);
           }
        }
    }
     else
     {
       System.out.println("Insufficent funds");
     }
 }

}
//PHONEPE
class phonepay
{
  void pay(double amount)
  {
     
     SBI s = new SBI();
         s.withdraw(amount);
  }
  void pay1(double amount)
  {
    ICIC s =new ICIC();
    s.withdraw(amount);
  }
}
//PAYTM
class paytm
{
 void pay(double amount)
 {
   SBI s =new SBI();
   s.withdraw(amount);
  }
 void pay1(double amount)
  {
    ICIC s =new ICIC();
    s.withdraw(amount);
  }
}
//GPAY
class Gpay
{
  void pay(double amount)
  {
    SBI s =new SBI();
     s.withdraw(amount);
  }
 void pay1(double amount)
  {
    ICIC s =new ICIC();
    s.withdraw(amount);
  }
}
//for payment
class Payment extends Hotel
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    
 
    static Scanner sc =new Scanner(System.in);
    static void paymentmethod(double amount)
    {
      System.out.println(blue+"\t\t\t\t\t\tSelect the your Bank"+def);
      System.out.println(green+"\t\t\t\t\t 1.SBI Bank "+def);
      System.out.println(purple+"\t\t\t\t\t 2.ICIC Bank"+def);
      System.out.println("Please select the option");
     
      while(true) //Invalid selection for payment option
      {
      int a =sc.nextInt();
      if(a==1)
      {
         System.out.println(yellow+"\t\t\t\t\tYou have selected SBI Bank option"+def);
         System.out.println(blue+"\t\t\t\t\tSelect the Paymentmethods"+def);
         System.out.println(skblue+"\t\t\t\t\t 1.Phonepay "+def);
         System.out.println(skblue+"\t\t\t\t\t 2.Paytm "+def);
         System.out.println(skblue+"\t\t\t\t\t 3.Gpay"+def);
         System.out.println("Please select the option");
         int n =sc.nextInt(); //payment option Selection
         if(n==1)
         {
           System.out.println(purple+"\t\t\t\t\t\t\t\tYou have selected Phonepay Option"+def);
           phonepay obj =new phonepay();
           obj.pay(amount);
           break;
         }
         else if(n==2)
         {
                System.out.println(yellow+"\t\t\t\t\t\t\t\tYou have selected Paytm Option"+def);
                paytm obj =new paytm();
                obj.pay(amount);
                break;
         }
         else if(n==3)
         {
                System.out.println(skblue+"\t\t\t\t\t\t\t\tYou have selected Gpay Option"+def);
                Gpay obj =new Gpay();
                obj.pay(amount);
		        break;
         }
         else
         {
                System.out.println(red+"\t\t\t\t\t\t\t\tYou selected Invalid Option"+def);
         }
       }
      else if(a==2)
      {
         System.out.println(yellow+"\t\t\t\t\t\t\t\tYou have selected ICIC Bank option"+def);
         System.out.println(blue+"\t\t\t\t\tSelect the Paymentmethods"+def);
         System.out.println(skblue+"\t\t\t\t\t 1.Phonepay "+def);
         System.out.println(skblue+"\t\t\t\t\t 2.Paytm "+def);
         System.out.println(skblue+"\t\t\t\t\t 3.Gpay"+def);
         System.out.println("Please select the option");
         int n =sc.nextInt();
         if(n==1)
         {
                System.out.println(purple+"\t\t\t\t\t\t\t\tYou have selected Phonepay Option"+def);
                phonepay obj =new phonepay();
                obj.pay1(amount);
		        break;
         }
         else if(n==2)
         {
                System.out.println(skblue+"\t\t\t\t\t\t\t\tYou have selected paytm Option"+def);
                paytm obj =new paytm();
                obj.pay1(amount);
		        break;
         }
         else if(n==3)
         {
                 System.out.println(skblue+"\t\t\t\t\t\t\t\tYou have selected Gpay Option"+def);
                 Gpay obj =new Gpay();
                 obj.pay1(amount);
		         break;
         }
          else
         {
          System.out.println(red+"\t\t\t\t\t\t\t\tYou selected Invalid Option"+def);
         }
       }
       
      else
      {
         System.out.println(red+"\t\t\t\t\t\t\t\tYou have selected Invalid Input"+def);
      }
    }
  }
}
//Restuarant for food
class Restaurant extends Payment
{
	static Scanner s=new Scanner(System.in);
	double muttonbiryani(int a)
	{
		return a*450;	
	}
	double chickenbiryani(int a)
	{
		return a*350;
	}
	double prawnbiryani(int a)
	{
		return a*600;	
	}
	double eggbiryani(int a)
	{
		return a*250;	
	}
	double dumbiryani(int a)
	{
		return a*250;	
	}
	double frypiecebiryani(int a)
	{
		return a*290;	
	}
	double chickenfriedrice(int quantity)
	{
		return quantity*200;
	}
	double eggfriedrice(int a)
	{
	    return a*200;
	}
	double chickennoodles(int a)
	{
	    return a*100;
	}
	double eggnoodles(int a)
	{
	    return a*120;
	}
	double paneerbiryani(int a)
	{
		return a*250;
	}
	double mushroombiryani(int a)
	{
		return a*230;
	}
	double vegbiryani(int a)
	{
		return a*200;
	}
	double kajubiryani(int a)
	{
		return a*250;
	}
	double babycornbiryani(int a)
	{
		return a*180;
	}
	double kajufriedrice(int a)
	{
		return a*200;
	}
	double gobimanchurian(int a)
	{
		return a*190;
	}
	double vegnoodles(int a)
	{
		return a*110;
	}
	double mushroomnoodles(int a)
	{
		return a*180;
	}
	double paneerriedrice(int a)
	{
		return a*190;
	}
}
//MENU
class Canteen extends Restaurant
{
	static double bill=0;
	static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
    static String MAGENTA= "\u001B[35m";
    static String under ="\u001B[21m";
    static String backyellow="\u001B[104m";
    static String black="\u001B[40m";
    static String cyan="\u001B[96m";
	double amount=0;

	double NONVEG() //MENU
	{
	    System.out.println("\t\t\t------------------------------------------------------");
	    System.out.println(red+"\t\t\tS.No            ITEMS                  PRICE     " +def );
	    System.out.println("\t\t\t------------------------------------------------------");
		System.out.println(skblue+"\t\t\t1         CHICKEN BIRYANI              350      "+def);
		System.out.println(skblue+"\t\t\t2         MUTTON BIRYANI               450      "+def);
		System.out.println(skblue+"\t\t\t3         PRAWN BIRYANI                600      "+def);
		System.out.println(skblue+"\t\t\t4         EGG BIRYANI                  250      "+def);
		System.out.println(skblue+"\t\t\t5         DUM BIRYANI                  200      "+def);
		System.out.println(skblue+"\t\t\t6         FRYPIECE BIRYANI             250      "+def);
		System.out.println(skblue+"\t\t\t7         CHICKEN FRIEDRICE            290      "+def);
		System.out.println(skblue+"\t\t\t8         EGG FRIEDRICE                200      "+def);
		System.out.println(skblue+"\t\t\t9         CHICKEN NOODLES              100      "+def);
		System.out.println(skblue+"\t\t\t10        EGG NOODLES                  120      "+def);
		System.out.println("\t\t\t------------------------------------------------------");
		int a=s.nextInt(); //Selection of Items
		if(a==1)
		{	
			System.out.println(green+"\t\tenter quantity"+def);
			bill=bill+chickenbiryani(s.nextInt());
		}
		else if(a==2)
		{
			System.out.println(green+"\t\tenter quantity"+def);
			bill=bill+muttonbiryani(s.nextInt());
		}
		else if(a==3)
		{
			System.out.println(purple+"\t\tenter quantity"+def);
			bill=bill+prawnbiryani(s.nextInt());
		}
		else if(a==4)
		{
			System.out.println(purple+"\t\tenter quantity"+def);
			bill=bill+eggbiryani(s.nextInt());
		}
		else if(a==5)
		{
			System.out.println(purple+"\t\tenter quantity"+def);
			bill=bill+dumbiryani(s.nextInt());
		}
		else if(a==6)
		{
			System.out.println(purple+"\t\tenter quantity"+def);
			bill=bill+frypiecebiryani(s.nextInt());
		}
		else if(a==7)
		{
			System.out.println(purple+"\t\tenter quantity"+def);	
			bill=bill+chickenfriedrice(s.nextInt());
		}
		else if(a==8)
		{
		     	System.out.println(purple+"\t\tenter quantity"+def);	
	       	 	bill=bill+eggfriedrice(s.nextInt());
		}
		else if(a==9)
		{
		 	System.out.println(blue+"\t\tenter quantity"+def);	
			bill=bill+chickennoodles(s.nextInt());
		}
		else if(a==10)
		{
		 	System.out.println(blue+"\t\tenter quantity"+def);	
			bill=bill+eggnoodles(s.nextInt());
		}
		else
		{
		   	System.out.println(red+"\t\tInvalid selection"+def);
		   	selection();
		}
		System.out.println(blue+"\t\t\t\t\tYour Total Food Bill is "+bill+def);
		System.out.println(cyan+"press 1 to order more \n Any Key for billing"+def);
		char n=s.next().charAt(0);
		if(n=='1')
		{
			NONVEG();
		}
		else 
		{
		    Resbilling();	
		}
		return bill;
	} 
	double selection()
	{
	                                                                                              
System.out.println(blink+cyan+          "                                            .::::.                      ");                    
System.out.println(                       "                                     .=*%%#****#%%#+-                  ");                   
System.out.println(                       "                                   =%%+:    :+#%= .-*@*.                  ");                
System.out.println(                       "                                 -@#:     +@#=:@+     +%*                  ");               
System.out.println(                       "                       :=+*%%%%%%@=      %%.   @+      .%@%%%%%#*=-        ");                
System.out.println(                       "                    :*@#=-.             :@+    @+        .     .:=*@#=.   ");                 
System.out.println(                       "                  :%@+                  :@=    @+                   -%@+  ");                 
System.out.println(                       "                 +@+.      .:           :@=    @+                     -%#.    ");             
System.out.println(                       "                +@-      :#@#@*.        :@=    @+           .-=++=-    .%%        ");         
System.out.println(                       "               -@=     -%@*@#-*@#:      :@=    @+        :+%%+=---*@+    @#   ");             
System.out.println(                       "               %%    -%@+#%=+@#-+@#:    :@=    @+      -%%+.       -@-   +@:      ");         
System.out.println(                       "               @#   +@+*@*=#%=+@%-+@#.  :@=    @+     #@-          :@=   =@-          ");     
System.out.println(                       "               #@    +@*-+@*=#%==+  +%* :@=    @+    #*.           %%    +@.   ");            
System.out.println(                       "               :@=     *@*:*@+-+     -@#:@=    @+   =%:           #@:    @#        ");        
System.out.println(                       "                *@:     :*@+-+.       @@:@=    @+   *@          =@#.    #%.            ");    
System.out.println(                       "                 +@=      .*@+       -@%-@=    @*  :%@.      -*@*-    :%%.                "); 
System.out.println(                       "                  :#@+.     .*@#+==**::*@@+    @#=%@= =%###%%*-     -#@=                  "); 
System.out.println(                       "                    .+%%*=:..  :-=-:+@*:.+@*:  @@#: =@#: .    .:-+#@*-                    "); 
System.out.println(                       "                       .-=+*#@+      .+@*. +@%@*: =%%-     .@%#*+-.                       "); 
System.out.println(                       "                            .@+         #@+*@#. .%@=       :@+                            "); 
System.out.println(                       "                            .@+         .%@*:  *@@-        :@+                            "); 
System.out.println(                       "                            .@+       :*@+.  +@*.=%@=      :@+                            "); 
System.out.println(                       "                            .@+     -%%+   +@#@%:  :*@+    :@+                            "); 
System.out.println(                       "                            .@+   :%%-   =@%:  *@#.  .*@+  :@+                            "); 
System.out.println(                       "                            .@+   @%   -%#@*   =@#@#:  .%% :@+                            "); 
System.out.println(                       "                            .@+   :%%#@%- @+   -@-.+@*=+@+ :@+                            "); 
System.out.println(                       "                            .@+      .   .@=   -@-   -+=.  :@+                            "); 
System.out.println(                       "                            .@+          :@-   -@=         :@+                            "); 
System.out.println(                       "                            .@+          -@:   :@+         :@+                           "); 
System.out.println(                       "                            .@+          -@-   :@+         :@+                            "); 
System.out.println(                       "                            .@+           +@#**@*          :@+                            "); 
System.out.println(                       "                            .@*:::::::::::::=+=-:::::::::::=@+                          "); 
System.out.println(                       "                             *###############################:                            "+def); 
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                                                                          
                                                                                          

		System.out.println(green+"which category of food you need"+def);
		System.out.println(BLACK_BOLD+ANSI_YELLOW_BACKGROUND+"\t\t\t\t\t1.VEG\t\t\t\t\t2.NONVEG"+def);
		while(true)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				amount=VEG();
				break;
			}
			else if(n==2)
			{
				amount=NONVEG();
				break;
			}
			else
			{
				System.out.println(red+"Invalid Selection\nSelect valid option"+def);
			}
		}
		return amount;
	}
		

	double VEG() //MENU
	{
	    	System.out.println("\t\t\t------------------------------------------------------");
	    	System.out.println(red+"\t\t\tS.No            ITEMS                  PRICE     " +def );
	   	 System.out.println("\t\t\t------------------------------------------------------");
		System.out.println(skblue+"\t\t\t1         PANEER BIRYANI         250      "+def);
		System.out.println(skblue+"\t\t\t2         MUSHROOM BIRYANI       230      "+def);
		System.out.println(skblue+"\t\t\t3         VEG BIRYANI            200      "+def);
		System.out.println(skblue+"\t\t\t4         KAJU BIRYANI           250      "+def);
		System.out.println(skblue+"\t\t\t5         BABYCORN BIRYANI       180      "+def);
		System.out.println(skblue+"\t\t\t6         KAJU FRIEDRICE         200      "+def);
		System.out.println(skblue+"\t\t\t7         GOBI MANCHURIAN        190      "+def);
		System.out.println(skblue+"\t\t\t8         VEG NOODLES            110      "+def);
		System.out.println(skblue+"\t\t\t9         MUSHROOM NOODLES       180      "+def);
		System.out.println(skblue+"\t\t\t10        PANEER FRIEDRICE       190      "+def);
		System.out.println("\t\t\t------------------------------------------------------");
		int a=s.nextInt(); //Selection of Items
		if(a==1)
		{	
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+paneerbiryani(s.nextInt());
		}
		else if(a==2)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+mushroombiryani(s.nextInt());
		}
		else if(a==3)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+vegbiryani(s.nextInt());
		}
		else if(a==4)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+kajubiryani(s.nextInt());
		}
		else if(a==5)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+babycornbiryani(s.nextInt());
		}
		else if(a==6)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);
			bill=bill+kajufriedrice(s.nextInt());
		}
		else if(a==7)
		{
			System.out.println(yellow+"\t\t\tenter quantity"+def);	
			bill=bill+gobimanchurian(s.nextInt());
		}
		else if(a==8)
		{
		 	System.out.println(green+"\t\t\tenter quantity"+def);	
	       	 	bill=bill+vegnoodles(s.nextInt());
		}
		else if(a==9)
		{
		 	System.out.println(green+"\t\t\tenter quantity"+def);	
			bill=bill+mushroomnoodles(s.nextInt());
		}
		else if(a==10)
		{
		 	System.out.println(green+"\t\t\tenter quantity"+def);	
			bill=bill+paneerriedrice(s.nextInt());
		}
		else
		{
		   	System.out.println(red+"\t\t\t\tInvalid selection"+def);
		   	selection();
		}
		System.out.println(blue+"\t\t\t\t\tYour Total Food Bill is "+bill+def);
		System.out.println(cyan+"press 1 to order more \n Any Key for billing"+def);
		char n=s.next().charAt(0);
		if(n=='1')
		{
			VEG();
		}
		else 
		{
		    Resbilling();	
		}
		return bill;
	}

	//Food Bill
	static double Resbilling()
	{
	    return bill;
	}
	}
class Passenger 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static  String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static  String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static  String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static  String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    static  String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static  String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    static  String WHITE= "\u001B[47m";
    static String BLACK_BOLD = "\033[1;30m";  // BLACK
    static  String RED_BOLD = "\033[1;31m";    // RED
    static  String GREEN_BOLD = "\033[1;32m";  // GREEN
    static  String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    static  String BLUE_BOLD = "\033[1;34m";   // BLUE
    static  String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    static final String WHITE_BOLD = "\033[1;37m";  
    private String name;
    private int age;
    private String gender;

    Passenger(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName() 
    {
        return name;
    }

    int getAge() 
    {
        return age;
    }

    String getGender() 
    {
        return gender;
    }
    Passenger()
    {
        
    }
}

class Bus extends Passenger 
{
    private String source;
    private String destination;
    private String busName;
    private double ticketCost;
    private int availableSeats;
    private double platformFee; // Platform fee per ticket
    private List<Passenger> passengers;

    Bus(String source, String destination, String busName, double ticketCost, int availableSeats, double platformFee) 
    {
        this.source = source;
        this.destination = destination;
        this.busName = busName;
        this.ticketCost = ticketCost;
        this.availableSeats = availableSeats;
        this.platformFee = platformFee;
        this.passengers = new ArrayList<>();
    }

    String getSource() 
    {
        return source;
    }

    String getDestination() 
    {
        return destination;
    }

    String getBusName() 
    {
        return busName;
    }

    double getTicketCost() 
    {
        return ticketCost;
    }

    int getAvailableSeats() 
    {
        return availableSeats;
    }

    double getPlatformFee() 
    {
        return platformFee;
    }

    List<Passenger> getPassengers() 
    {
        return passengers;
    }
    void bookTicket(List<Passenger> newPassengers) 
    {
        if (availableSeats >= newPassengers.size()) 
        {
            passengers.addAll(newPassengers);
            availableSeats -= newPassengers.size();
            System.out.println(newPassengers.size() + " ticket(s) booked successfully!");
        } 
        else 
        {
            System.out.println("Sorry, only " + availableSeats + " seat(s) available.");
        }
    }

    double calculateTotalCost(List<Passenger> passengers) 
    {
        return passengers.size() * (ticketCost + platformFee);
    }

    void cancelTicket(List<Passenger> cancelPassengers) 
    {
        for (Passenger passenger : cancelPassengers) 
        {
            if (passengers.contains(passenger)) 
            {
                passengers.remove(passenger);
                availableSeats++;
                System.out.println(GREEN_BOLD+"\t\t\tTicket canceled successfully for passenger: " + passenger.getName()+def);
            } 
            else 
            {
                System.out.println(RED_BOLD+"\t\t\tTicket not found for passenger: " + passenger.getName()+def);
            }
        }
    }
}

class BusTicketBooking extends Passenger 
{
    private static Map<String, List<Bus>> buses = new HashMap<>();
    private static Map<String, String> busNames = new HashMap<>();
    static double totalCost=0;
    double busses()
    {
        initializeBuses();
        Scanner scanner = new Scanner(System.in);
        System.out.println(blink+CYAN_BOLD+"\t\t\t W E L COME TO B U S TICKET B O O K I N G"+def);
        System.out.println();
System.out.println(blink+"######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("##################################################################*++===========++*###################################################################");
System.out.println("#############################################################*++=====================++*##############################################################");
System.out.println("##########################################################*+=============================+*###########################################################");
System.out.println("########################################################+===================================+#########################################################");
System.out.println("######################################################+=======================================+*######################################################");
System.out.println("###################################################*+===========================================+*####################################################");
System.out.println("##################################################+===============================================+###################################################");
System.out.println("################################################*===================-:..      .:-===================*#################################################");
System.out.println("###############################################+===============-.                   .:===============+*###############################################");
System.out.println("#############################################*==============-.                         .-==============*##############################################");
System.out.println("############################################*=============:                               :=============+#############################################");
System.out.println("###########################################+============.                                   .============+############################################");
System.out.println("##########################################+===========:                                       :===========+###########################################");
System.out.println("#########################################+==========-                                           -===========##########################################");
System.out.println("########################################+==========.                                              ===========#########################################");
System.out.println("#######################################+=========-                                                 -=========+########################################");
System.out.println("######################################+=========-                                                   :=========+#######################################");
System.out.println("#####################################+=========:                                                     .=========+######################################");
System.out.println("####################################*=========.                                                       .=========+#####################################");
System.out.println("###################################*=========.               ...::----=========----:::..               .=========*####################################");
System.out.println("###################################=========:         .:=+*################################*+=:.        .=========####################################");
System.out.println("##################################+========:         +##########################################=        :========+###################################");
System.out.println("#################################*========-         +########*++++++++++++++++++++++++++*########=        :========*##################################");
System.out.println("#################################+=======-         .#########.                          .#########.        -=======+##################################");
System.out.println("################################*========.         :########*                            #########:         ========+#################################");
System.out.println("################################========:          :########*                            #########:         :========#################################");
System.out.println("###############################*========           :#########                            #########:          -=======+################################");
System.out.println("###############################========.           :#########=::::::::::::::::::::::::::+#########:          .========################################");
System.out.println("##############################*=======-            :##############################################:           :=======*###############################");
System.out.println("##############################+=======.            :##############################################:            ========###############################");
System.out.println("#############################*=======-             :#######*******************************########:            -=======*##############################");
System.out.println("#############################+=======.             :##+........................................*##:             =======+##############################");
System.out.println("#############################=======-              :##-                                        -##:             -=======##############################");
System.out.println("############################*=======.              :##:                                        -##:             .=======*#############################");
System.out.println("############################+=======            =++*##:                                        -##*++-           =======+#############################");
System.out.println("############################=======-           .#--+##:                                        -##=--#           :=======#############################");
System.out.println("###########################*=======.           :#. -##:                                        -##: .#.           =======*############################");
System.out.println("###########################*=======           *###-:##:                                        -##:=###+          =======*############################");
System.out.println("###########################+======-           *###-:##:                                        -##:+###*          -======+############################");
System.out.println("###########################+======:           *###-:##:                                        -##:+###*          :=======############################");
System.out.println("###########################=======.           *###=:##:                                        -##:+###*           =======############################");
System.out.println("###########################=======.           ####=:##:                                        -##:+###*           =======*###########################");
System.out.println("##########################*=======            ####-:##:                                        -##:+###*           =======*###########################");
System.out.println("##########################*=======            *###-:##:                                        -##:+###*           -======*###########################");
System.out.println("##########################*======-            *###-:##:                                        -##:+###*           -======*###########################");
System.out.println("##########################+======-            *###-:##:                                        -##:=###+           -======+###########################");
System.out.println("##########################+======-            .::: :##:                                        -##: :::            -======+###########################");
System.out.println("##########################+======-                 :##:                                        -##:                -======+###########################");
System.out.println("##########################+======-                 :##:                                        -##:                -======+###########################");
System.out.println("##########################+======-                 :##:                                        -##.                -======+###########################");
System.out.println("##########################+======-                 :##:                                        -##.                -======+###########################");
System.out.println("##########################*======-                 :##:                                        -##.                -======+###########################");
System.out.println("##########################*=======                 :##:                                        -##.                -======*###########################");
System.out.println("##########################*=======                 :##-                                        =##.                =======*###########################");
System.out.println("###########################=======.                :##*.                                      .###.                =======*###########################");
System.out.println("###########################=======.                :####.                                    .####.                =======############################");
System.out.println("###########################+======:                :#####+.                                :+#####.               .=======############################");
System.out.println("###########################+======-                :#######+-.                          .-*#######.               -======+############################");
System.out.println("###########################*=======                :###########*=:                  :=*###########.               =======+############################");
System.out.println("###########################*=======.               :################******++******################.               =======*############################");
System.out.println("############################=======-               :##############################################.              :=======#############################");
System.out.println("############################+=======               :##############################################.              =======+#############################");
System.out.println("############################*=======.              :####+========+##################+========+####.             .=======+#############################");
System.out.println("#############################=======-              :###.          :################.          :###.             :=======##############################");
System.out.println("#############################+=======.             :##+            *##############+            *##.             =======+##############################");
System.out.println("#############################*=======-             :##+            *##############*            *##.            -=======*##############################");
System.out.println("##############################+=======             :###=         .+################=.        .+###.            ========###############################");
System.out.println("##############################*=======-            :##############################################.           :=======+###############################");
System.out.println("###############################========            :##############################################.           ========################################");
System.out.println("###############################*========           :###############*..............################.          -=======+################################");
System.out.println("################################========:          :###############*              ################.         .========#################################");
System.out.println("################################+========          :################+============+################.         ========+#################################");
System.out.println("#################################+=======-          #############################################*         -========##################################");
System.out.println("#################################*========:         .-#######----------------------------#######:         :========*##################################");
System.out.println("##################################+========:         .#######                            #######         .========+###################################");
System.out.println("###################################=========.        .#######                            #######         =========####################################");
System.out.println("###################################*=========.        +#####+                            *#####+        =========*####################################");
System.out.println("####################################+=========.        .....                              .....       .=========+#####################################");
System.out.println("#####################################+=========.                                                     .=========+######################################");
System.out.println("######################################+=========:                                                   .==========#######################################");
System.out.println("#######################################==========-                                                 :==========*#######################################");
System.out.println("########################################+==========.                                              -==========*########################################");
System.out.println("#########################################===========:                                           :===========*#########################################");
System.out.println("##########################################============.                                       .-===========*##########################################");
System.out.println("###########################################+===========-.                                   .-===========+############################################");
System.out.println("############################################+=============.                               .-============+#############################################");
System.out.println("#############################################*==============:                           :==============+##############################################");
System.out.println("##############################################*+==============-:.                   .:-==============+*###############################################");
System.out.println("################################################+=================-::...      ...:-=================+#################################################");
System.out.println("##################################################+===============================================+*##################################################");
System.out.println("###################################################*+===========================================+*####################################################");
System.out.println("#####################################################*+=======================================+*######################################################");
System.out.println("#######################################################*+===================================+*########################################################");
System.out.println("##########################################################*+=============================+*###########################################################");
System.out.println("#############################################################*++=====================++*##############################################################");
System.out.println("#################################################################*++++=========++++*##################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("###########################*++++###################= *#####++++*###############*++++++#*+#########- ##################################################");
System.out.println("###########################:     *#################= *####*     -##############-      *. +########- ############* -###################################");
System.out.println("###########################: ++: +#################= *####* :*+  ##############**+  **#+-#########- ############* -###################################");
System.out.println("###########################: ##= +##*-:-*###+-:-*##= *#::#* -## .##--##--##=::+##*  ###+:*##+::=##- #*:-##+-:=##: .:*#+::=############################");
System.out.println("###########################:    :##*     +#+     ##= *: *#*     +##::##..#+ ..:##*  ###= *#-    -#- #. *#+  . -#:  .** ...############################");
System.out.println("###########################: :-. =#: +#* :#. *#+ :#= : =##* .-:  *#::##..#= .+###*  ###= *#..##*##- : +##: =+. #* -##* .+#############################");
System.out.println("###########################: ###  #. ###..#..### .#=   :##* -##+ :#::##..##-  :##*  ###= *# :#####-   -##. ....#* -###-. .*###########################");
System.out.println("###########################: **+  #- =*+ :#: +*= -#= =- *#* :**- :#:.** .##+#: *#*  ###= *#..**=##- +. ##- +*+*#* -*##+*- +###########################");
System.out.println("###########################:     =##.   .###.   .##= **  #*      *#=    .#-    ##*  ###= *#+    -#- #* .#*    :##   *=    *###########################");
System.out.println("###########################+===+*####+=+#####+=+###*=##+=##====+*###+=*++##*++*###=+###*=###*++*##*+##++###+=+###*=+##*++*############################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################");
System.out.println("######################################################################################################################################################"+def);
System.out.println(); 
System.out.println(); 
System.out.println();  
System.out.println("$---------------------------------------------------$");
System.out.println(" |Source                   |         Destination   |");
System.out.println("----------------------------------------------------");   
System.out.println(" |  Vishakhapatnam         |         Nellore       |");
System.out.println(" |  Tuni                   |         Hyderabad     |");
System.out.println(" |  vishakhapatnam         |         bangalore     |");
System.out.println(" |  hyderabad              |         chennai       |");
System.out.println(" |  Vishakhapatnam         |         Chennai       |");
System.out.println(" |  Hyderabad              |         Bangalore     |");
System.out.println(" |  Srikakulam             |         Ongole        |");
System.out.println(" |  Vijayawada             |         Bangalore     |");
System.out.println(" |  Vijayanagaram          |         Rajahmundry   |");
System.out.println(" |  Vijayawada             |         Vishakhapatnam|");
System.out.println(" |  Vijayanagaram          |         Chennai       |");
System.out.println(" |	Bangalore              |         Kurnool       |");
System.out.println(" |	Bangalore              |         Guntur        |");
System.out.println(" | 	Bangalore              |         Nellore       |");
System.out.println(" | 	Chapta                 |         Hyderabad     |");
System.out.println("$--------------------------------------------------$");
System.out.println(ANSI_RED_BACKGROUND+YELLOW_BOLD+"\t\t\t\tEnter source: "+def);
        String source = scanner.nextLine().trim().toLowerCase(); // Convert to lowercase

        System.out.println(ANSI_CYAN_BACKGROUND+WHITE_BOLD+"\t\t\t\tEnter destination: "+def);
        String destination = scanner.nextLine().trim().toLowerCase(); // Convert to lowercase

        List<Bus> availableBuses = buses.get(source + "-" + destination);
	while(true)
	{
        if (availableBuses == null || availableBuses.isEmpty()) 
        {
            System.out.println(RED_BOLD+"\t\t\t\tNo buses available for the given source and destination."+def);
		busses();
        } 
        else
        {
            // Display available buses in table format
            System.out.println(PURPLE_BOLD+"\t\t\tAvailable Buses:"+def);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.printf(RED_BOLD+"%-5s%-20s%-20s%-20s%-20s%-20s\n", "Index  ",  "Bus Name", "Source", "Destination", "Available Seats", "Ticket Cost"+def);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            int index = 1; // Initialize index for displaying available buses
            for (Bus bus : availableBuses) {
            System.out.printf("%-5d%-20s%-20s%-20s%-20d%-20.2f\n", index, bus.getBusName(), bus.getSource(), bus.getDestination(), bus.getAvailableSeats(), bus.getTicketCost());
            index++; // Increment index for the next bus
        }
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println(BLUE_BOLD+"\t\t\tEnter the index of the bus you want to book tickets for:"+def);
            int busIndex = scanner.nextInt();
            scanner.nextLine();
            if (busIndex >= 1 && busIndex <= availableBuses.size()) 
            {
                Bus selectedBus = availableBuses.get(busIndex - 1);

                // Enter number of tickets
                System.out.println(YELLOW_BOLD+"\t\t\tEnter number of tickets: "+def);
                int numOfTickets = scanner.nextInt();
                scanner.nextLine(); 
                if (numOfTickets <= selectedBus.getAvailableSeats())
                {
                List<Passenger> passengers = new ArrayList<>();
                for (int i = 0; i < numOfTickets; i++) {
                    System.out.println(CYAN_BOLD+"\t\t\tEnter details for passenger " + (i + 1) + ":"+def);
                    System.out.print(PURPLE_BOLD+"\t\t\tName: "+def);
                    String name = scanner.nextLine().trim();
                    System.out.print(YELLOW_BOLD+"\t\t\tAge: "+def);
                    int age = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print(BLUE_BOLD+"\t\t\tGender: "+def);
                    String gender = scanner.nextLine().trim();
                    passengers.add(new Passenger(name, age, gender));
                }

                // Book tickets
                selectedBus.bookTicket(passengers); // Booking tickets for the selected bus

                // Calculate total cost
                 totalCost = selectedBus.calculateTotalCost(passengers);
                System.out.println("Total Cost: " + totalCost);

                // to cancel ticket(s)
                System.out.println("Do you want to cancel any ticket? (yes/no)");
                String cancelChoice = scanner.nextLine().trim().toLowerCase();
                if (cancelChoice.equals("yes")) 
                {
                    System.out.println("Enter passenger name(s) to cancel ticket(s), separated by commas: ");
                    String[] cancelNames = scanner.nextLine().trim().split(",");
                    List<Passenger> cancelPassengers = new ArrayList<>();
                    for (String name : cancelNames) 
                    {
                        for (Passenger passenger : passengers) 
                        {
                            if (passenger.getName().equalsIgnoreCase(name.trim())) 
                            {
                                cancelPassengers.add(passenger);
                            }
                        }
                    }
                    selectedBus.cancelTicket(cancelPassengers); // Cancelling tickets for the selected bus
                }
            } 
            else 
            {
                    System.out.println("No Avaialble seats please select valid number of seats");
            }
            }
            else
                    System.out.println("Invalid bus index.Select Valid Index");
		break;
		}
        }
		return totalCost;
    }
    private static void initializeBuses() 
    {
        List<Bus> busListTH = Arrays.asList(
            new Bus("Tuni", "Hyderabad", "Orange Travels", 1500.0, 10, 59.0),
            new Bus("Tuni", "Hyderabad", "Kaveri Travels", 1060.0, 15, 68.0),
            new Bus("Tuni", "Hyderabad", "KKaveri Travels", 1800.0, 30, 89.0),
            new Bus("Tuni", "Hyderabad", "Morningstar", 2000.0, 22, 89.0),
            new Bus("Tuni", "Hyderabad", "INDRA Travels", 1600.0, 10, 89.0),
            new Bus("Tuni", "Hyderabad", "RajaDhani", 1700.0, 11, 89.0),
            new Bus("Tuni", "Hyderabad", "Vkaveri Travels", 1200.0, 10, 89.0),
            new Bus("Tuni", "Hyderabad", "TSRTC", 1000.0, 11, 89.0),
            new Bus("Tuni", "Hyderabad", "APSRTC", 1200.0, 3, 89.0),
            new Bus("Tuni", "Hyderabad", "Deluxe", 1200.0, 9, 89.0),
            new Bus("Tuni", "Hyderabad", "Super Luxury", 950.0, 9, 89.0));
    
        buses.put("tuni-hyderabad", busListTH);
        busNames.put("tuni-hyderabad", "Orange Travels, Kaveri Travels,KKaveri Travels,Morningstar,INDRA Travels,RajaDhani,Vkaveri Travels,TSRTC,APSRTC,Super Luxury,Deluxe");
        // Buses from Vishakhapatnam to Bangalore
        List<Bus> busListVB = Arrays.asList(
        new Bus("vishakhapatnam", "bangalore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("vishakhapatnam", "bangalore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("vishakhapatnam", "bangalore", "INDRA Travels", 1600.0, 10, 89.0));
        buses.put("vishakhapatnam-bangalore", busListVB);
        busNames.put("vishakhapatnam-bangalore", "KKaveri Travels, Morningstar, INDRA Travels");
        // Buses from Hyderabad to Chennai
        List<Bus> busListHC = Arrays.asList(
        new Bus("hyderabad", "chennai", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("hyderabad", "chennai", "Morningstar", 2000.0, 22, 89.0),
        new Bus("hyderabad", "chennai", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("hyderabad", "chennai", "RajaDhani", 1700.0, 11, 89.0));
        buses.put("hyderabad-chennai", busListHC);
        busNames.put("hyderabad-chennai", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani");
        
        // Buses from Vishakhapatnam to Chennai
        List<Bus> busListVC = Arrays.asList(
        new Bus("Vishakhapatnam", "Chennai", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vishakhapatnam", "Chennai", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vishakhapatnam", "Chennai", "INDRA Travels APSRTC", 1600.0, 10, 89.0),
        new Bus("Vishakhapatnam", "Chennai", "RajaDhani", 900.0, 32, 89.0));
        buses.put("vishakhapatnam-chennai", busListVC);
        busNames.put("vishakhapatnam-chennai", "KKaveri Travels, Morningstar, INDRA Travels APSRTC, RajaDhani");
        // Buses from Hyderabad to Bangalore
        List<Bus> busListHB = Arrays.asList(
        new Bus("Hyderabad", "Bangalore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Hyderabad", "Bangalore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Hyderabad", "Bangalore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Hyderabad", "Bangalore", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Hyderabad", "Bangalore", "Vkaveri Travels,TSRTC", 1200.0, 10, 89.0));
        buses.put("hyderabad-bangalore", busListHB);
        busNames.put("hyderabad-bangalore", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels,TSRTC");
       
        // Buses from Srikakulam to Ongole
        List<Bus> busListSO = Arrays.asList(
        new Bus("Srikakulam", "Ongole", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Srikakulam", "Ongole", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Srikakulam", "Ongole", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Srikakulam", "Ongole", "APSRTC", 900.0, 32, 89.0),
        new Bus("Srikakulam", "Ongole", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Srikakulam", "Ongole", "YOLO", 1100.0, 7, 89.0));
        buses.put("srikakulam-ongole", busListSO);
        busNames.put("srikakulam-ongole", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO");
        //Buses from Vijayawada to Bangalore
        List<Bus> busListVBL = Arrays.asList(
        new Bus("Vijayawada", "Bangalore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayawada", "Bangalore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayawada", "Bangalore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayawada", "Bangalore", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Vijayawada", "Bangalore", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Vijayawada", "Bangalore", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Vijayawada", "Bangalore", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Vijayawada", "Bangalore", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Vijayawada", "Bangalore", "YOLO", 1200.0, 10, 89.0));
        buses.put("vijayawada-bangalore", busListVBL);
        busNames.put("vijayawada-bangalore", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO");

        //Buses from Vijayawada to Hyderabad
        List<Bus> busListVH = Arrays.asList(
        new Bus("Vijayawada", "Hyderabad", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayawada", "Hyderabad", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayawada", "Hyderabad", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayawada", "Hyderabad", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Vijayawada", "Hyderabad", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Vijayawada", "Hyderabad", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Vijayawada", "Hyderabad", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Vijayawada", "Hyderabad", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Vijayawada", "Hyderabad", "YOLO", 1200.0, 10, 89.0));
        buses.put("vijayawada-hyderabad", busListVH);
        busNames.put("vijayawada-hyderabad", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO");

        //Buses from Vijayawada to Chennai
        List<Bus> busListVCH = Arrays.asList(
        new Bus("Vijayawada", "Chennai", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayawada", "Chennai", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayawada", "Chennai", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayawada", "Chennai", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Vijayawada", "Chennai", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Vijayawada", "Chennai", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Vijayawada", "Chennai", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Vijayawada", "Chennai", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Vijayawada", "Chennai", "YOLO", 1200.0, 10, 89.0));
        buses.put("vijayawada-chennai", busListVCH);
        busNames.put("vijayawada-chennai", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO");

        //Buses from Vijayawada to Vishakhapatnam
        List<Bus> busListVV = Arrays.asList(
        new Bus("Vijayawada", "Vishakhapatnam", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Vijayawada", "Vishakhapatnam", "YOLO", 1200.0, 10, 89.0));
        buses.put("vijayawada-vishakhapatnam", busListVV);
        busNames.put("vijayawada-vishakhapatnam", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO");
         //Buses from Vijayanagaram to Hyderabad
        List<Bus> busListVHH = Arrays.asList(
        new Bus("Vijayanagaram", "Hyderabad", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "APSRTC", 900.0, 32, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "YOLO", 1100.0, 7, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "Mojo", 1400.0, 5, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "SriKrishna Travels", 2500.0, 6, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "Orange Travels", 1200.0, 8, 89.0),
        new Bus("Vijayanagaram", "Hyderabad", "S.K.S Tours and Travels", 1300.0, 8, 89.0));
        buses.put("vijayanagaram-hyderabad", busListVHH);
        busNames.put("vijayanagaram-hyderabad", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Vijayanagaram to Vijayawada
        List<Bus> busListVVV = Arrays.asList(
        new Bus("Vijayanagaram", "Vijayawada", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "APSRTC", 900.0, 32, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "YOLO", 1100.0, 7, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "Mojo", 1400.0, 5, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "SriKrishna Travels", 2500.0, 6, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "Orange Travels", 1200.0, 8, 89.0),
        new Bus("Vijayanagaram", "Vijayawada", "S.K.S Tours and Travels", 1300.0, 8, 89.0));
        buses.put("vijayanagaram-vijayawada", busListVVV);
        busNames.put("vijayanagaram-vijayawada", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Vijayanagaram to Bangalore
        List<Bus> busListVBB = Arrays.asList(
        new Bus("Vijayanagaram", "Bangalore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "APSRTC", 900.0, 32, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "YOLO", 1100.0, 7, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "Mojo", 1400.0, 5, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "SriKrishna Travels", 2500.0, 6, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "Orange Travels", 1200.0, 8, 89.0),
        new Bus("Vijayanagaram", "Bangalore", "S.K.S Tours and Travels", 1300.0, 8, 89.0));
        buses.put("vijayanagaram-bangalore", busListVBB);
        busNames.put("vijayanagaram-bangalore", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Vijayanagaram to Rajahmundry
        List<Bus> busListVR = Arrays.asList(
        new Bus("Vijayanagaram", "Rajahmundry", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "APSRTC", 900.0, 32, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "YOLO", 1100.0, 7, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "Mojo", 1400.0, 5, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "SriKrishna Travels", 2500.0, 6, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "Orange Travels", 1200.0, 8, 89.0),
        new Bus("Vijayanagaram", "Rajahmundry", "S.K.S Tours and Travels", 1300.0, 8, 89.0));
        buses.put("vijayanagaram-rajahmundry", busListVR);
        busNames.put("vijayanagaram-rajahmundry", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Vijayanagaram to Chennai
        List<Bus> busListVCC = Arrays.asList(
        new Bus("Vijayanagaram", "Chennai", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vijayanagaram", "Chennai", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vijayanagaram", "Chennai", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vijayanagaram", "Chennai", "APSRTC", 900.0, 32, 89.0),
        new Bus("Vijayanagaram", "Chennai", "IntRcity", 1200.0, 12, 89.0),
        new Bus("Vijayanagaram", "Chennai", "YOLO", 1100.0, 7, 89.0),
        new Bus("Vijayanagaram", "Chennai", "Mojo", 1400.0, 5, 89.0),
        new Bus("Vijayanagaram", "Chennai", "SriKrishna Travels", 2500.0, 6, 89.0),
        new Bus("Vijayanagaram", "Chennai", "Orange Travels", 1200.0, 8, 89.0),
        new Bus("Vijayanagaram", "Chennai", "S.K.S Tours and Travels", 1300.0, 8, 89.0));
        buses.put("vijayanagaram-chennai", busListVCC);
        busNames.put("vijayanagaram-chennai", "KKaveri Travels, Morningstar, INDRA Travels, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");
        //Buses from Bangalore to Kurnool
        List<Bus> busListBK = Arrays.asList(
        new Bus("Bangalore", "Kurnool", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Bangalore", "Kurnool", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Bangalore", "Kurnool", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Bangalore", "Kurnool", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Bangalore", "Kurnool", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Bangalore", "Kurnool", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Bangalore", "Kurnool", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Bangalore", "Kurnool", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Bangalore", "Kurnool", "YOLO", 1400.0, 9, 89.0),
        new Bus("Bangalore", "Kurnool", "Mojo", 1600.0, 9, 89.0),
        new Bus("Bangalore", "Kurnool", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Bangalore", "Kurnool", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Bangalore", "Kurnool", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("bangalore-kurnool", busListBK);
        busNames.put("bangalore-kurnool", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Hyderabad to Kurnool
        List<Bus> busListHK = Arrays.asList(
        new Bus("Hyderabad", "Kurnool", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Hyderabad", "Kurnool", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Hyderabad", "Kurnool", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Hyderabad", "Kurnool", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Hyderabad", "Kurnool", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Hyderabad", "Kurnool", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Hyderabad", "Kurnool", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Hyderabad", "Kurnool", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Hyderabad", "Kurnool", "YOLO", 1400.0, 9, 89.0),
        new Bus("Hyderabad", "Kurnool", "Mojo", 1600.0, 9, 89.0),
        new Bus("Hyderabad", "Kurnool", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Hyderabad", "Kurnool", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Hyderabad", "Kurnool", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("hyderabad-kurnool", busListHK);
        busNames.put("hyderabad-kurnool", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Chennai to Kurnool
        List<Bus> busListCK = Arrays.asList(
        new Bus("Chennai", "Kurnool", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Chennai", "Kurnool", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Chennai", "Kurnool", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Chennai", "Kurnool", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Chennai", "Kurnool", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Chennai", "Kurnool", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Chennai", "Kurnool", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Chennai", "Kurnool", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Chennai", "Kurnool", "YOLO", 1400.0, 9, 89.0),
        new Bus("Chennai", "Kurnool", "Mojo", 1600.0, 9, 89.0),
        new Bus("Chennai", "Kurnool", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Chennai", "Kurnool", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Chennai", "Kurnool", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("chennai-kurnool", busListCK);
        busNames.put("chennai-kurnool", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Bangalore to Guntur
        List<Bus> busListBG = Arrays.asList(
        new Bus("Bangalore", "Guntur", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Bangalore", "Guntur", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Bangalore", "Guntur", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Bangalore", "Guntur", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Bangalore", "Guntur", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Bangalore", "Guntur", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Bangalore", "Guntur", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Bangalore", "Guntur", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Bangalore", "Guntur", "YOLO", 1400.0, 9, 89.0),
        new Bus("Bangalore", "Guntur", "Mojo", 1600.0, 9, 89.0),
        new Bus("Bangalore", "Guntur", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Bangalore", "Guntur", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Bangalore", "Guntur", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("bangalore-guntur", busListBG);
        busNames.put("bangalore-guntur", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Chennai to Guntur
        List<Bus> busListCG = Arrays.asList(
        new Bus("Chennai", "Guntur", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Chennai", "Guntur", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Chennai", "Guntur", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Chennai", "Guntur", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Chennai", "Guntur", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Chennai", "Guntur", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Chennai", "Guntur", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Chennai", "Guntur", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Chennai", "Guntur", "YOLO", 1400.0, 9, 89.0),
        new Bus("Chennai", "Guntur", "Mojo", 1600.0, 9, 89.0),
        new Bus("Chennai", "Guntur", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Chennai", "Guntur", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Chennai", "Guntur", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("chennai-guntur", busListCG);
        busNames.put("chennai-guntur", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Vishakhapatnam to Guntur
        List<Bus> busListVG = Arrays.asList(
        new Bus("Vishakhapatnam", "Guntur", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "YOLO", 1400.0, 9, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "Mojo", 1600.0, 9, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Vishakhapatnam", "Guntur", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("vishakhapatnam-guntur", busListVG);
        busNames.put("vishakhapatnam-guntur", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");
        //Buses from Bangalore to Nellore
        List<Bus> busListBN = Arrays.asList(
        new Bus("Bangalore", "Nellore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Bangalore", "Nellore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Bangalore", "Nellore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Bangalore", "Nellore", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Bangalore", "Nellore", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Bangalore", "Nellore", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Bangalore", "Nellore", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Bangalore", "Nellore", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Bangalore", "Nellore", "YOLO", 1400.0, 9, 89.0),
        new Bus("Bangalore", "Nellore", "Mojo", 1600.0, 9, 89.0),
        new Bus("Bangalore", "Nellore", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Bangalore", "Nellore", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Bangalore", "Nellore", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("bangalore-nellore", busListBN);
        busNames.put("bangalore-nellore", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Hyderabad to Nellore
        List<Bus> busListHN = Arrays.asList(
        new Bus("Hyderabad", "Nellore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Hyderabad", "Nellore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Hyderabad", "Nellore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Hyderabad", "Nellore", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Hyderabad", "Nellore", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Hyderabad", "Nellore", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Hyderabad", "Nellore", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Hyderabad", "Nellore", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Hyderabad", "Nellore", "YOLO", 1400.0, 9, 89.0),
        new Bus("Hyderabad", "Nellore", "Mojo", 1600.0, 9, 89.0),
        new Bus("Hyderabad", "Nellore", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Hyderabad", "Nellore", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Hyderabad", "Nellore", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("hyderabad-nellore", busListHN);
        busNames.put("hyderabad-nellore", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        //Buses from Chennai to Nellore
        List<Bus> busListCN = Arrays.asList(
        new Bus("Chennai", "Nellore", "KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Chennai", "Nellore", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Chennai", "Nellore", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Chennai", "Nellore", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Chennai", "Nellore", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Chennai", "Nellore", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Chennai", "Nellore", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Chennai", "Nellore", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Chennai", "Nellore", "YOLO", 1400.0, 9, 89.0),
        new Bus("Chennai", "Nellore", "Mojo", 1600.0, 9, 89.0),
        new Bus("Chennai", "Nellore", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Chennai", "Nellore", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Chennai", "Nellore", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("chennai-nellore", busListCN);
        busNames.put("chennai-nellore", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

        // Buses from chapta to hyderabad
        List<Bus> busListVN = Arrays.asList(
        new Bus("Chapta","Hyderabad","KKaveri Travels", 1800.0, 30, 89.0),
        new Bus("Chapta","Hyderabad", "Morningstar", 2000.0, 22, 89.0),
        new Bus("Chapta","Hyderabad", "INDRA Travels", 1600.0, 10, 89.0),
        new Bus("Chapta","Hyderabad", "RajaDhani", 1700.0, 11, 89.0),
        new Bus("Chapta","Hyderabad", "Vkaveri Travels", 1200.0, 10, 89.0),
        new Bus("Chapta","Hyderabad", "TSRTC", 1000.0, 11, 89.0),
        new Bus("Chapta","Hyderabad", "APSRTC", 1100.0, 3, 89.0),
        new Bus("Chapta","Hyderabad", "IntRcity", 1200.0, 9, 89.0),
        new Bus("Chapta","Hyderabad", "YOLO", 1400.0, 9, 89.0),
        new Bus("Chapta","Hyderabad", "Mojo", 1600.0, 9, 89.0),
        new Bus("Chapta","Hyderabad", "SriKrishna Travels", 1900.0, 9, 89.0),
        new Bus("Chapta","Hyderabad", "Orange Travels", 2000.0, 9, 89.0),
        new Bus("Chapta","Hyderabad", "S.K.S Tours and Travels", 2000.0, 9, 89.0));
        buses.put("chapta-hyderabad", busListVN);
        busNames.put("chapta-hyderabad", "KKaveri Travels, Morningstar, INDRA Travels, RajaDhani, Vkaveri Travels, TSRTC, APSRTC, IntRcity, YOLO, Mojo, SriKrishna Travels, Orange Travels, S.K.S Tours and Travels");

    }
    }

//recharge plan code
class A
{
	static Scanner s=new Scanner(System.in);
	double recharge(double plan)
	{
		return plan;
	}
}
class Cell extends A
{	
	static double bill=0;
	double Artilreception()
	{	
		System.out.println("welcome to cellShop :");
		System.out.println("Select the Recharge plan"); 
		System.out.println("$----------------------------------------------$");
		System.out.println("|  no  | plan Price  | Plan Validity           |" );
		System.out.println("|--------------------------------------------|");
		System.out.println("| 1	   | 199    	 | 22 Days               |");
		System.out.println("| 2	   | 299         | 28 Days               |");
		System.out.println("| 3	   | 499         | 70 Days               |");
		System.out.println("| 4	   | 399         | 66 Days               |");
		System.out.println("| 5	   | 666         | 88 Days               |");
		System.out.println("| 6	   | 769         | 108 Days              |");
		System.out.println("$----------------------------------------------$");
		double c=Display();
		double d=recharge(c);
		System.out.println("If you want change plan ");
		System.out.println("\t\t\t1-Re Recharge\n\t\t\t 2-Billing");
		int a=s.nextInt();
		if(a==1)
		{
		Artilreception();
		}
		else if(a==2)
		{
		 bill=billing(d);
		}
		else{
		System.out.println("\t\t\tInvalid selection\n Please Select Valid Option");
		Artilreception();
		}
		return bill;
	}
	double billing(double bill)
	{
		bill=bill+0.2;
		return bill;
	}
	double Display()
	{
		int a=s.nextInt();
		int d=0;
		if(a==1)
		d=199;
		else if(a==2)
		d= 299;
		else if(a==3)
		d= 499;
		else if(a==4)
		d=399;
		else if(a==5)
		d=666;
		else if(a==6)
		d=769;
		else 
		{
		System.out.println("Invalid Selection press 1 for recharge");
		Display();	
		}
	return d;
	}
}
class CellB extends A
{	
	static double bill=0;
	double Jioreception()
	{	
		System.out.println("welcome to cellShop :");
		System.out.println("Select the Recharge plan"); 
		System.out.println("$----------------------------------------------$");
		System.out.println("|  no  | plan Price  | Plan Validity           |" );
		System.out.println("|--------------------------------------------|");
		System.out.println("| 1	   | 199    	 | 22 Days               |");
		System.out.println("| 2	   | 299         | 28 Days               |");
		System.out.println("| 3	   | 499         | 70 Days               |");
		System.out.println("| 4	   | 399         | 66 Days               |");
		System.out.println("| 5	   | 666         | 88 Days               |");
		System.out.println("| 6	   | 769         | 108 Days              |");
		System.out.println("$----------------------------------------------$");
		double c=Display();
		double d=recharge(c);
		System.out.println("If you want change plan ");
		System.out.println("\t\t\t1-Re Recharge\n\t\t\t 2-Billing");
		int a=s.nextInt();
		if(a==1)
		{
		Jioreception();
		}
		else if(a==2)
		{
		 bill=billing(d);
		}
		else{
		System.out.println("\t\t\tInvalid selection\n Please Select Valid Option");
		Jioreception();
		}
		return bill;
	}
	double billing(double bill)
	{
		bill=bill+0.2;
		return bill;
	}
	double Display()
	{
		int a=s.nextInt();
		int d=0;
		if(a==1)
		d=199;
		else if(a==2)
		d= 299;
		else if(a==3)
		d= 499;
		else if(a==4)
		d=399;
		else if(a==5)
		d=666;
		else if(a==6)
		d=769;
		else 
		{
		System.out.println("Invalid Selection press 1 for recharge");
		Display();	
		}
	return d;
	}
}
class CellC extends A
{	
	static double bill=0;
	double vireception()
	{	
		System.out.println("welcome to cellShop :");
		System.out.println("Select the Recharge plan"); 
		System.out.println("$----------------------------------------------$");
		System.out.println("|  no  | plan Price  | Plan Validity           |" );
		System.out.println("|--------------------------------------------|");
		System.out.println("| 1	   | 199    	 | 22 Days               |");
		System.out.println("| 2	   | 299         | 28 Days               |");
		System.out.println("| 3	   | 499         | 70 Days               |");
		System.out.println("| 4	   | 399         | 66 Days               |");
		System.out.println("| 5	   | 666         | 88 Days               |");
		System.out.println("| 6	   | 769         | 108 Days              |");
		System.out.println("$----------------------------------------------$");
		double c=Display();
		double d=recharge(c);
		System.out.println("If you want change plan ");
		System.out.println("\t\t\t1-Re Recharge\n\t\t\t 2-Billing");
		int a=s.nextInt();
		if(a==1)
		{
		vireception();
		}
		else if(a==2)
		{
		 bill=billing(d);
		}
		else{
		System.out.println("\t\t\tInvalid selection\n Please Select Valid Option");
		vireception();
		}
		return bill;
	}
	double billing(double bill)
	{
		bill=bill+0.2;
		return bill;
	}
	double Display()
	{
		int a=s.nextInt();
		int d=0;
		if(a==1)
		d=199;
		else if(a==2)
		d= 299;
		else if(a==3)
		d= 499;
		else if(a==4)
		d=399;
		else if(a==5)
		d=666;
		else if(a==6)
		d=769;
		else 
		{
		System.out.println("Invalid Selection press 1 for recharge");
		Display();	
		}
	return d;
	}
}
class CellD extends A
{	
	static double bill=0;
	double BSNLreception()
	{	
		System.out.println("welcome to cellShop :");
		System.out.println("Select the Recharge plan"); 
		System.out.println("$----------------------------------------------$");
		System.out.println("|  no  | plan Price  | Plan Validity           |" );
		System.out.println("|--------------------------------------------|");
		System.out.println("| 1	   | 199    	 | 22 Days               |");
		System.out.println("| 2	   | 299         | 28 Days               |");
		System.out.println("| 3	   | 499         | 70 Days               |");
		System.out.println("| 4	   | 399         | 66 Days               |");
		System.out.println("| 5	   | 666         | 88 Days               |");
		System.out.println("| 6	   | 769         | 108 Days              |");
		System.out.println("$----------------------------------------------$");
		double c=Display();
		double d=recharge(c);
		System.out.println("If you want change plan ");
		System.out.println("\t\t\t1-Re Recharge\n\t\t\t 2-Billing");
		int a=s.nextInt();
		if(a==1)
		{
		BSNLreception();
		}
		else if(a==2)
		{
		 bill=billing(d);
		}
		else{
		System.out.println("\t\t\tInvalid selection\n Please Select Valid Option");
		BSNLreception();
		}
		return bill;
	}
	double billing(double bill)
	{
		bill=bill+0.2;
		return bill;
	}
	double Display()
	{
		int a=s.nextInt();
		int d=0;
		if(a==1)
		d=199;
		else if(a==2)
		d= 299;
		else if(a==3)
		d= 499;
		else if(a==4)
		d=399;
		else if(a==5)
		d=666;
		else if(a==6)
		d=769;
		else 
		{
		System.out.println("Invalid Selection press 1 for recharge");
		Display();	
		}
	return d;
	}
}
class finalRecharge
{
	double displayReCharge()
	{
		double bill=0;
		System.out.println("Select The Specified Sim Card");
		System.out.println("\t\t1-Artle\t\t2-Jio\t\t3-Vi\t\t4-BSNl");
		while(true)
		{
		int a=A.s.nextInt();
		if(a==1)
		{
			bill=new Cell().Artilreception();
			break;
		}
		else if(a==2)
		{
			bill=new CellB().Jioreception();
			break;
		}
		else if(a==3)
		{
			bill=new CellC().vireception();
			break;
		}
		else if(a==4)
		{
			bill=new CellD().BSNLreception();
			break;
		}
		else
		{
			System.out.println("Please Select Valid Option");
		}
		}
		return bill;
	}
}


	

//User login
class login extends Hotel
{
        private String UserName="HotelRooms";
        private String password="123@Hotel";
        private long phno=1234567890l;
        String newUsername;
	String passwordNew;
        static login n=new login();
        static Scanner s=new Scanner(System.in);
        void SetName(String name)
        {
            this.UserName=name;
        }
        void Setpass(String password)
        {
            this.password=password;
        }
        String getName()
        {
            return UserName;
        }
        String getpass()
        {
            return password;
        }
        long getph()
        {
            return phno;
        }
        login(String User_Name,String password,long phno)
        {
            this.UserName=User_Name;
            this.password=password;
            this.phno=phno;
        }
        login()
        {
            
        }
        static //static block
        { 
	         
System.out.println(blink+green +"\t\t\to      o        8                                  o                                                               o                      "); 
             System.out.println("\t\t\t8      8        8                                  8                                                               8                       ");
             System.out.println("\t\t\t8      8 .oPYo. 8 .oPYo. .oPYo. ooYoYo. .oPYo.    o8P .oPYo.   .oPYo. o    o .oPYo. .oPYo. oPYo. .oPYo.   .oPYo.  o8P .oPYo. o    o .oPYo. ");
             System.out.println("\t\t\t8  db  8 8oooo8 8 8    ' 8    8 8' 8  8 8oooo8     8  8    8   8    ' Y.  .P 8    ' 8    8 8  `' 8    8   Yb..     8  .oooo8 8    8 Yb..   ");
             System.out.println("\t\t\t`b.PY.d' 8.     8 8    . 8    8 8  8  8 8.         8  8    8   8    . `b..d' 8    . 8    8 8     8    8     'Yb.   8  8    8 8    8   'Yb. ");
             System.out.println("\t\t\t `8  8'  `Yooo' 8 `YooP' `YooP' 8  8  8 `Yooo'     8  `YooP'   `YooP'  `YP'  `YooP' `YooP' 8     8YooP'   `YooP'   8  `YooP8 `YooP8 `YooP' ");
             System.out.println("\t\t\t::..:..:::.....:..:.....::.....:..:..:..:.....:::::..::.....::::.....:::...:::.....::.....:..::::8 ....::::.....:::..::.....::....8 :.....:");
             System.out.println("\t\t\t:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::8 ::::::::::::::::::::::::::::ooP'.:::::::");
             System.out.println("\t\t\t:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::..::::::::::::::::::::::::::::...:::::::::"+def);
	     System.out.println();
	         
	}

	  int generateOTP(int otp) 
          {  
          otp=1000+(int)(Math.random()*8999);
               
		    return otp;  
          } 
         
	   void UserDetails() //Starting Details
	   {
	        System.out.println(green+"\t\t\t\tEnter your credentials to Login"+def);
		    System.out.println(MAGENTA+"\t\tEnter username: "+def);
	        String Username = sc.next();
	        System.out.println(yellow+"\t\tEnter password: "+def);
	        String Password = sc.next();
	        if (Username.equals(n.getName()) && Password.equals(n.getpass())) 
	        {	        	
	        	OtpCheck();
	        }
	        else if(Username.equals(n.getName()) && !Password.equals(n.getpass()))
	        {
	            System.out.println(red+"\t\t\tInvalid password press 1 reset"+def);
	            int n=sc.nextInt();
	            if(n==1)
	            {
	                System.out.println(green+"\t\t\tEnter Mobile Number to reset Password"+def);
	                long phno=sc.nextLong();
	                if(phno==(getph()))
	                {
	                     Setpass(s.next());
	                     System.out.println(yellow+"\t\t\tyour new password is"+getpass()+def);
	                }
	                else if(phno!=(getph()))
	                {
	                    System.out.println(red+"\t\t\tInvalid Phone number enter a valid number"+def);
	                    long k=sc.nextLong();
	                    if(k==(getph()))
	                    {
	                        Setpass(s.next());
	                        System.out.println(cyan+"\t\t\tyour new password is"+getpass()+def);
	                    }
	                    else
	                    {
	                        System.out.println(red+"\t\t\tAttempts exceeded create a new account"+def);
	                        signup();
	                    }
	                    
	                }
	            }
	        }
	        else if(!Username.equals(n.getName()) &&!Password.equals(n.getpass()))
	        {
	                System.out.println(red+"\t\t\tUser Not found\nCreate A New Account"+def);
	                signup();
		    }
		    else
		    {
		       System.out.println(red+"\t\t\tINVALID USER NAME"+def);
		       System.out.println(green+"\t\t\tReset Your User name"+def);
		       System.out.println(purple+"\t\t\tEnter Your Phone Number :"+def);
		       long phno=sc.nextLong();
		       if(phno==n.getph())
		       {
		       System.out.println(MAGENTA+"User Name is :"+n.getName()+def);
		       UserDetails();
		       }
		        else
	           {
	           System.out.println(red+"\t\t\tAttempts exceeded create a new account"+def);
	           signup();
	            }
		       
		   }
    }
        void signup()  // New account creation
	    {
	    System.out.println(green+"\t\tEnter new UserName:"+def);
	    newUsername=sc.next();
	    System.out.println(blue+"\t\tEnter New Password:"+def);
	    System.out.println(red+"\t\tThe Password contains atleast one uppercase\n\t\tone lowercase\n\t\tone integer value\n\t\tone special character\n\t\tno space and password length should be 8 characters"+def);
	    passwordNew=sc.next();
	    boolean capital=false;
	    boolean small=false;
	    boolean number=false;
	    boolean special=false;
	    boolean space=true;
	    for(int i=0;i<passwordNew.length();i++)
	    {
	        char ch=passwordNew.charAt(i);
	        if(ch>='A'&&ch<='Z')
	        {
	            capital=true;
	        }
	        else if(ch>='a'&&ch<='z')
	        {
	            small=true;
	        }
	        else if(ch>='0'&&ch<='9')
	        {
	            number=true;
	        }
	        else if(ch!=' ')
	        {
	            special=true;
	        }
	        else
	        {
	            space=false;
	        }
	    }
	    if(capital&&small&&number&&special&&space&&passwordNew.length()==8)
	    {
	        System.out.println(green+"Password Matched"+def);
	        
	    }
	    else
	    {
	        System.out.println(red+"\t\t\tNot valid\n\t\t\tEnter valid Password\n"+def);
	        signup();
	    }
	    
	    System.out.println(skblue+"\t\t\tEnter Phone number:"+def);
		while(true)
		{
	    long phno=sc.nextLong();
	    if(phno>=1000000000l&&phno<=9999999999l)
	    {
	    	new login(UserName,password,phno);
		System.out.println(skblue+"\t\t\tSuccessfully created your account"+def);
	        System.out.println(green+"Login"+def);
			newLogin();
			break;
		}
	    else{
	    System.out.println(red+"\t\tInvalid Phone number Digit\n Enter Valid Phone Number"+def);
		}
	}
	    
	}
	void newLogin()  //Login after account creation
	{
	    System.out.println(yellow+"\t\t\t\tEnter UserName : "+def);
	    String user=newUsername;
	    String enterUser=sc.next();
	    System.out.println(cyan+"\t\t\t\tEnter Password : "+def);
	    String pass=passwordNew;
	    String enterpass=sc.next();
    		if(user.equals(enterUser)&&pass.equals(enterpass))
		    {
		        
		    	System.out.println(green+"\t\t\t\tLogin Successful\3"+def);
		    	OtpCheck();
	    	}
	    	else if(!user.equals(enterUser)&&!pass.equals(enterpass))
		    {
		        System.out.println(yellow+"\t\t\t\tenter valid details and login again"+def);
		        newLogin();
		    }
	    	else if(!user.equals(enterUser)&&pass.equals(enterpass))
		    {
		        System.out.println(yellow+"\t\t\t\tInvalid Username\nEnter valid Username"+def);
		        newLogin();
		    }
		    else
		    {
		        System.out.println(red+"\t\t\t\tinvalid Password\nEnter valid Password"+def);
		        newLogin();
		    }
	}
		void servicess()
		{
			System.out.println(cyan+"\t\t\t\t1.Hotel Reservation\3\t\t\t\t2.Food Order\3\t\t\t3.Bus Ticket Booking\3\t\t\t4.Mobil Recharge "+def);
                  int x=sc.nextInt();
                 Payment obj2 =new Payment();
		System.out.println("Start the proccess for press 1 or exit for any key ");
		char n=sc.next().charAt(0);
			while(true)
			{
                  		if(x==1)
                 		 {
                			 System.out.println(yellow+"\t\t\t\t\2Start your Booking\3"+def);
                 			new Hotel().displayhotels();
                			 obj2.paymentmethod(Hotel.obj.Hotelbill());
				 	break;
                 		}
                  	else if(x==2)
                 	 {
                 		System.out.println(skblue+"\t\t\t\t\tWELCOME TO RESTAURANT"+def);
                    		new Canteen().selection();
                   		 double bill=Canteen.Resbilling();
                  		  obj2.paymentmethod(bill);
				break;
                 	 }
                  	else if(x==3)
                  	{
                      	System.out.println(purple+"\t\t\tBus Ticket Booking"+def);
                      	double bill=new BusTicketBooking().busses();
                      	obj2.paymentmethod(bill);
			break;
                      
                 	 }
			else if(x==4)
			{
				System.out.print("Enter Your Mobil Number :");
				long pno=sc.nextLong();
				if(pno>=1000000000l&&pno<=9999999999l)
				{
				bill=new finalRecharge().displayReCharge();
				obj2.paymentmethod(bill);
				break;
				}
			}
			else 
			{
				System.out.println("\t\tINVALID SELECTION PLEASE SELECT VALID OPTION");
			}
		}	
		}
           void OtpCheck() //otp check
           {
    		  int otp=generateOTP(1);
      	      System.out.println(otp);
		      System.out.println(purple+"\t\t\t\t\tEnter OTP"+def);
      	      int s=sc.nextInt();
              if (otp==s)
              {
                  servicess();
              }
              else
              {
                  System.out.println(red+"\t\t\t\t\tOTP entered is wrong"+def);
                  System.out.println(blue+"\t\t\t\t\tResending otp"+def);
                  OtpCheck();
              }
         }
}
//Main class
class User 
{
    static Scanner sc =new Scanner(System.in);
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static  String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static  String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static  String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static  String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    static  String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static  String ANSI_CYAN_BACKGROUND = "\u001B[46m";
     static  String WHITE= "\u001B[47m";
    static String BLACK_BOLD = "\033[1;30m";  // BLACK
     static  String RED_BOLD = "\033[1;31m";    // RED
     static  String GREEN_BOLD = "\033[1;32m";  // GREEN
     static  String YELLOW_BOLD = "\033[1;33m"; // YELLOW
     static  String BLUE_BOLD = "\033[1;34m";   // BLUE
     static  String PURPLE_BOLD = "\033[1;35m"; // PURPLE
     static final String CYAN_BOLD = "\033[1;36m";   // CYAN
     static final String WHITE_BOLD = "\033[1;37m"; 

    public static void main(String[]args)
    {
       
       login lg=new login();
       System.out.println(RED_BOLD+ANSI_YELLOW_BACKGROUND+"\t\t\t\t\t\t\tSELECT  LOGIN OR SIGNUP"+def);
       System.out.println(CYAN_BOLD+"\t\t\t\t\t1.LOGIN"+def+"        "+ CYAN_BOLD+"\t\t\t\t\t\t\t2.SIGNUP"+def);
       int a=sc.nextInt();
       if(a==1)
       {
            lg.UserDetails();
       }
       else if(a==2)
       {
           lg.signup();
       }
       else
       {
           System.out.println(RED_BOLD+"\t\t\t\tInvalid selection\nselect valid option"+def);
           main(null);
           
           
       }
       
    }
}

