class RideSharingSystem {
    Queue<Integer> Driver;
    Queue<Integer> Rider;
    public RideSharingSystem() {
        Driver = new LinkedList<>();
        Rider = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        Rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        Driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(Driver.isEmpty() || Rider.isEmpty()){
            return new int[]{-1,-1};
        }
        else return new int[]{Driver.poll(), Rider.poll()};
    }
    
    public void cancelRider(int riderId) {
        Rider.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */