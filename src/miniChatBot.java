import java.util.Scanner;

public class miniChatBot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MiniChatbot: Olá! Digite 'sair' para encerrar a conversa.");

        while (true) {

            String mensagem = sc.nextLine().toLowerCase();

            if (mensagem.contains("sair")) {
                System.out.println("MiniChatbot: Até logo! Foi bom conversar com você.");
                break;
            } else if (mensagem.contains("hi") || mensagem.contains("hola")) {
                System.out.println("MiniChatbot: hi! Como posso ajudar você?");
            } else if (mensagem.contains("whats your name")) {
                System.out.println("MiniChatbot: Meu nome é MiniChatbot.");
            } else if (mensagem.contains("how are you")) {
                System.out.println("MiniChatbot: Estou só a crema!");
            } else {
                System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta.");
            }
        }

        sc.close();
    }
}