package ru.netology.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Film {
    int id;
    private String filmUrl;
    private String filmName;
    private String filmGenre;
    boolean premiereTomorrow;

}
