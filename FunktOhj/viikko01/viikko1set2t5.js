/*Sulkeuma: Tutki seuraavaa ohjelmaa (repossa v1/02/sulkeuma_teht2_5.js).
Selvitä, mitä siinä tehdään ja miksi se tulostaa sitä, mitä tulostaa.
Muuta foo-funktion koodi sellaiseksi, että se ei mahdollista objektin muuttamista:
toteuta IIFE, joka palauttaa objektiliteraalin,
jossa on kaksi funktiota ja joita voidaan kutsua tyyliin Moduuli.kasvata() ja Moduuli.vahenna(),
kun IIFE:n kutsu on muotoa: var Moduuli = (function(){...})();*/

'use strict';

let f, g;
function foo() {
  let x;
  f = function() { return ++x; };
  g = function() { return --x; };
  x = 1;
  console.log('inside foo, call to f(): ' + f());
}
foo();  
console.log('call to g(): ' + g()); 
console.log('call to f(): ' + f()); 
