package animalkingdom;

abstract class Animal {
    
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

   //default constructor
   public Animal(String name, int yearDiscovered) 
   {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
   }


}