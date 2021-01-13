package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private AfishaManager afishaManager = new AfishaManager();
    private Film first = new Film(1, "Toy Story", "ts", "Animation", false);
    private Film second = new Film(2, "Ice Age", "ia", "Animation", false);
    private Film third = new Film(3, "Inception", "i", "Science fiction", false);

    void setUp() {
        afishaManager.addFilm(first);
        afishaManager.addFilm(second);
        afishaManager.addFilm(third);
    }

    @Test
    void shouldGetEmpty() {
        Film[] expected = new Film[0];
        Film[] actual = afishaManager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetOne() {
        afishaManager.addFilm(first);
        Film[] expected = new Film[]{first};
        Film[] actual = afishaManager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {
        setUp();
        Film[] expected = new Film[]{third, second, first};
        Film[] actual = afishaManager.getAll();
        assertArrayEquals(expected, actual);
    }

}



