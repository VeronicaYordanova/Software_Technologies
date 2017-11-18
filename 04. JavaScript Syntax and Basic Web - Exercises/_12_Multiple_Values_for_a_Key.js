function multipleValuesForAkey(arr) {
    let array = [];

    for (let i = 0; i < arr.length - 1; i++) {
        let tokens = arr[i].split(' ');
        let key = tokens[0];
        let value = tokens[1];
        //array[key] = value;

        if(array[key] == undefined) {
            array[key] = new Array();
        }
        array[key].push(value);

    }

    let key = arr[arr.length - 1]
    if (array[key] != undefined) {
        for (let val of array[key]) {
            console.log(val);
        }

    }
    else {
        console.log("None")
    }

}
multipleValuesForAkey([
    'key value',
    'key eulav',
    'test tset',
    'key']);