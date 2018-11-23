
package cidade;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cidade {

   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        p1.nome = "Maria";
        p1.idade = 32;
        p1.altura = 1.60;
        p1.sexo = 'F';
        System.out.println("Os dados da pessoa 1 fora:"
                +"\n Nome:"+p1.nome+
                "\n Idade:"+p1.idade+
                "\n altura:"+p1.altura+
                "\n sexo:"+p1.sexo);
        
        
      // entrada de dados com JOptionPane
        
        p3.nome = JOptionPane.showInputDialog(null,
                "Digite seu nome",
                "Informações",
                JOptionPane.DEFAULT_OPTION);  
        String dataTemp = JOptionPane.showInputDialog(null,
                "Digite sua idade",
                "Informações",
        JOptionPane.DEFAULT_OPTION);
        
        p3.idade = Byte.parseByte(dataTemp);
        dataTemp = JOptionPane.showInputDialog(null,
                "Digite sua Altura",
                "Informações",
                JOptionPane.DEFAULT_OPTION);
        p3.altura = Double.parseDouble(dataTemp);
        dataTemp = JOptionPane.showInputDialog(null,
                "Digite seu sexo",
                "Informações",
                JOptionPane.DEFAULT_OPTION);
        p3.sexo = dataTemp.charAt(0);
        
       
                
        JOptionPane.showMessageDialog(null,
                "Os dados da pessoa 3 foram"+
                "\n Nome:"+p3.nome+
                "\n Idade:"+p3.idade+
                "\n altura:"+p3.altura+
                "\n sexo:"+p3.sexo,  
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
       
        
        
        
        
        
        
        //entrada de dados com scanner
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        p2.nome = ler.nextLine();
        System.out.println("Informe sua idade");
        p2.idade = ler.nextByte();
        System.out.println("Informe sua Altura");
        p2.altura = ler.nextDouble();
        System.out.println("Informe seu sexo");
        p2.sexo = ler.next().charAt(0);
        
        System.out.println("Os dados da pessoa 1 fora:"
                + "\n Nome:"+p1.nome+
                "\n Idade:"+p1.idade+
                "\n altura:"+p1.altura+
                "\n sexo:"+p1.sexo);

        
       
        
    }
    
}
