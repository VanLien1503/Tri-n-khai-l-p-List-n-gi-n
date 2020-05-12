import java.util.Arrays;

public class MyList<I extends Number> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private  Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    // cai dat phuong thuc ansureCape() tang kick thuoc cua mang chua phan tu
    private void ensureCapa(){
        int newSize =elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    // cai dat phuowng thuoc add();
    /* them phan tu vao cuoi danh sach

     */
    public void add(Object e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    /*
    cai dat phuong thức get()
    trả về phần tử ở vị trí i trong danh sách
     */

    public Object get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (Object) elements[i];
    }
}
