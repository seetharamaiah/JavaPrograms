
public class Salary {
    private static int hour;
           private static int  day;
           private static int  Offdays;

    public int getHour() {
        return hour;
    }

    public  void setHour(int hour) {
       this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public  int getOffdays() {
        return Offdays;
    }

    public void setOffdays(int Offdays) {
        this.Offdays = Offdays;
    }
    public int Calculatehourly()
    {
        int hourlyAmount=32;
        int totalAmount=this.hour*hourlyAmount;
        return totalAmount;
    }
 public int CalculateDaily()
 {
     int dailyAmount=180;
     int totalAmount=this.day*dailyAmount;
        return totalAmount;
     
 }
 public int CalculatePermanent() 
 {
      int perminentAmount=4200;
      
      return perminentAmount;
 }
}
