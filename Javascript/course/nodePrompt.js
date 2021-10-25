// const prompt = require('prompt');

// prompt.start();

// prompt.get(['username', 'email'], function (err, result) {
//     if (err) { return onErr(err); }
//     console.log('Command-line input received:');
//     console.log('  Username: ' + result.username);
//     console.log('  Email: ' + result.email);
// });

// function onErr(err) {
//     console.log(err);
//     return 1;
// }


// import prompt module
const prompt = require('prompt');

data = []

prompt.start();

prompt.get(['username', 'password'], function (err, result) {
    if (err) {return onErr(err);}
    if (result.password == "admin") {
        console.log("Login Success, Welcome " + result.password) 
    } else {
        console.log("Login Failed, Incorrect Password!")
    }
})