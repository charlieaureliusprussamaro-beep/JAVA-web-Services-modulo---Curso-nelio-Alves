package program.program;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAYED(2),
    SHIPPED(3),
    DELIEVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }
    public Integer getCode(){
        return code;
    }
    public static OrderStatus valueOf(int code){
        for(OrderStatus status : OrderStatus.values()){
            if(status.getCode() == code){
                return status;
            }
        }
        throw new IllegalArgumentException();
    }
}
