package codesjava;

/**
 * @author Александр
 */
public class CodesJava {

    public static void main(String[] args) throws Exception{
        
    }
}

// объявляем класс А
class A{
    //поле с именем А типа массив А
    A A[];
    //конструктор принимающий параметр с именем А и типом А
    A(A A){this.A=new A[]{A};}
    //метод с именем А тип возвращаемого значения А, принимает А типа А
    A A(A A){
        //в цикле для всех а типа А в массиве А
        //прерывание циклас по метке А 
        //возвращает то что что и принял
        A:for(A a:this.A){          
                break A;
        }
        return new A(A);
    }
}