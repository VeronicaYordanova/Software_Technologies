function multiplyOrDivideAnumber(numbers) {
    let numberN = Number(numbers[0]);
    let numberX = Number(numbers[1]);

    if(numberX >= numberN){
        let multiply = numberX * numberN;
        console.log(multiply);
    }
    else if(numberN > numberX){
        let divide = numberN/ numberX;
        console.log(divide);
    }
}
multiplyOrDivideAnumber(['144','12']);