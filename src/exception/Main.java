package exception;


public class Main {
    // Ngoại lệ : lỗi phát sinh làm gián đoạn chương trình
    public static void main(String[] args) throws MyCheckedException{
        // Phân loại ngoài lệ : Checked Exception , UncheckedException

//        throw new RuntimeException("Đây lê ngoại lệ ko kiểm tra được");
//        throw new Exception("Đây lê ngoại lệ  kiểm tra được");
        throw new MyCheckedException("Ngoại lệ checked");
//        throw new MyUncheckedException("Ngoại lệ checked");

        // khối try - catch -finally
//        try{
//            MyGeneric<?> generic = null;
//            generic.getData(); // => lỗi NullPoiterException
//
//        }catch (ArithmeticException e){
//            System.out.println("Lỗi NullPointerException : "+e.getMessage());
//        }finally {
//            System.out.println("Khối finally luôn được thực thi");
//        }
//
//        System.out.println("Tếp tục thực hiện chương trình");
    }
}
