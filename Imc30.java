	/**
	 * @autor: Gabriel Weslley S. Do Nascimento
	 * @versao: 3.0
	 * @criacão: 09/07/2018 
	 */
import javax.swing.JOptionPane;
public class Imc30 
{
	public static void main(String[] args) 		//Abaixo de 17	Muito abaixo do peso
	{											//Entre 17 e 18,49	Abaixo do peso
												//Entre 18,5 e 24,99	Peso normal
		//variaveis								//Entre 25 e 29,99	Acima do peso
		double peso, altura, imc;				//Entre 30 e 34,99	Obesidade 
		                                        //Entre 35 e 39,99	Obesidade II (severa)
		//recendo peso e altura		         	//Acima de 40	Obesidade III (mórbida)

		peso = Double.parseDouble(JOptionPane.showInputDialog("digite seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("digite seu altura"));
		// inicio dos calculos
		imc= peso / (altura * altura);
		//mostrando o resultado do IMC na tela
		JOptionPane.showMessageDialog(null, " seu IMC e de  : " +imc);
		//calculo situacoes tabela imc
		if (imc < 17)
		{
			JOptionPane.showMessageDialog(null, "voce esta muito abaixo do peso");
		}
		else if (imc>=17 && imc<=18.49)
		{
			JOptionPane.showMessageDialog(null, "voce esta abaixo do peso");
		}
		else if (imc>=18.5 && imc<=24.99 )
		{
			JOptionPane.showMessageDialog(null, "voce esta com peso normal");
		}else if (imc>=25 && imc<=29.99)
		{
			JOptionPane.showMessageDialog(null, "voce esta acima do peso");
		}else if (imc>=30 && imc<=34.99)
		{
			JOptionPane.showMessageDialog(null, "voce esta com obesidade I");
		}
		else if (imc>=35 && imc<=39.99)
		{
			JOptionPane.showMessageDialog(null, "voce esta com obesidade II");
		} else {
			JOptionPane.showMessageDialog(null,"voce esta com obesidade morbida");
		}
	}	
}
