/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author  Raghad Al-Zaharani  
 */
public class Workouts implements Editor{
    
    private Trainer trainerObj;
    private int classDuration;
    private String className;
    private ArrayList<Long> listPeople;
    
    
     /**
      * default constructor  
      */
    public Workouts() {
    }
    
    
    /**
     * constructor and initailzes two attribute
     * @param class_duration
     * @param class_name 
     */
    public Workouts(int class_duration, String class_name) {
        classDuration = class_duration;
        className = class_name;
    }
    
    
    /**
     * constructor and initailzes three attribute
     * @param trainer
     * @param class_duration
     * @param class_name 
     */
    public Workouts(Trainer trainer, int class_duration, String class_name) {
        trainerObj = trainer;
        classDuration = class_duration;
        className = class_name;
    }
    
    
   /**
    * getter method for classDuration 
    * @return int
    */ 
    public int getClassDuration() {
        return classDuration;
    }
    
    
    /**
     * setter method for classDuration
     * @param class_duration 
     */
    public void setClassDuration(int class_duration) {
        classDuration = class_duration;
    }
    
    /**
     * getter method for className
     * @return String
     */
    public String getClassName() {  
        return className;
    }
    
    /**
     * sette method for className
     * @param class_name 
     */
    public void setClassName(String class_name) {
        className = class_name;
    }
    
    /**
     * getter method for trianerObj
     * @return Object  
     */
    public Trainer getTrainerObj() {
        return trainerObj;
    }
    
    /**
     * setter method for trainerObj
     * @param trainer 
     */
    public void setTrainerObj(Trainer trainer) {
        trainerObj = trainer;
    }
    
    /**
     * override for method toString
     * to repersent useful information about trainerObj , classDuration and classNamw
     * @return String 
     */
    @Override
    public String toString() { 
        return "Workouts{" + "trainerObj= " + trainerObj + "\n classDuration= " + classDuration + "\n className= " + className ;
    }
    
    /**
     * version 1.0
     * @param obj
     * @return boolean
    */
    public boolean equals( Workouts obj ){
        if (this.className==obj.className)
         return true;
        else 
      return false;
}
    
 /**
  * version 1.0
  * method addPeople to add trainee in ArrayList (listPeople)
  * @param index
  * @param objName 
  *
   
  /**
   * version 1.0
   * method clone to copy the object 
   * @return Object
   */ 
    public Object clone(){
        Workouts objClone = new Workouts (classDuration,className);
        return objClone;
    }

    @Override
    public void add( Long objId) {
         listPeople.add(objId);
    }
/**
 * @param obj
 */
    @Override
    public void delete(Long obj) {
        listPeople.remove(obj);
    }
   
/**
 * @return ArrayList
 */
    @Override
    public ArrayList<Long> getList() {
     return listPeople ; 
    }

    /**
     * @param obj
     * @return int
     */
    @Override
    public int search(Long obj) {
        return listPeople.indexOf(obj);
    }
 
}