package lection1;
// пример того как соеденить две строки
public class task15 {
    public static void main(String[] args) {
        String s = "qwer";
        int a = 123;
        String q = s+a;// конкатинация строк (4 строки в памяти преобразуються)
        System.out.println(q);

        int f = 1, b = 2;
        int c = f + b;
        String res = f + "+" + b + "=" + c;// этим способом пользуемся если надо вывести в терминал знаки .
        System.out.println(res); 

        int g = 4, t = 7;
        int n = g+t;
        String res2 = String.format("%d + %d =%d \n", g, t, n);// этим способом пользуемся если надо вывести в терминал знаки .
        System.out.printf("%d + %d =%d \n", g, t, n);
        System.out.println(res2); 
        // списобы вывода после запятой
        float pi = 3.1415f;
        System.out.printf("%f\n",pi);
        System.out.printf("%.2f\n",pi);
        System.out.printf("%.3f",pi);
        System.out.printf("%e\n",pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);

    }
}

// %d: Вывод целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода с плавающей точкой 
// %e: для вывода чисел в экспоненциальной форме
// %c: для вывода одиночного символа
// %s: для вывода строчного значения
// 
// 
// 
// 
