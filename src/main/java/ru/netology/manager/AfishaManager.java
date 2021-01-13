package ru.netology.manager;


import lombok.*;
import ru.netology.domain.Film;

@Data

public class AfishaManager {
     Film[] films = new Film[0];
     int filmsToNext = 10;


    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getAll() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
    public Film[] getFilm() {
        Film[] result = new Film[filmsToNext];
        Film[] tmp = getAll();
        System.arraycopy(tmp, 0, result, 0, filmsToNext);
        return result;
    }

}