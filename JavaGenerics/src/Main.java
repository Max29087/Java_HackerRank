public class Main {
    public static class Printer{
        public <X> void printArray (X[] arry){
          for (X element : arry){
              System.out.println(element);
          }
        }
    }

    public static void main(String[] args) {
        Integer[] Int_array={1,2,3};
        String[]String_array={"Hello","World"};
        Printer printer=new Printer();
        printer.printArray(Int_array);
        printer.printArray(String_array);
    }
}
