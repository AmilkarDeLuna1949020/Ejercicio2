import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();


        int[] materias = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe la calificación: ");
            materias[i] = sc.nextInt();
        }

        int suma = 0;

        double prom = 0.0;



        suma=IntStream.of(materias).sum();

        prom= suma/5;
        char calf;
        System.out.println("======================Calificaciones======================");
        System.out.println("Su promedio es de: "+prom);
        if (prom <= 50)
        {
            calf = 'F';
            System.out.println("Calificacion: "+ calf);
        }
        else if (prom>=51 && prom <= 60)
        {
            calf = 'E';
            System.out.println("Calificacion: "+ calf);
        }
        else if (prom>=61 && prom <= 70)
        {
            calf = 'D';
            System.out.println("Calificacion: "+ calf);
        }
        else if (prom>=71 && prom <= 80)
        {
            calf = 'C';
            System.out.println("Calificacion: "+ calf);
        }
        else if (prom>=81 && prom <= 90)
        {
            calf = 'B';
            System.out.println("Calificacion: "+ calf);
        }
        else if (prom>=91 && prom <= 100)
        {
            calf = 'A';
            System.out.println("Calificacion: "+ calf);
        }


        int n=1;


        System.out.println("Nombre del alumno: "+nombre);

        for (int i=0;i<5;i++)
        {
            System.out.println("Materia "+(i+1)+": "+materias[i]);
        }

        System.out.println("====================================================");






    }
}
