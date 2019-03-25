/* Funktio parametrina: Kirjoita funktio,
jolle annetaan parametrina edellisen tehtävän funktion kutsu
(käytännössä funktiolle välitetään anonyymi funktio) ja kaksi taulukkoa,
jossa toisessa on Helsingin kuukausittaiset keskilämpötilat
vuodelta 2015 ja toisessa vuodelta 2016 (voit keksiä lämpötilat itse).
Funktio käyttää parametrina saamaansa funktiota ja palauttaa tiedon siitä,
kuinka monessa tapauksessa vuoden 2016 keskilämpötila oli korkeampi.*/

const anon = function () {
    return function (v2015,v2016) {
        if(i<=v2015.length){
        countertemp = counter;
        if (v2015[i]<v2016[i]) {counter++;}
        i++
        return anon(v2015,v2016);
        }
        else{i = 0; counter = 0; return countertemp;}
    }
}();
var i = 0;
var counter = 0;
var countertemp;
let tulos = anon([0,0,0,0,0,0,0,0,0,0,0,0],[-22,-23,-16,-2,11,14,16,17,14,11,11,4]);
console.log("Vuonna 2016 keskilämpötila oli " + tulos + " eri kuukautena korkeampi kuin vuonna 2015");
tulos = anon([-20,-22,-15,-2,10,15,20,20,15,10,10,5],[-22,-23,-16,-2,11,14,16,17,14,11,11,4]);
console.log("Vuonna 2016 keskilämpötila oli " + tulos + " eri kuukautena korkeampi kuin vuonna 2015");