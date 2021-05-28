const hex = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B','C','D','E','F'];
let hexColor = '#'
for (let i = 0; i<6; i++){
	hexColor += hex[getRandomNumber()]
}

function getRandomNumber() {
	return Math.floor(Math.random() * hex.length )
}

console.log(hexColor)
