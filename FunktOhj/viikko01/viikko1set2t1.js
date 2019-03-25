/* Anonyymi funktio paluuarvona:
Kirjoita funktio, joka palauttaa arvonaan anonyymin funktion,
jolla voidaan verrata kahta lukua keskenään. 

Paluuarvo 1: ensimmäinen on suurempi

Paluuarvo -1: toinen on suurempi

Paluuarvo 0: luvut ovat yhtä suuria.*/

const anon = function () {
    return function (p,q) {
        if (p>q) {return 1;}
        else if (p<q) {return -1;}
        else {return 0;}
    }
}();
let tulos = anon(1,5);
console.log("Paluuarvo: " + tulos);
tulos = anon(20,6);
console.log("Paluuarvo: " + tulos);
tulos = anon(15,15);
console.log("Paluuarvo: " + tulos);
