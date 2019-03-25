/* Häntärekursio:
Edellisessä tehtäväsarjassa toteutit potensiin korotuksen rekursiivisena funktiona.
Jos ratkaisusi ei ollut häntärekursiivinen, niin muuta se sellaiseksi.*/

function potkorHR(p,q) {
    console.log(p,q);
    if (q === 1) {return p;}
    else {
        return p*potkorHR(p, q-1);
    }
}
function potkor(p,q) {
    return potkorHR(p,q)
}
var tulos = potkor(2,4);
console.log(tulos);
var tulos = potkor(5,10);
console.log(tulos);
