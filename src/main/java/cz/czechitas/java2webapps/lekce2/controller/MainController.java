package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Jediný kontroler aplikace. Obsahuje metodu, která je volána v okamžiku, kdy webový prohlížeč požaduje ze serveru stránku na adrese {@code /}.
 *
 * @author Filip Jirsák
 */
@Controller
public class MainController {
  /**
   * Budeme potřebovat generovat náhodná čísla. Vytvoříme si tedy instanci generátoru náhodných čísel pro pozdější použití.
   */
  private final Random random = new Random();

  /**
   * Metoda kontroleru. Na pojmenování nezáleží, důležitá je anotace {@link GetMapping}, která říká, že se má metoda volat v okamžiku, kdy prohlížeč požaduje
   * získat (stáhnout, zobrazit – {@code get}) stránku na adrese {@code /}.
   *
   * @return Vrací objekt sdružující model a informaci o tom, které view (šablona) se má použít.
   */
  @GetMapping("/")
  public ModelAndView kostka() {
    //Dej mi „další“ náhodné celé číslo, v rozsahu 0 (včetně) až 6 (mimo), tedy 0–5. Po přičtení jedničky dostávám klasický rozsah hrací kostky 1–6.
    int nahodneCislo = random.nextInt(6) + 1;

    //Vytvořím objekt sdružující model a informace o použitém view. Jako view použiju „kostka“ – požije se tedy šablona „kostka.ftlh“ přímo z adresáře
    //„src/main/resources/templates.
    ModelAndView result = new ModelAndView("kostka");

    //Do modelu přidám atribut „cislo“ a jako hodnotu do něj vložím získané náhodné číslo.
    result.addObject("cislo", nahodneCislo);
    //Do modelu přidám také atribut „obrazek“, jako hodnotu bude mít celou cestu s obrázkem čísla na hrací kostce. Obrázky jsou uložené jako statické soubory
    //ve složce „src/main/resources/static/images“.
    //Funkce „String.format()“ je standardní funkce v Javě, umožňuje do textu pomocí značek začínajícíh procentem vkládat další hodnoty. V tomto případě se
    //Místo „%d“ vloží nahodneCislo jako celé číslo v desítkové soustavě.
    result.addObject("obrazek", String.format("/images/kostka-%d.svg", nahodneCislo));

    //Vytvořený objekt vrátím jako návratovou hodnotu metody. Spring tento objekt vezme, použije zadané view jako Thymeleaf šablonu a předá jí údaje zadané přes
    //addObject() jako model.
    return result;
  }
  /**
   * Hod dvanáctistěnem. Protože nemáme pro dvanáctistěn obrázky, budeme hod zobrazovat na jedné nebo dvou kostkách. Když bude hozeno více než 6, zobrazí se druhá kostka.
   */

  @GetMapping("/dvanactisten")
  public ModelAndView dvanactisten() {
    int nahodneCislo = random.nextInt(12) + 1;

    ModelAndView result = new ModelAndView("dvanactisten");

    result.addObject("cislo", nahodneCislo);
    result.addObject("kostka1", nahodneCislo <= 6 ? nahodneCislo : 6);
    result.addObject("kostka2", nahodneCislo - 6);
    return result;
  }
}
