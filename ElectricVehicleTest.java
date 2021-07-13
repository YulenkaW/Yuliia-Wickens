
package project3.pkg2;


import org.junit.Test;
import static org.junit.Assert.*;


public class ElectricVehicleTest {
    
    public ElectricVehicleTest() {
    }
    @Test
            public void testConstructor(){
                //arrage 
                
                String expectedColor= "color";
                String expectedMake="";
                String expectedModel="model";
                int expectedMaxKilowattHours=3500;
                int expectedMaxKilowattHoursInBattery=1000;
                double expectedKilometersPerKilowattHour=1;    
                int expectedCurrentKilowatHoursInBattery=350;
                //act
    // ElectricVehicle electricVehicle =new ElectricVehicle(expectedMake,expectedModel,expectedColor,expectedMaxKilowattHours,expectedKilometersPerKw, expectedMaxKilowattHoursInBattery);
    ElectricVehicle electricVehicle = new ElectricVehicle(expectedMake, expectedModel, expectedColor, expectedKilometersPerKw, expectedCurrentKilowatHoursInBattery,expectedMaxKilowattHoursInBattery);
    
    String actualColor=electricVehicle.getColor();
     int actualMaxKilowattHours=electricVehicle.getMaxKilowattHoursInBattery();
     int actualKilometersPerKilowattHour=electricVehicle.getKilometersPerKw();
     int actualCurrentKilowatHoursInBattery=electricVehicle.getCurrentKilowatHoursInBattery;
     
     //assert
     assertEquals(expectedColor, actualColor);
     assertEquals(expectedMaxKilowattHours,actualMaxKilowattHours );
     assertEquals(expectedMaxKilowattHoursInBattery, actualMaxKilowattHoursInBattery);
     assertEquals(expectedCurrentKilowatHoursInBattery, actualCurrentKilowatHoursInBattery);
            }
     public void testChargeNotLessThen0(){
         //arrage
        
                 String expectedColor= "color";
                String expectedMake="";
                String expectedModel="model";
                int expectedMaxKilowattHours=3500;
                int expectedMaxKilowattHoursInBattery=1000;
                double expectedKilometersPerKilowattHour=0;    
                int expectedCurrentKilowatHoursInBattery=350;
                ElectricVehicle electricVehicle =new ElectricVehicle(expectedMake,expectedModel,expectedColor,expectedMaxKilowattHours, expectedKilometersPerKilowattHour,expectedMaxKilowattHoursInBattery);
         //act
         electricVehicle.setCurrentKilowatHoursInBattery(-10);
         int actualCurrentKilowatHoursInBattery=electricVehicle.getCurrentKilowatHoursInBattery();
         
         //assert
         assertEquals(expectedCurrentKilowatHoursInBattery, actualCurrentKilowatHoursInBattery);
     }
     
    
     
            
                
           
    
   
   @Test
    
   
    public void testToString() {
       //System.out.println("toString");
        ElectricVehicle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        

    }
    
    /**
     * Test of charge method, of class ElectricVehicle.
     */
    
    @Test
    public void testCharge() {
       // System.out.println("charge");
        int charge = 0;
        ElectricVehicle instance = null;
        instance.charge(charge);
        
    }
  
   
    /**
     * Test of setColor method, of class ElectricVehicle.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String Color = "";
        ElectricVehicle instance = null;
        instance.setColor(Color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

  
}
