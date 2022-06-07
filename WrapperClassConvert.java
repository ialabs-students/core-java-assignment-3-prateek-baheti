public class WrapperClassConvert{
    public static Integer convertToWrapper(int object)
    {
        Integer object1=Integer.valueOf(object);
        if(object1 instanceof Integer)
        {
            System.out.println(object1);
        }
        else{
            System.out.println("give proper primitive as input");
        }
        return object1;
    }
    public static void main(String[] args) {
        int object=10;
        convertToWrapper(object);

    }
}