
package project3.pkg2;


public class ElectricVehicle {

    //private static Object keyboard;
 String Make;
 String Model;
 String Color;
 double KilometersPerKilowattHour;
 int MaxKilowattHoursInBattery;
 int CurrentKilowatHoursInBattery;
//double kilometersToDrive;


    
    public ElectricVehicle(String Make, String Model, String Color, double KilometersPerKw, int CurrentKilowatHoursInBattery,int MaxKilowattHoursInBattery){
    this.Model=Model;
    this.Make=Make;
    this.Color=Color;
    this.KilometersPerKilowattHour=KilometersPerKw;
    this.CurrentKilowatHoursInBattery=10;
     this.MaxKilowattHoursInBattery=MaxKilowattHoursInBattery ;
    }
    

@Override
    public String toString() {
        String wht1;
        wht1=String.format("%s %s %s ", Color, Make, Model);
        String wth2=String.format("%.1f  %d  out of %d\n", KilometersPerKilowattHour,CurrentKilowatHoursInBattery, MaxKilowattHoursInBattery );
        
        return wht1+wth2;
                
        
    }
     public void charge(int charge ){
         CurrentKilowatHoursInBattery+=charge;
        if (CurrentKilowatHoursInBattery>MaxKilowattHoursInBattery){
           CurrentKilowatHoursInBattery= MaxKilowattHoursInBattery;
        }
        if (CurrentKilowatHoursInBattery<0){
            System.out.println("Your battery is 0, charge it ");
        }
     }
          
     
    public String getMake() {
        return Make;
}
    public void setMake(String Make) {
        this.Make=Make;
}
    public String getModel(){
        return Model;
    }
    public void setModel(String Model){
        this.Model=Model;
    }
        
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color=Color;
    }
     public double getKilometersPerKilowattHour(){
        return KilometersPerKilowattHour;
    }
     public void setKilometersPerKilowattHour(double KilometersPerKilowattHour){
         this.KilometersPerKilowattHour=KilometersPerKilowattHour;
     }
     public int getMaxKilowattHoursInBattery(){
         return MaxKilowattHoursInBattery;
}
     public void setMaxKilowattHoursInBattery(int MaxKilowattHoursInBattery){
         this.MaxKilowattHoursInBattery=MaxKilowattHoursInBattery;
     }  
     public int getCurrentKilowatHoursInBattery(){
         return CurrentKilowatHoursInBattery;
}
     public void setCurrentKilowatHoursInBattery(int CurrentKilowatHoursInBattery){
         this.CurrentKilowatHoursInBattery=CurrentKilowatHoursInBattery;
     }  

}
