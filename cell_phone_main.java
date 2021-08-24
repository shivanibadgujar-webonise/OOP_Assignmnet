//OOP assignment

import java.util.*;


interface cell_phone
{
    void specifications();
    void phone_dial();
    void sim_card();
    void camera();
    void sms();    
};

class samsung_phone implements cell_phone{
    
    public void specifications()
    {
        System.out.println("Samsung Features");
    }
    public void phone_dial(){
        System.out.println("1. Default phone dial by samsung.");
    } 
    public void sim_card()
    {
        System.out.println("2. Double-sim card slots.");
    }
    public void camera()
    {
        System.out.println("3. 13MP+2MP primary cameara.");
    }
    public void sms()
    {
        System.out.println("4. SMS/MMS available.");
    }

    public void samsung_connect()
    {
        System.out.println("5. samsung Connect feature.");
    }


    public void samsung_pay()
    {
        System.out.println("6. samsung pay feature.");
    }

    public void samsung_galaxy_apps()
    {
        System.out.println("7. samsung galaxy app feature");
    }
};

class nokia_phone implements cell_phone{

    public void specifications()
    {
        System.out.println("Nokia Features");
    }
    public void phone_dial(){
        System.out.println("1. Default phone dial by nokia.");
    } 
    public void sim_card()
    {
        System.out.println("2. Double-sim card slots + dedicated sd card slot.");
    }
    public void camera()
    {
        System.out.println("3. 20MP+12MP primary cameara.");
    }
    public void sms()
    {
        System.out.println("4. SMS/MMS available.");
    }

    public void nokia_care()
    {
        System.out.println("5. nokia care feature");
    }

    public void nokia_data_sense()
    {
        System.out.println("6. nokia data sense");
    }

    public void nokia_transfer_data()
    {
        System.out.println("7. nokia transfer data");
    }
};

class iphone implements cell_phone{

    public void specifications()
    {
        System.out.println("iphone Features");
    }
    public void phone_dial(){
        System.out.println("1. Default phone dial by iphone.");
    } 
    public void sim_card()
    {
        System.out.println("2. single-sim card slot.");
    }
    public void camera()
    {
        System.out.println("3. 48MP+2MP primary cameara.");
    }
    public void sms()
    {
        System.out.println("4. SMS available.");
    }

    void itunes_store()
    {
        System.out.println("5. iphone store");
    }

    void iphone_app_store()
    {
        System.out.println("6. iphone app store");
    }

    void icloud_drive()
    {
        System.out.println("7. iphone drive");
    }

};

class cell_phone_main{
    public static void main(String[] args)
{
   
    Scanner scan = new Scanner(System.in);
    samsung_phone samsung = new samsung_phone();
    nokia_phone nokia = new nokia_phone();
    iphone icell = new iphone();

    System.out.println(" ------------------------------------ Welcome to cell-phone store ------------------------------------ ");
   
    System.out.println("1. Samsung");
    System.out.println("2. Nokia");
    System.out.println("3. Iphone");
    System.out.println("4. Exit");
    System.out.println("Enter your choice :");

    int choice = scan.nextInt();
    scan.close();

    
    switch(choice)
    {
        case 1:
        samsung.specifications();
        samsung.phone_dial();
        samsung.sim_card();
        samsung.camera();
        samsung.sms();  
        samsung.samsung_connect();
        samsung.samsung_pay();
        samsung.samsung_galaxy_apps();
        break;
    

    case 2:
        nokia.specifications();   
        nokia.phone_dial();
        nokia.sim_card();
        nokia.camera();
        nokia.sms();
        nokia.nokia_care();
        nokia.nokia_data_sense();
        nokia. nokia_transfer_data();
        break;
    
    case 3:  
        icell.specifications();      
        icell.phone_dial();
        icell.sim_card();
        icell.camera();
        icell.sms();
        icell.iphone_app_store();
        icell.itunes_store();
        icell.icloud_drive();        
        break;

    case 4:
        System.out.println("Thank you for visiting us !!!");
        break;

    default:
       System.out.println("Invallid Input");
       break;
}
}
}
