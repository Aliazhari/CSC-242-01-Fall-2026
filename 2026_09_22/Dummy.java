public interface Dummy {

    public void printDummy();
    default public void printSmarty(){
        System.out.println("Not printing anything");
    }
    
}
