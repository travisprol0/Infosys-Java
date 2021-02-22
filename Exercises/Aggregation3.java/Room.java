package Exercises.Aggregation3.java;

public class Room {
    private int roomNo;
    private int capacity;
    private static int roomCounter;

    static {
        roomCounter = 500;
    }

    public Room(){
        this.roomNo = Room.roomCounter;
        Room.roomCounter++;
        this.capacity = 4;
    }

    public int getRoomNo(){
        return roomNo;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public static int getRoomCounter(){
        return Room.roomCounter;
    }

    public static void setRoomCounter(int roomCounter){
        Room.roomCounter = roomCounter;
    }

    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    
}
