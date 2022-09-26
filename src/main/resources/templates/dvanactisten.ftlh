[#ftl]
[#--
Přidáním [#ftl] říkáme, že nejde o obyčejný HTML soubor, ale o šablonu Freemarkeru, která bude používat hranaté závorky pro „tagy“ Freemarkeru.
 --]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Hod kostkou</title>

    [#-- Informace pro mobilní telefony, že mají stránku zobrazovat „normálně“, bez nějakého zvětšování a upravování. --]
    <meta name="viewport" content="width=device-width, initial-scale=1">

    [#-- Informace pro prohlížeč, že bude potřeba něco z adresy https://fonts.gstatic.com – prohlížeč se na to může připravit.  --]
    <link rel="preconnect" href="https://fonts.gstatic.com">
    [#-- Vložení písma Roboto z Google Fonts --]
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">

    [#-- Odkazy na styly – normalize.css nastaví výchozí vlastnosti stylů, aby se sjednotilo chování prohlížečů. style.css pak přidává vlastní styly pro jednoduché formátování stránky. --]
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="/css/style.css">
    [#-- Odkaz na „favicon“ – ikona webu, která se zobrazuje někdy u adresního řádku, někdy v oušku záložky/tabu, případně také v oblíbených položkách prohlížeče. --]
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div>
    <div>
        [#-- Do atributu „src“ dosadíme číslo obrázku první kostky „${kostka1}“. --]
        <img class="kostka" src="/images/kostka-${kostka1}.svg"/>

        [#-- Podmínka  druhou kostku budeme zobrazovat jenom tehdy, pokud číslo na ní je větší než 0. --]
        [#if kostka2 > 0]
            [#-- Do atributu „src“ dosadíme číslo obrázku druhé kostky „${kostka2}“. --]
            <img class="kostka" src="/images/kostka-${kostka2}.svg"/>
        [/#if]
    </div>

    [#-- Do textu dosadíme hodnotu atributu „cislo“ z modelu. --]
    <div>Padlo číslo: ${cislo}</div>
</div>
</body>
</html>
