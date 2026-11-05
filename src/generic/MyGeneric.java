package generic;

public class MyGeneric<T> { // Lớp generic
    private T data ; // T là kiểu dữ liệu của data

    public MyGeneric(){

    }
    public MyGeneric(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
