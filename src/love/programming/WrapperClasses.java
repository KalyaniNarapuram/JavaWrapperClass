package love.programming;

public class WrapperClasses {
    public static void main(String[] args) {

        //INTEGER
        Integer myInteger = 10;//auto boxing example
        System.out.println(myInteger);

        Integer myObjectInteger = new Integer(10);//normal object creation
        System.out.println(myObjectInteger);

        int a = myObjectInteger;// unboxing example
        System.out.println(a);

        //BOOLEAN
        Boolean myBoolean = true;//auto boxing
        System.out.println(myBoolean);

        Boolean myObjectBoolean = new Boolean(false);//normal object
        System.out.println(myObjectBoolean);

        myBoolean = myObjectBoolean;//unboxing
        System.out.println(myBoolean);

        Boolean myAnotherObject = false;//normal object

        myObjectBoolean.equals(myAnotherObject);// comparing two booleans

        //BYTE
       /* Byte myvalue = 20;//auto boxing example
        System.out.println(myInteger);

        byte b = myvalue;// unboxing example
        System.out.println(a);

        Byte myvalue1 = new Byte(20);
        System.out.println(myvalue1);*/

       //LONG
       long myObj = 10;
        System.out.println(myObj);

       Long myObj1 = new Long(10);
        System.out.println(myObj1);

       //myObj1.hashCode(myObj1);
        //System.out.println(myObj1);

       Long c = myObj;
        System.out.println(myObj);

        //DOUBLE
        double decimal = 22.5;
        System.out.println(decimal);

        Double decimalObj = new Double(22.5);
        System.out.println(decimalObj);

        decimalObj.floatValue();
        System.out.println(decimalObj);

        Double d = decimal;
        System.out.println(d);

        /*CHAR
        char ch = 'C';
        System.out.println(ch);

        Char chObj = new Char(C);
        System.out.println(chObj);

        Char h = ch;
        System.out.println(h);*/


        /*SHORT
        short sh = 45
        System.out.println(sh);

        Short shObj = new Short(45);
        System.out.println(shObj);

        Short sh1 = sh;
        System.out.println(sh);*/













    }

}
