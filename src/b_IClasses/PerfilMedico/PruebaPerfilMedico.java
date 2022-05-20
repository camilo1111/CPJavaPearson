package b_IClasses.PerfilMedico;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        PerfilMedico usuario = new PerfilMedico("CAMILO","DIAZ",17,2,1997,172,82);
        System.out.println("PERFIL MEDICO DE " + usuario.getNombre()+" "+usuario.getApellido());
        System.out.println();
        System.out.printf("FECHA DE NACIMIENTO : %d/%d/%d",usuario.getDiaNacimiento(),usuario.getMesNacimiento(),usuario.getAñoNacimiento());
        System.out.printf("\nESTATURA : %d cm",usuario.getEstatura());
        System.out.printf("\nPESO : %.2f Kg",usuario.getPeso());
        System.out.printf("\nEDAD : %d años",usuario.getEdad());
        System.out.printf("\nFRECUENCIA CARDIACA MAXIMA : %d ",usuario.getFrecuenciaCardiacaMax());
        System.out.printf("\nFRECUENCIA CARDIACA ESPERADA MAXIMA : %.2f ",usuario.getFrecuenciaCardiacaEsperadaMax());
        System.out.printf("\nFRECUENCIA CARDIACA ESPERADA MINIMA : %.2f ",usuario.getFrecuenciaCardiacaEsperadaMin());
        System.out.printf("\nVALOR BMI : %.2f ",usuario.getBmi());
        System.out.printf("\n%s ",usuario.valoresBMI());


    }
}
