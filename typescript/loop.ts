let data : string[] = ["husein", "micola", "alfian"];
let gacha : string[] = ["suka loli", "ganteng", "wibu"]
let index = 1;
data.forEach(d => {
    let random = Math.floor(Math.random() * gacha.length)
    console.log(index + ". " + d + " " + gacha[random]);
    index++;
})