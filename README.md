# Lekce 2 – hod kostkou

Cílem je vytvořit webovou stránku, která simuluje hod kostkou. Zdrojový kód obsahuje webovou stránku, která vždy zobrazí, že bylo hozeno číslo 1. Je potřeba
tuto stránku předělat na dynamickou stránku, která při každém zobrazení zobrazí náhodné číslo od 1 do 6 a odpovídající obrázek. Obrázky jsou připravené ve
zdrojích v adresáři `static/images`. 

1. Udělej fork zdrojového repository do svého účtu na GitHubu.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Vytvoř kontrolér – třídu `cz.czechitas.java2webapps.lekce2.controller.MainController`.
1. V kontroléru bude jedna metoda, která bude vracet `ModelAndView`. Jako view bude použito `kostka`. Metoda bude navázána na cestu `/`.
1. V této metodě se získá pomocí `Random.nextInt(6) + 1` náhodné číslo od 1 do 6.
1. Náhodné číslo vlož do modelu pod názvem `cislo`.
1. Pod nazvem `obrazek` vložíme do modelu cestu k obrázku ve tvaru `/images/kostka-X.svg`.
1. Zkontroluj výsledek v prohlížeči – při každém načtení stránky by se mělo zobrazit náhodné číslo mezi 1 a 6 a příslušný obrázek kostky.

## Mohlo by se hodit
* odkaz na stránku [Lekce 2](https://java.czechitas.cz/2022-podzim/java-2-online/lekce-2.html)
