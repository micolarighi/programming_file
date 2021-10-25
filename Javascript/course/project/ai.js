
let fName = "Micola"; 
let sName = "Arighi";
let lName = "Dwitya";

const data = [fName, sName, lName, 18];
let username = []
let age;

data.forEach(element => {
    if (typeof(element) == "string" ) {
        username.push(element);
    } else {
        age = element;
    }
});

console.log("Hello", username.join(" "));
console.log("Your age is", age)
