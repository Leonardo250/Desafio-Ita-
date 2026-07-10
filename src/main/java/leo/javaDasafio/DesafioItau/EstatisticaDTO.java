package leo.javaDasafio.DesafioItau;

import lombok.Getter;

@Getter
public class EstatisticaDTO {

    private final long count;
    private final double avg;
    private final double max;
    private final double mim;
    private final double sum;

    public EstatisticaDTO(long count, double avg, double max, double mim, double sum) {
        this.count = count;
        this.avg = avg;
        this.max = max;
        this.mim = mim;
        this.sum = sum;
    }
}
