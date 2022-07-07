public class Car {
    private int id;
    public Car(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;//рефлективность x.equals(x) = true
        if(obj==null||getClass()!=obj.getClass()) return false;
        Car car=(Car) obj;
        if(id!=car.id) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result=127;
        result=11*result;
        result= (int) Math.pow(result,id);
        return result;
    }
}
