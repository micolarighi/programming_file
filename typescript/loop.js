var data = ["husein", "micola", "alfian"];
var gacha = ["suka loli", "ganteng", "wibu"];
var index = 1;
data.forEach(function (d) {
    var random = Math.floor(Math.random() * gacha.length);
    console.log(index + ". " + d + " " + gacha[random]);
    index++;
});
