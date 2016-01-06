// declaring constructors, methods, and variables in an enum
enum CoffeeSize{
    // 8, 10 & 16 are passed to the constructor
    BIG(8),
    HUGE(10),
    OVERWHELMING(16){ // start a code block that defines
                      // the "body" for this constant
        
        public String getLidCode(){ // override the method
                                    // defined in CoffeeSize
            return "A";
        }
    }; // the semicolon is REQUIRED when more code follows
    
    CoffeeSize(int ounces){ // constructor
        this.ounces=ounces;
    }
    
    private int ounces; // an instance variable
    public int getOunces(){
        return ounces;
    }
    
    public String getLidCode(){ // this method is overridden
                                // by the OVERWHELMING constant
        
        return "B"; // the default value we want to
                    // return for CoffeeSize constants
    }
}

class Coffee{
    CoffeeSize size; // each instance of Coffee has an enum
    
    public static void main (String[] args) {
        Coffee drink1=new Coffee();
        drink1.size=CoffeeSize.BIG;
        
        Coffee drink2=new Coffee();
        drink2.size=CoffeeSize.OVERWHELMING;
        
        System.out.println(drink1.size.getOunces()); // prints 8
        for (CoffeeSize cs: CoffeeSize.values())
            System.out.println(cs+" "+cs.getOunces());
    }
}