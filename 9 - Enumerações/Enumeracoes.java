import java.sql.Date;

public class Enumeracoes {
    /*
     * É um tipo especial que  serve para especificar de forma literal um conjunto de constantes relacionadas
    
        Exemplo: Pedidos têm um ciclo de vida definido: 
        1 - PENDENTE
        2 - PROCESSANDO
        3 - ENVIADO
        4 - ENTREGUE
        5 - CANCELADO
     */
    
    // Melhor colocar me um pacote separado e.g. packages entities.enums;

    public enum OrderStatus {
        PENDING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELED;
    }

    private Integer id; 
    private Date moment; 
    private OrderStatus status;

    // Para converter de String para Enum, usar valueOf
    public static void main(String[] args) {
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
