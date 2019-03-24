// Kirjoita potenssiin korotus rekursiivisena funktiona.

function potkor(p,q) {
    console.log(p,q);
    if (q === 1) {return p;}
    else {
        return p*potkor(p, q-1);
    }
}
var tulos = potkor(2,4);
console.log(tulos);
var tulos = potkor(5,10);
console.log(tulos);