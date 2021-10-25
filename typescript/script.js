var data = [];
var gacha = ["suka loli", "wibu", "ganteng", "pinter", "bau", "gay", "anak baik"];
var input = document.getElementById('inputName');
var addButton = document.getElementById('addBtn');
var randomizeButton = document.getElementById('randomizeBtn');
var resultContainer = document.querySelector('.resultContainer');
function add() {
    data.push(input.value);
    input.value = '';
    console.log(data);
}
function randomize() {
    data.forEach(function (d) {
        var rand = Math.floor(Math.random() * gacha.length);
        var res = document.createElement("h6");
        var node = document.createTextNode(" " + d + " " + gacha[rand] + " ");
        res.appendChild(node);
        resultContainer.appendChild(res);
    });
}
