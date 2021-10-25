const button = document.getElementById('btn')
const input = document.getElementById('input')

const database = {
    1 : [
        "haqua", "chitoge", "jose"
    ],
    2 : [

    ],
}

button.onclick = function () {
    let i = 1;
    console.log(database[1][0]);
}

