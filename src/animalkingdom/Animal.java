package animalkingdom;

abstract class Animal {
    
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearNamed;

   //default constructor
   public Animal(String name, int yearNamed) 
   {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
   }

   //Abstract Methods - children get to define implementation
   abstract String move();
   abstract String breathe();
   abstract String reproduce();

   //Global Methods
   String eatFood()
   {
    return "nom, nom, nom";
   }

   String getName()
   {
       return name;
   }

   int getYearNamed() {
       return yearNamed;
   }

   String getBreathe() {
       return breathe();
   }

   @Override
   public String toString()
   {
       return id + " - " + name + "(" + yearNamed + ")";
   }

}