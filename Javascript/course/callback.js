let message;
function displayToConsole (output) {
    console.log(output);
}

function displayToConsoleWithAdditional (output) {
    console.log("your message is " + output)
}

function setMessage(text, callback) {
    message = text
    callback(message);
}

setMessage("Hello World", displayToConsoleWithAdditional)