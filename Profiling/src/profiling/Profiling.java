
package profiling;

import java.util.Scanner;

public class Profiling {

    
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int profilesCount=0;
        String[] names = new String[100];
        String[] email = new String[100];
        String[] password = new String[100];
        String[] civilStatus={"Single", "Married", "Divorced", "Widow"}; 
        int[] age = new int[100];
        int limit=100;
        int prfslot=100;

        System.out.println("What do you want to do?");
        boolean profiling= true;
        
       while (profiling){
            
            System.out.println();
            System.out.println("1. Create Profile");
            System.out.println("2. Search Profile");
            System.out.println("3. Show all Profiles");
        
        int select= sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("There are "+prfslot+" empty profiles remaining.\n");
                    if(prfslot==0){
                        System.out.println("Sorry");
                        continue;
                    }       if(limit==0){
                        System.out.println("Ooops profiles limit reached ");
                        continue;
                    }       sc.nextLine();
                    System.out.print("Enter Name: ");
                    names[names.length-limit] = sc.nextLine();
                    System.out.print("Enter Email: ");
                    email[names.length-limit] = sc.nextLine();
                    System.out.print("Enter Password: ");
                    password[names.length-limit] = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age[names.length-limit] = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Select civil status\n");
                    System.out.print("Single ");
                    System.out.print("Married ");
                    System.out.print("Divorced ");
                    System.out.print("Widow ");
                    civilStatus[names.length-limit]=sc.nextLine();
                    if(civilStatus[names.length-limit].equalsIgnoreCase("Single")){
                        System.out.println(civilStatus[0]);
                    }else if(civilStatus[names.length-limit].equalsIgnoreCase("Married")){
                        System.out.println(civilStatus[1] );
                    }else if(civilStatus[names.length-limit].equalsIgnoreCase("Divorced")){
                        System.out.println(civilStatus[2]);
                    }else if (civilStatus[names.length-limit].equalsIgnoreCase("Widowed")){
                        System.out.println(civilStatus[3] );
                    }else {
                        System.err.println("Invalid Input");
                        System.exit(0);
                    }       profilesCount++;
                    limit--;
                    prfslot--;
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("There are "+profilesCount+" select from 0 to "+(profilesCount-1)+".");
                    int search= sc.nextInt();
                    System.out.println("Name: " + names[search]);
                    System.out.println("Email: " + email[search]);
                    System.out.println("Password: " + password[search]);
                    System.out.println("Age: " + age[search]);
                    System.out.println("Civil Status:  "+ civilStatus[search]);
                    break;
                case 3:
                    for (int j = 0; j < names.length-limit; j++) {
                        
                        System.out.println("Profile No. "+j+"\n");
                        
                        System.out.println("Name: "+names[j]);
                        System.out.println("Email: " + email[j]);
                        System.out.println("Password: " + password[j]);
                        System.out.println("Age: " + age[j]);
                        System.out.println("Civil Status: "+ civilStatus[j]);
                        System.out.println("\n");
                    }       break;
                case 4:
                  
                default:
                    System.err.println("Invalid Input");
                    break;
            }
          
    }
    }
}
    

