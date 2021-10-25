function checkRating(rating, animeName) {
    rating > 7 ? console.log(animeName + " Passed") : console.log(animeName + " Failed"); 
}

checkRating(8, "The World God Only Knows");
checkRating(7, "Sword Art Online");