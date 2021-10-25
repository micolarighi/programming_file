let score = [10, 2, 0, 4, 6, 7, 8, 7, 8, 8, 9, 6, 5]
function filterScore (score) {
    if (score >= 7 ) {
        return score;
    }
}

let filteredScore = score.filter(filterScore) 
console.log(filteredScore)

// using arf
let filteredScoreArf = score.filter(score => score >= 7)

console.log(filteredScoreArf);

