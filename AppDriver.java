import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


class AppDriver {
    public static void main(String Args[]) throws IOException {
        System.out.println("\n\n" + Task_Tracker_Banner);

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        
        TaskEntry taskEntry = new TaskEntry();

        while(true) {
            
            System.out.println("\n\n Press (1) Create Today's Task List ");
            System.out.println(" Press (2) Remove Task List");
            System.out.println(" Press (3) Show Task List");
            System.out.println(" Press (4) Exit");
            
            System.out.println("\nPlease Enter Your Choice :");

			int iChoice = 0;
			
			try {
				iChoice = Integer.parseInt(bufferReader.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter number as a input.");
				bufferReader.readLine();
				continue;
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}

            switch (iChoice) {
                case 1: 
                    System.out.println("******************************* New Task Entry *******************************");

                    taskEntry = getEntryInfo();
                    System.out.println("\n**************************** Entry Updated Successfully ****************************");
                    System.out.println(taskEntry.toString());
                
                case 4:
                    System.exit(0);
            }


        }
    }

    public static TaskEntry getEntryInfo() throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        TaskEntry taskEntry = new TaskEntry();

        System.out.println("Enter Starting Time :");
        taskEntry.setStartTime(bufferReader.readLine());
        System.out.println("Enter Ending Time :");
        taskEntry.setEndTime(bufferReader.readLine());
        System.out.println("Enter Task Type (Task/Learning) :");
        taskEntry.setTaskType(bufferReader.readLine());
        System.out.println("Enter Name of Task/Learning :");
        taskEntry.setTaskName(bufferReader.readLine());
        System.out.println("Enter Description for " + taskEntry.getTaskName().toUpperCase() + " :");
        taskEntry.setDescription(bufferReader.readLine());
        return taskEntry;
    }

    public static final String Task_Tracker_Banner =
    "#################################################################################################################################################\n" +
    "#                                                                                                                                               #\n" +
    "# ###########   #########       ########   #     ###         ###########   ######     ########       #######   #     ###   #########   ######   #\n" +                                                                               
    "#      #       #         #     #           #    #                 #       #      #   #        #     #          #    #     #           #      #  #\n" +    
    "#      #       #         #    #            #   #                  #       #      #   #        #    #           #   #      #           #      #  #\n" +
    "#      #       #         #    #            #  #                   #       #     #    #        #   #            #  #       #           #     #   #\n" +
    "#      #       #         #     #           # #                    #       #    #     #        #   #            # #        #           #    #    #\n" + 
    "#      #       ###########      ######     ##         #####       #       #####      ##########   #            ##          #########  #####     #\n" +
    "#      #       #         #            #    # #                    #       #   #      #        #   #            # #        #           #   #     #\n" +
    "#      #       #         #             #   #  #                   #       #    #     #        #   #            #  #       #           #    #    #\n" +
    "#      #       #         #             #   #   #                  #       #     #    #        #    #           #   #      #           #     #   #\n" +
    "#      #       #         #            #    #    #                 #       #      #   #        #     #          #    #     #           #      #  #\n" +
    "#      #       #         #    ########     #     ###              #       #       #  #        #      #######   #     ###   #########  #       # #\n" +
    "#                                                                                                                                               #\n" +
    "#################################################################################################################################################\n";
}