package ImpressaoService;

import TempoService.TempoOrdem;

import java.util.List;

public class ImprimeTempo {

    private List<TempoOrdem> tempos;

    public ImprimeTempo(List<TempoOrdem> tempos) {
        this.tempos = tempos;
    }

    public void fazerBuscas(Integer[] lista){
        this.tempos.forEach(a->a.tempoOrdem(lista));
    }
}
