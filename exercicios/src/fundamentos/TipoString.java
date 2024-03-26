package fundamentos;

public class TipoString {
 public static void main(String[] args) {
	System.out.println("Olá pessoal".charAt(2));
	
	String s = "Boa tarde";
	System.out.println(s.concat(", tudo bem? "));
	System.out.println(s + " , espero que sim.");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));
	
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 1233.4;
	
	System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f."
			, nome, sobrenome, idade, salario);
	
	String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f."
			, nome, sobrenome, idade, salario);
	System.out.println(frase);
	
	System.out.println("Frase qualquer".contains("qual"));
	System.out.println("Frase qualquer".indexOf("qual"));
	System.out.println("Frase qualquer".substring(6));
	System.out.println("Frase qualquer".substring(6,10));

}
}
