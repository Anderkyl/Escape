public class Main {

    public static void main(String[] args) {

        Room room = new Room();

        int choice = room.switchStation();

        while(!room.escape){
            if(choice == 1){
                choice = room.bed();
            }else if(choice == 2){
                choice = room.dresser();
            }else if(choice == 3){
                choice = room.bookcase();
            }else{
                choice = room.door();
            }
        }



    }
}
