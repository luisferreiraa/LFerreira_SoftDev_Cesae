package ficha_01;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double vencimentoBase = 40, subAlimentacao = 5, diasTrabalho, irs = 0.10, ssFun = 0.11, ssEmp = 0.2375, valorIliquido, totalAlimentacao, pssFun, pssEmp, retIRS, valorLiquido;

        int codFunc;

        System.out.println("Introduza o código de funcionário:");
        codFunc = input.nextInt();
        System.out.println("Introduza o num dias de trabalhados:");
        diasTrabalho = input.nextInt();

        System.out.println("Código de Funcionário: " + codFunc);

        valorIliquido = diasTrabalho*vencimentoBase;
        System.out.println("Vencimento iliquido: " + valorIliquido);

        totalAlimentacao = diasTrabalho*subAlimentacao;
        System.out.println("Total subsídio alimentação: " + totalAlimentacao);

        retIRS = valorIliquido*irs;
        System.out.println("Retenção IRS: " + retIRS);

        pssFun = (valorIliquido*ssFun);
        pssEmp = (valorIliquido*ssEmp);

        System.out.println("Segurança Social: " + (pssFun+pssEmp));

        valorLiquido = valorIliquido-retIRS-pssFun-pssEmp+totalAlimentacao;
        System.out.println("Valor líquido a receber: " + valorLiquido);

    }
}
