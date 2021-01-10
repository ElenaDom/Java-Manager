package ru.netology.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Film {
    int id;
    String filmUrl;
    String filmName;
    String filmGenre;
    boolean premiereTomorrow;

}
