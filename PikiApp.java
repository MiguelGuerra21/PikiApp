import java.util.Random;
/**
 * Write a description of class PikiApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PikiApp
{
    private String[] frases;

    /**
     * Constructor for objects of class PikiApp
     */
    public PikiApp(){
        frases = new String[20];
        frases[0] = "Quiero ser una hormiguita y trepar por tu balcón para decirte al oído: guapo, bonito y bombón";
        frases[1] = "Creo que dios te iba a crear ciego, porque te dio unas manos demasiado sabias...";
        frases[2] = "Tu cara me mola, tú acento es chulísimo, en dos palabras: estás buenísimo.";
        frases[3] = "¿ Tienes diabetes ?...¡Porque tienes unos ojos tan dulces!";
        frases[4] = "Los zapatos me aprietan, la media me da calor y tu me tienes loca de amor";
        frases[5] = "Si las matemáticas son exactas y Pitágoras no miente, tú eres el chico más guapo de todo el continente";
        frases[6] = "Me cago en fagor";
        frases[7] = "Caminando por la calle, caminando te encontré, y al verte tan serio y guapo, de ti me enamoré";
        frases[8] = "De arriba a abajo estás muy majo de cuerpo entero estás de miedo. Pero, ¿para qué tanto rodeo… para decirte que te quiero…?";
        frases[9] = "Si me preguntan por mi dulce favorito, me quedo contigo sin dudarlo, bomboncito!";
        frases[10] = "Si el amor alimenta el corazón el tuyo se pondrá gordito porque pienso darle todito hasta que se ponga panzón";
        frases[11] = "Me gustaría ser tu pijama para acostarme contigo";
        frases[12] = "¿Cual es tu nombre? !Para pedirte a los Reyes Magos!.";
        frases[13] = "Se te cayó un papel...el que te envuelve bombón.";
        frases[14] = "Cuando mires una estrella acuerdate de mi porq en cada una de ellas hay un beso para ti.";
        frases[15] = "Muchas son las estrellas que a diario veo en el cielo, pero a mis ojos no hay estrella más bonita que tú.";
        frases[16] = "A tu lado he pasado algunos de los mejores momentos que he vivido, por eso te digo que te quiero y que si quieres salir conmigo.";
        frases[17] = "En esta vida todo me parece que va demasiado deprisa. Pero todo se detiene cuando estoy contigo y disfruto tu sonrisa.";
        frases[18] = "Tierno y necesario como el pan, suave y elegante como la seda y dulce como la miel, son tu cuerpo, tu pelo y tu piel.";
        frases[19] = "Si fuera una mariposa iría de flor en flor, hasta la ventana de tu cuarto a decirte “hola, mi amor”.";
    }

    public void mostrarFrase(){
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(frases.length);
        System.out.println(frases[numeroAleatorio]);
    }
}
