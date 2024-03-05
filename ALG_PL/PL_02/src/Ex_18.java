import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cargo;
        double diasTrabalho, vBase, subAlimentacao, retIRS, segSocialTotal, segSocialFuncionario, segSocialEmpresa, vLiquido;

        System.out.println("1. Empresário, 2. Chefe ou 3. Administração?");
        cargo = input.nextInt();

        switch (cargo) {

            case 1:

                System.out.println("Introduza dias de trabalho: ");
                diasTrabalho = input.nextInt();

                vBase = diasTrabalho * 40;
                System.out.println("Total ilíquido: " + vBase + "€");

                subAlimentacao = diasTrabalho * 5;
                System.out.println("Subsídio de Alimentação: " + subAlimentacao + "€");

                if (vBase > 1000) {
                    retIRS = vBase * 0.20;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                } else {
                    retIRS = vBase * 0.10;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                }

                segSocialFuncionario = (vBase * 0.11);
                segSocialEmpresa = (vBase * 0.2375);
                segSocialTotal = (segSocialFuncionario + segSocialEmpresa);
                System.out.println("Segurança Social: " + segSocialTotal + "€");

                vLiquido = vBase - (retIRS + segSocialFuncionario);
                System.out.println("Valor liquido: " + vLiquido + "€");
                break;

            case 2:

                System.out.println("Introduza dias de trabalho: ");
                diasTrabalho = input.nextInt();

                vBase = diasTrabalho * 60;
                System.out.println("Total ilíquido: " + vBase + "€");

                subAlimentacao = diasTrabalho * 7.50;
                System.out.println("Subsídio de Alimentação: " + subAlimentacao + "€");

                if (vBase > 1000) {
                    retIRS = vBase * 0.20;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                } else {
                    retIRS = vBase * 0.10;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                }

                segSocialFuncionario = (vBase * 0.11);
                segSocialEmpresa = (vBase * 0.2375);
                segSocialTotal = (segSocialFuncionario + segSocialEmpresa);
                System.out.println("Segurança Social: " + segSocialTotal + "€");

                vLiquido = vBase - (retIRS + segSocialFuncionario);
                System.out.println("Valor liquido: " + vLiquido + "€");
                break;

            case 3:

                System.out.println("Introduza dias de trabalho: ");
                diasTrabalho = input.nextInt();

                vBase = diasTrabalho * 80;
                System.out.println("Total ilíquido: " + vBase + "€");

                subAlimentacao = diasTrabalho * 7.50;
                System.out.println("Subsídio de Alimentação: " + subAlimentacao + "€");

                if (vBase > 1000) {
                    retIRS = vBase * 0.20;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                } else {
                    retIRS = vBase * 0.10;
                    System.out.println("Retenção IRS: " + retIRS + "€");
                }

                segSocialFuncionario = (vBase * 0.09);
                segSocialEmpresa = (vBase * 0.21);
                segSocialTotal = (segSocialFuncionario + segSocialEmpresa);
                System.out.println("Segurança Social: " + segSocialTotal + "€");

                vLiquido = vBase - (retIRS + segSocialFuncionario);
                System.out.println("Valor liquido: " + vLiquido + "€");
                break;



        }


    }
}

