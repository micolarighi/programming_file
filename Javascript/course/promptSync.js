const prompt = require('prompt-sync')();

let data = []

const name = prompt("What is your name : ")
const password = prompt("Enter your password : ")
data.push(name)
data.push(password)

for(i in data) {
    console.log(data[i])
}