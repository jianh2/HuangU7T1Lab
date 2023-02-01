import java.util.ArrayList;


public class UsedCarLot {
ArrayList<Car> parkingLot;
    public UsedCarLot() {
        ArrayList<Car> inventory = new ArrayList<>();
        parkingLot = inventory;

    }


    public ArrayList<Car> getInventory(){
        return parkingLot;
    }

    public void addCar(Car newCar) {
        parkingLot.add(newCar);


    }
    public boolean swap(int index1, int index2){
        if ((0 <= index1 && index1 < parkingLot.size()) && (0 <= index2 && index2 < parkingLot.size())) {
            Car firstCar = parkingLot.get(index1);
            parkingLot.set(index1,parkingLot.get(index2));
            parkingLot.set(index2,firstCar);
            return true;
        }else{
            return false;
        }
    }
    /* Adds a Car to the the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1

        PRECONDITION: indexToAdd < inventory.size()
      */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        parkingLot.add(indexToAdd,carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        @return returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element...
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car car = parkingLot.get(indexOfCarToSell);
        parkingLot.remove(indexOfCarToSell);
        return car;
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       @return returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car car = parkingLot.get(indexOfCarToSell);
        parkingLot.set(indexOfCarToSell,null);
        return car;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory list; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in inventory list

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        if (destinationIndex > indexOfCarToMove){
            parkingLot.add(destinationIndex+1,parkingLot.get(indexOfCarToMove));
        }else if(destinationIndex < indexOfCarToMove){
            parkingLot.add(destinationIndex,parkingLot.get(indexOfCarToMove));
        }
    }

}

