window.onload = function() {
    const modal = document.getElementById("modal");
    const closeModal = document.getElementById("closeModal");

    closeModal.onclick = () => {
        modal.style.display = "none";
    }

    window.onclick = e => {
        if (e.target == modal) {
            modal.style.display = "none";
        }
    }

    const ids = ["productNumber", "name", "unitPrice", "quantity", "supplier", "dateSupplied"];

    document.getElementById("form2").addEventListener('submit', e => {
        e.preventDefault();

        ids.forEach(id => {
            const value = document.getElementById(id).value;
            document.getElementById(id + "Modal").innerHTML = value;
        });

        modal.style.display = "block";
    });
};