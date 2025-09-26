public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date (int theMonth, int theDay, int theYear){
        month = checkmonth(theMonth);
        year = theYear;
        day = checkday(theDay);
    }
    private int checkmonth(int testMonth){
        if (testMonth > 0 && testMonth <= 12){
            return testMonth;
        }else{
            System.out.println("Invalid Month " +testMonth + " Set to 1");
            return 1;
        }
        }
        private int checkday(int testDay){
            int daysofmonth[] ={0,31,28,31,30,31,30,31,31,30,31,30,31};
            if (testDay > 0 && testDay <= daysofmonth[month]){
                return testDay;
            }else if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
                return testDay;
            }else{
                System.out.println("Invalid Day " + testDay + " Set to 1");
                return 1;
            }
            }
            public int getDay(){
                return day;
            }
            public int getMonth(){
                return month;
            }
            public int getYear(){
                return year;
            }
            public void display() {
                System.out.println(day+ " "+month+" "+year);
            }
            
        
        
       }
