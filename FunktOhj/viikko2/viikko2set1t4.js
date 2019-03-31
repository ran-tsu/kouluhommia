/* Oletetaan, että Helsingin kuukausittaiset keskilämpötilat vuodelta 2016 ja 2015 ovat taulukoissa.
 Tuota uusi taulukko, jossa on kahden vuoden kuukausittaiset keskiarvot.
 Siivilöi (filter-metodi) taulukosta positiiviset kuukausikeskiarvot ja laske niistä
 keskilämpötila (reduce-metodi).*/

let v2015 = [-20,-22,-15,-2,10,15,20,20,15,10,10,5];
let v2016 = [-22,-23,-16,-2,11,14,16,17,14,11,11,4];

var isPos = function(x) {
    return x > 0;
};

var pos2015 = v2015.filter(isPos);
var pos2016 = v2016.filter(isPos);
console.log(pos2015 + "\n" + pos2016);
const reducer = (postulos, currentValue) => postulos + currentValue;
var list2 = (posv2015.reduce(reducer)) / posv2015.length;
console.log("" + list2);