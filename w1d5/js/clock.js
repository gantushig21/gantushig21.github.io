"use strict";

setInterval(ticking, 500);

function ticking() {
    const today = new Date();

    const y = today.getFullYear();
    let m = today.getMonth() + 1;
    m = (m < 10 ? "0" : "") + m;
    const d = (today.getDate() < 10 ? "0" : "") + today.getDate();

    const h = (today.getHours() < 10 ? "0" : "") + today.getHours();
    const min = (today.getMinutes() < 10 ? "0" : "") + today.getMinutes();
    const s = (today.getSeconds() < 10 ? "0" : "") + today.getSeconds();

    document.getElementById("clock").innerHTML = `${y}-${m}-${d} ${h}:${min}:${s}`;

}
