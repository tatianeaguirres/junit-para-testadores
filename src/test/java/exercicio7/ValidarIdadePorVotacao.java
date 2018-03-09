package exercicio7;

import org.junit.Test;
import votacao.Votacao;

import static org.junit.Assert.*;

public class ValidarIdadePorVotacao {

    @Test
    public void idadeIgual15Anos_NaoPodeVotar() {
        assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2003));
    }

    @Test
    public void idadeIgual16Anos_VotoFacultativo() {
        assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2002));
    }

    @Test
    public void idadeIgual17Anos_VotoFacultativo() {
        assertEquals("João seu voto e facultativo", Votacao.podeVotar("João", 2001));
    }

    @Test
    public void idadeIgual18Anos_VotoObrigatorio() {
        assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2000));
    }

    @Test
    public void idadeIgual25Anos_VotoObrigatorio() {
        assertEquals("José seu voto e obrigatorio", Votacao.podeVotar("José", 1993));
    }

    @Test
    public void idadeIgual70Anos_VotoObrigatorio() {
        assertEquals("Ana seu voto e obrigatorio", Votacao.podeVotar("Ana", 1948));
    }

    @Test
    public void idadeIgual71Anos_VotoFacultativo() {
        assertEquals("Pedro seu voto e facultativo", Votacao.podeVotar("Pedro", 1947));
    }
}
