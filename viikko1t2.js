function syt(p, q) {
    console.log(p,q);
    if (q === 0) {return p;}
    else {
        return syt(q, p%q);
    }
  }
var tulos = syt(42,56);
console.log(tulos);
var tulos = syt(54,24);
console.log(tulos);