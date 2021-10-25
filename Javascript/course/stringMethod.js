const myName = "Micola Arighi";
const whiteSpace = "        Hello  "
let str1 = "Coding"
let str2 = "Enthusiast"

let myPhone = "0896-9339-4431"

// panjang dari string
console.log(myName.length);
// liat karakter di index n
console.log(myName.charAt(7));
// liat index dari karakter n 
console.log(myName.indexOf("i"));
// liat index terakhir dari karakter n
console.log(myName.lastIndexOf("i"));
// menghapus white space dari sebuah string
console.log(whiteSpace.trim());
// bikin string menjadi all uppercase
console.log(myName.toUpperCase());
// bikin string jadi all lowercase
console.log(myName.toLowerCase());

let firstName = myName.slice(0, 6)
console.log(firstName);
// or
let firstName2 = myName.slice(0, myName.indexOf(" "))
console.log(firstName2);

// string concat
fullStr = str1.concat(" ", str2)
console.log(fullStr);

// replace a char
console.log(myPhone.replaceAll("-",""));

 
