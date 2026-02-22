# README.md

## Stíny Akademie

Stíny Akademie je textová adventura zasazená do opuštěné magické akademie. Hráč se ujímá role učně magie, který byl vyslán Radou mágů, aby odhalil příčinu dávné katastrofy a nalezl ztracený artefakt – Jádro rovnováhy. Během hry hráč prozkoumává jednotlivé místnosti akademie, komunikuje s postavami, sbírá předměty a řeší překážky, které mu brání v postupu.

Cílem hry je získat Jádro rovnováhy, dopravit ho do Síně rituálů a správně jej použít.



## Ovládání hry

Hra se ovládá pomocí textových příkazů zadávaných do konzole.
Každý příkaz má tvar:

```
prikaz cil
```

Například:

```
jdi knihovna
vezmi klic
pouzij lektvar
```

### Příkazy

* `jdi <mistnost>` – přesun do jiné místnosti
* `pomoc` – zobrazí seznam dostupných příkazů
* `napoveda` – zobrazí herní nápovědu podle situace
* `konec` – ukončí hru
* `vezmi <predmet>` – sebere předmět do inventáře
* `poloz <predmet>` – položí předmět v aktuální místnosti
* `pouzij <predmet>` – použije předmět
* `mluv <postava>` – zahájí dialog s postavou
* `prozkoumej` – prozkoumá aktuální místnost
* `inventar` – zobrazí obsah batohu



## Základní herní mechaniky

* Pohyb mezi propojenými místnostmi akademie
* Inventář s omezenou kapacitou
* Sbírání a používání předmětů
* Odemykání zamčených prostor
* Dialogy s herními postavami

Hráč musí prozkoumávat prostředí, získávat důležité předměty (klíče, svitky, lektvary) a správně je používat, aby se dostal až k finální místnosti hry.



## Jak hru spustit

1. Otevřete projekt v prostředí podporujícím Java (např. IntelliJ IDEA nebo Eclipse).
2. Spusťte hlavní třídu projektu obsahující metodu main.
3. Hra se spustí v konzoli, kde můžete začít zadávat příkazy.



## Podmínky vítězství

Hráč vyhraje, pokud:

* získá Jádro rovnováhy,
* vstoupí do Síně rituálů,
* použije příkaz:

```
pouzij jadro
```

Po úspěšném dokončení se zobrazí vítězná zpráva a hra skončí.
