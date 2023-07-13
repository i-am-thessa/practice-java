class Solution {
    public static final String[] TYPES = {
        "Sedan",
        "Compact",
        "Roadster",
        "Minivan",
        "SUV",
        "Convertible",
        "Cargo",
        "Others"
    };

    public static final String[] SYMBOLS = {"I", "V", "X", "L", "C", "D", "M"};
     public static final    int[] VALUES = {1, 5, 10, 50, 100, 500, 1000};

    public int romanToInt(String s) {
       int output = 0; 


      // create an array of students
      Student a[] = new Student[]{new Student(1, "Julie"), new Student(2, "Robert"), new Student(3, "Adam")};
      List<Student> list = Arrays.asList(a);

      System.out.println(Arrays.asList(TYPES));
      System.out.println(Arrays.asList(TYPES).indexOf("Compact"));

      // printing the list
      //System.out.println("The list is:" + list);
      //System.out.println("The index is:" + Arrays.asList(values).indexOf(5));
      String key = "C";
      System.out.println(
            key + " found at index = "
            + Arrays.binarySearch(symbols, key));

    //    System.out.println("before output: " + output);

    //    for (int i = 0;i < s.length(); i++){
    //      System.out.println(s.charAt(i));
    //      int index = Arrays.asList(symbols).indexOf(s.charAt(i));
    //      System.out.println("asList: " + Arrays.asList(symbols));
    //      System.out.println("index: " + index);
    //      //output += values[index];
    //      //System.out.println("output: " + output);

    //    }

       //System.out.println("after output: " + output);
       
       return output;
    }

   class Student {
     int rollNo;
     String name;
   
     Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
     }
   
   @Override
   public String toString() {
      return "[ " + this.rollNo + ", " + this.name + " ]";
   }
  
  }
}
