console.log("entrei");
let file = null;
function changeFile(event){
    file = event.target.files[0];
}
function loadDoc(event) {
    event.preventDefault();
    console.log("enviando")
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText);
            window.open("http://"+this.responseText,"_blank");
        }
    };
    let formData = new FormData();

    formData.append("file", file);
    xhttp.open("POST", "http://localhost:8000/", true);
    xhttp.send(formData);
    console.log(file);
}
