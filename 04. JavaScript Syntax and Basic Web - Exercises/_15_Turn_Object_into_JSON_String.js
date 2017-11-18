function turnObjectIntoJsonString(args) {
    let object = {};
    for (let i = 0; i < args.length; i++) {
        let objSplit = args[i].split(" -> ");
        let key = objSplit[0];
        let value = objSplit[1];

        if(key === "age" || key === "grade"){
            value = Number(value);
        }
        object[key]=value;
    }

    let json = JSON.stringify(object);
    console.log(json);
}
turnObjectIntoJsonString(['name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia']);

