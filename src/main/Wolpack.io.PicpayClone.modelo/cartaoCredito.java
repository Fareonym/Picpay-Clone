package Wolpack.io.PicpayClone;

public class cartaoCredito extends entidadeBase {

    @column(name =  "CC_NUMERO", nullable = false)
    private bandeiraCartao bandeira;

    @column(name =  "CC_TOKEN")
    private String numeroToken;

    @ManyToOne(cascade = { CascadeType.MERGE})
    @JoinColumn(name = "CC_USUARIO_ID" nullable = false)
    private usuario;
}