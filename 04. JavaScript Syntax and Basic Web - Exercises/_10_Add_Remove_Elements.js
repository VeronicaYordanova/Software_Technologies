function addOrRemoveElements(arr) {
    let array = new Array();
    for (let command of arr) {
        let tokens = command.split(' ');
        let action = tokens[0];
        let element = Number(tokens[1]);

        switch(action){
            case 'add':
                array.push(element);
                break;
            case 'remove':
                array.splice(element, 1);
                break;
        }
    }
    for(let i of array) {
        console.log(i);
    }
}
addOrRemoveElements([
    'add 3',
    'add 5',
    'add 7']);