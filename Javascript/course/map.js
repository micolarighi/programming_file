let IDR = [100000, 200000, 500000, 1000000];

function toUSD(value) {
    value *= 0.000070;
    return value;
}

let USD = IDR.map(toUSD);
console.log(IDR);
console.log(USD);