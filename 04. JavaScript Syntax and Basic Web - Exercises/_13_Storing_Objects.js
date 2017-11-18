function storingObjects(args) {
    let array = [];
    for (let i = 0; i < args.length; i++) {
        let tokens = args[i].split(' -> ');
        let name = tokens[0];
        let age = Number(tokens[1]);
        let grade = tokens[2];

        array.push({
            Name: name,
            Age: age,
            Grade: grade
        });
    }
    for (let student of array) {
        for (let key of Object.keys(student)) {
            console.log(`${key}: ${student[key]}`)

        }

    }

}
storingObjects([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
])