const prompt = require('prompt');

data = []

prompt.start();

prompt.get(['username', 'password'], function (err, result) {
    if (err) {return onErr(err)}
    data.push(result.username)
    data.push(result.password)
})

data.forEach(element => {
    console.log(element);
});