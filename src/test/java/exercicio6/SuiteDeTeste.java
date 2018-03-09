package exercicio6;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVedadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MeuPrimeiroTeste.class,
        ValidacaoVedadeiroFalso.class,
        ValidacaoIgualdade.class,
        PreEPosCondicoesDeTeste.class,
        PreEPosCondicoesDaClasse.class,
})
public class SuiteDeTeste {
}
