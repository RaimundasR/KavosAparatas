//ANTRA

Bpackage TESTING;

public class Main {
    public static void main(String[] args) {

StringBuilder b = new StringBuilder("A");

b.append("B");
b.append("C");

String str = new String("D");
str.replaceAll("D","F");

b.append(str);
b.append(0);

System.out.println(b.toString()+b+b.indexOf("A"));
    }


    }
	
// septinta

package TESTING;

public class Main {
    public static void main(String[] args) {

a a = new a(5);
a.a(a);
System.out.println(a.a);
System.out.println(++a.clone().a);

    }



    }

class a{
    public static int a;
    public a(){a++;}
    public a (int a){this.a = a;}
    public a a (a a){
        a.a++;
        return a;

    }
    public a clone (){
        a a2  = new a();
        a2.a = a;
        return a2;
    }
}