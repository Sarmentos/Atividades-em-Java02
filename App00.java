public class App00 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAltorizadoParaFaculdade = idade >= 18;
        // !
        if(isAltorizadoParaFaculdade != false){
            System.out.println("Altorizado a ir para faculdade");
        }
        else{
            System.out.println("Não está altorizado a ir para faculdade");
        }
        if (!isAltorizadoParaFaculdade) {
            System.out.println("Não está altorizado a ir para faculdade");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo nunca deve ser falso");
            
        }
    }
}
