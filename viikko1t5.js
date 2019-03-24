/* Käännä lista rekursiivisesti. Syvärakennetta ei tarvitse kääntää. Esimerkiksi lista [0,1,2,3,4,5,6,7,8,9]
on käännettynä [ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0].
Valmiita metodeja kääntämiseen ei saa käyttää. */

function listflip(lista,p,q) {
    console.log("" + lista);
    if (p>q) {return lista;}
    else {
        var temp = lista[p]
        lista[p] = lista[q];
        lista[q] = temp;
        return listflip(lista, p+1, q-1);
    }
}
var tulos = listflip([1,2,3,4,5,6,7], 0, 6);
console.log("Käännetty lista: " + tulos);