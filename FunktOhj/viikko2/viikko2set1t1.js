// Kirjoita uudestaan käyttäen nuolifunktioita (arrow functions).

var toCelsius = fahrenheit => {
  return (5/9) * (fahrenheit-32);
}
let temp = 60
console.log("Lämpötila fahrenheitista celsiukseen: " + toCelsius(temp));

var area = radius => Math.PI * radius * radius;
let test = 123
console.log("Radius: " + area(test));