let letters = ["m", "i", "c", "o"]

// using normal function

function combineLetter (total, next) {
    return total + next;
}

let word = letters.reduce(combineLetter);
console.log(word);

// using arrow function
let wordArf = letters.reduce((total, next) => {
    return total + next
})

console.log(wordArf)
