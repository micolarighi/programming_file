let username;
const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output : process.stdout
});

rl.question("Please enter your name : ", name => {
    username = name;
    rl.question("Please enter your password : ", password => {
        if (password == "admin") {
            console.log("Login Success, Welcome " + name)
        } else {
            console.log("Login invalid, Password Incorrect!!")
        }
        rl.close();
    })
})

