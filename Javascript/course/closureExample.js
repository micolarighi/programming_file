function makeSize (size) {
    document.body.style.fontSize = size + "px";
}

function makeFont (fontFam) {
    document.body.style.fontFamily = fontFam;
}

let font20 = makeSize(20);
let font40 = makeSize(40);

font20();