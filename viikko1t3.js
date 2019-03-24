/*Keskenään jaottomiksi tai suhteellisiksi alkuluvuiksi tai alkuluvuiksi toistensa suhteen sanotaan
kahta lukua p ja q, jos p:n ja q:n suurin yhteinen tekijä on 1.
Sovella edellisen tehtävän algoritmia ja tee rekursiivinen funktio kjl(p, q),
joka tutkii ovatko kaksi lukua keskenään jaottomia.
Esimerkiksi 35 ja 18 ovat keskenään jaottomia lukuja.*/

function kjl(p, q) {
    console.log(p,q);
    if (p === 1) {console.log("Jaoton"); return true;}
    if (q === 0) {return false;}
    else {
        return kjl(q, p%q);
    }
  }
  var tulos = kjl(54,24);
  console.log(tulos);
  var tulos = kjl(9,4);
  console.log(tulos);
  var tulos = kjl(35,18);
  console.log(tulos);