public  class temperature {
public static void main(String [] args) {
float fahrenheit = 62.5f;
/* Convert */
temperature tem = new temperature();
double celsius = tem.f2c(fahrenheit);
System.out.println(fahrenheit + "F" + " = " + celsius + "C");
}

double f2c(float fahr) {
return (fahr - 32) * 5 / 9;
}

}