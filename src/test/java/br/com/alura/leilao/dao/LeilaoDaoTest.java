package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LeilaoDaoTest {

    @Test
    public void Hello() {
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);
        List<Leilao> todos = mock.buscarTodos();
        Assert.assertTrue(todos.isEmpty());
    }
}
