package Exercises.Aggregation3.java;

public class Admin {
    public void assignRoom(Room[] rooms, Member member ){
        for (Room r: rooms) {
			//check if there is space
			if (r.getCapacity() > 0) {
				//if there is space assign the room and update capacity
				member.setRoom(r);
				r.setCapacity(r.getCapacity() - 1);
				return;
			}
		}
    }
}
