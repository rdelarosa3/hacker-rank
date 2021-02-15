
let btnsDiv = document.createElement("div");
btnsDiv.id = "btns";
let html = "";
for(let i = 1;i<=9;i++){
    html+= "<button class='btn' id='btn"+i+"' style="width:30%;position:relative;">"+i+"</button>";
}
btnsDiv.innerHTML = html;
document.body.appendChild(btnsDiv);  

const getBtns = () =>{
    let btns = {}
    for(let i = 1;i<=9;i++){
        btns[i] = document.getElementById('btn'+i).innerText;
    }
    return btns;
}

document.getElementById("btn5").addEventListener("click", function(){
    let btns = getBtns();
    for(let k in btns){
        let btn = document.getElementById('btn'+k);
        switch(k){
            case '1':
                btn.innerText = btns[4];
                break;
                case '2':
                btn.innerText = btns[1];
                break;
                case '3':
                btn.innerText = btns[2];
                break;
                case '4':
                btn.innerText = btns[7];
                break;
                case '5':
                break;
                case '6':
                btn.innerText = btns[3];
                break;
                case '7':
                btn.innerText = btns[8];
                break;
                case '8':
                btn.innerText = btns[9];
                break;
                case '9':
                btn.innerText = btns[6];
                break;
        }
    }
}); 
