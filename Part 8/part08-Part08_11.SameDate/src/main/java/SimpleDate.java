
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    public boolean equals (Object compared) {
        // compare memory locations first
        if (this == compared) {
            return true; 
        }
        
        // compare data types
        if(!(compared instanceof SimpleDate)) {
            return false; 
        }
        
       // is this necessary? doesn't previous clause resolve this?
       // After googling, yes. Object >> UsedClass in order to access fields 
       SimpleDate comparedDate = (SimpleDate) compared;
       
       // check fields
       if(this.day == comparedDate.day 
               && this.month == comparedDate.month 
               && this.year == comparedDate.year) {
           return true; 
       }
       
       return false; // if other checks fail
       
    }
    

}
