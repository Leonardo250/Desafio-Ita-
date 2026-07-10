package leo.javaDasafio.DesafioItau;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@ 
@NoArgsConstructor
public class transacao  {

    private BigDecimal valor;
    private OffsetDateTime dataHora;

}
