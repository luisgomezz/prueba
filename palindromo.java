public class palindromo {

public boolean espalindromo(String cad){
    boolean val=true;
    int i,ind;    
    String cad2="";
    
    for (int x=0; x < cad.length(); x++) {
        if (cad.charAt(x) != ' ')
            cad2 += cad.charAt(x);
    }
    
    cad=cad2;    
    ind=cad.length();
    
    for (i= 0 ;i < (cad.length()); i++){        
       if (cad.substring(i, i+1).equals(cad.substring(ind - 1, ind)) == false ) {
        
            valor=false;
            break;
       }
       ind--;
    }
    return val;
}
}


public class Main {
    
    public static void main(String[] args) {              
        palindromo pali=new palindromo();
        if(pali.espalindromo("La ruta es otra")){
            System.out.println("La palabra es palindromo");
        }
        else
        {
            System.out.println("La palabra no es palindromo");
        }
    }    
}
