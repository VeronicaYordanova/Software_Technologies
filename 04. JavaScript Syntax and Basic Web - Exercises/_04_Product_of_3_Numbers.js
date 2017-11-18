function productOf3Numbers(numbers) {
    let numberX = Number(numbers[0]);
    let numberY = Number(numbers[1]);
    let numberZ = Number(numbers[2]);

    if(numberX == 0 || numberY == 0 || numberY == 0){
        console.log("Positive");
        return;
    }
    let negativeCounter = 0;
    if(numberX < 0){
        negativeCounter++;
    }
    if(numberY < 0){
        negativeCounter++;
    }
    if(numberZ < 0){
        negativeCounter++;
    }


    if(negativeCounter % 2 == 0){
        console.log("Positive");
    }
    else{
        console.log("Negative");
    }


}
productOf3Numbers(['-3','-4','5']);