window.onload = () => {
    "use strict";

    const btnBiggerDec = document.getElementById("btnBiggerDec");
    const textarea = document.getElementById("textarea");
    const checkbox = document.getElementById("bling");
    const btnIgpayAtinlay = document.getElementById("btnIgpayAtinlay");
    const btnMalkovitch = document.getElementById("btnMalkovitch");

    btnBiggerDec.onclick = handleBiggerDecorations;
    btnIgpayAtinlay.onclick = handleIgpayAtinlay;
    btnMalkovitch.onclick = handleMalkovitch;

    checkbox.onchange = () => {
        if (checkbox.checked) {
            textarea.style.fontWeight = "bold";
            textarea.style.color = "green";
            textarea.style.textDecoration = "underline";    
            document.body.style.backgroundImage = "url('images/hundred-dollar-bill.jpg')";
        } else {
            textarea.style.fontWeight = "normal";
            textarea.style.color = "inherit";
            textarea.style.textDecoration = "none";    
            document.body.style.backgroundImage = "none";
        }
    };
}

let clicked = false;

function handleBiggerDecorations() {
    if (!clicked) {
        setInterval(makeLarge, 500, document.getElementById("textarea"));
        clicked = true;
    }
}

function makeLarge(textarea) {
    let size = textarea.style.fontSize ? parseInt(textarea.style.fontSize) : 12;
    size += 2;
    textarea.style.fontSize = size + "pt";
}

function handleIgpayAtinlay() {
    const textarea = document.getElementById("textarea");
    const words = textarea.value.split(/\s+/);
    const arr = [];
    for (const word of words) {
        let index = 0;
        while (!word.charAt(index).match("[AEOIUaeoiu]") && index < word.length) {
            index++;
        }
        arr.push(word.substring(index) + word.substring(0, index) + "ay");
    }
    textarea.value = arr.join(" ");
}

function handleMalkovitch() {
    const textarea = document.getElementById("textarea");
    const words = textarea.value.split(/\s+/);
    const arr = [];
    for (let i = 0; i < words.length; i++) {
        if (words[i].length >= 5) {
            arr.push("Malkovich");
        } else {
            arr.push(words[i]);
        }
    }
    textarea.value = arr.join(" ");
}