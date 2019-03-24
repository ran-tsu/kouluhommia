function onPalindromi(merkkijono) {
    console.log(merkkijono);
    if (merkkijono.length === 1 || merkkijono.length === 0) {return true;}
    else if (merkkijono.charAt(0) !== merkkijono.charAt(merkkijono.length-1)) {return false;}
    return onPalindromi(merkkijono.slice(1, -1) );
}
var tulos = onPalindromi("asdfa");
console.log(tulos);
var tulos = onPalindromi("saippuakivikauppias");
console.log(tulos);