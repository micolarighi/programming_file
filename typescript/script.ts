let data : string[] = []
let gacha : string[] = ["suka loli", "wibu", "ganteng", "pinter", "bau", "gay", "anak baik"]
var input = (<HTMLInputElement>document.getElementById('inputName'));
const addButton = document.getElementById('addBtn')
const randomizeButton = document.getElementById('randomizeBtn')
const resultContainer = document.querySelector('.resultContainer')



function add() {
    data.push(input.value)
    input.value = ''
    console.log(data)
}

function randomize () {
    data.forEach(d => {
        let rand = Math.floor(Math.random() * gacha.length)
        const res = document.createElement("h6")
        const node = document.createTextNode(" " +  d + " " +  gacha[rand] + " ")
        res.appendChild(node)
        resultContainer.appendChild(res)
    })
}