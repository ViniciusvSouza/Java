let http = require('http');
let fs = require('fs');
let express = require('express');
let fileUpload = require('express-fileupload');
let app = express();
app.use(fileUpload({}));


app.use('/app', express.static('public'));
app.post('/', function(req, res) {

    console.log(req.files);
    let data = req.files.file.data;
    let result = "";
    let result1 = "";
    console.log(data.toString());

    let content = data.toString().split(/(?:\r\n|\r|\n)/g);
    let cnpj = content[3].split(/\s+/);



    for (let i = 0; i < content.length; i++) {

        if (/^\s+$/.test(content[i])) {
            let total = content[i - 1].split(/\s+/);
            //let cnpj = content[i + 6].split(/\s+/);

            result = result+(cnpj[1]+";"+total[3]+"\n");
            i = i+3;
            cnpj = content[i + 3].split(/\s+/);

        }
    }

    fs.writeFileSync("public/Arquivo.csv",new Uint8Array(Buffer.from(result1 +"\n"+ result)));
    res.send(req.get("host")+"/app/Arquivo.csv");

});




app.listen (8000, () =>{
    console.log('serverup on 8000');
});