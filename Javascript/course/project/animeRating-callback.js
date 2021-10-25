
data = ["argonaut", "argo", "lenka", "lucian"];

data.forEach(item => {
    console.log(item);
});


function displayRating(r) {
    console.log(r);
};

function displayRatingWStar(r) {
    console.log(r / 2 + "*");
};

function setRating(rating, cback) {
    cback(rating);
};

setRating(10, displayRatingWStar)
