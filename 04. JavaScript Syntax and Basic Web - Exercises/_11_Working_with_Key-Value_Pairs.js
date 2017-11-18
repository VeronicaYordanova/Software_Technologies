function keyValuePairs(arr) {
    let array = [];

    for (let i = 0; i < arr.length - 1; i++) {
        let tokens = arr[i].split(' ');
        let key = tokens[0];
        let value = tokens[1];
        array[key] = value;
    }

    let key = arr[arr.length - 1]
    if (array[key] == undefined) {
        console.log("None")
    }
    else {
        console.log(array[key])
    }

}

keyValuePairs([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);