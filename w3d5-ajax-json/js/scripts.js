"use strict"

$(function() {
    getBooks();
    $("#addBook").on('submit', addBook);
    startModal();
});

function getBooks() {
    const url = 'https://elibraryrestapi.herokuapp.com/elibrary/api/book/list';
    $.get(url).done(function(response, status) {
        response.sort((a, b) => a.datePublished < b.datePublished ? 1 : -1);
        let tbody = '';
        $.each(response, function(key, value) {
            tbody += `<tr>
                        <th>${key + 1}</th>
                        <td>${value.isbn}</td>
                        <td>${value.title}</td>
                        <td>${value.overdueFee}</td>
                        <td>${value.publisher}</td>
                        <td>${value.datePublished}</td>
                    </tr>`;
        });
        $("#books > tbody").append(tbody);
    }).fail(function(err) {
        console.log(err);
    });
}

function addBook(e) {
    e.preventDefault();

    const url = 'https://elibraryrestapi.herokuapp.com/elibrary/api/book/add';

    const data = {};
    $('#addBook').serializeArray().map(x => {data[x.name] = x.value;}); 

    $.ajax({
        url,
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        data: JSON.stringify(data),
        success: function(response){
            $('#addBook').trigger("reset");
            showModal('Your book is added successful', 'success');
        },
        error: function(jqXHR) {
            let msg = "Something went wrong";
            if (jqXHR.status && jqXHR.status==400){
                msg = jqXHR.responseText; 
            }
            showModal(msg, 'failed');
        }
    });
}

function showModal(msg, status) {
    const booksListBtn = document.getElementById("booksListModal");
    if (status == 'success') {
        booksListBtn.style.display = "inline-block";
    } else {
        booksListBtn.style.display = "none";
    }
    document.getElementById("messageModal").innerHTML = msg;
    const modal = document.getElementById("myModal");
    modal.style.display = "block";
}

function startModal() {
    const modal = document.getElementById("myModal");

    const booksListBtn = document.getElementById("booksListModal");
    const okayBtn = document.getElementById("okayModal");

    if (booksListBtn) {
        booksListBtn.onclick = function() {
            window.location.replace("books.html");
        }    
    }
    if (okayBtn) {
        okayBtn.onclick = function() {
            modal.style.display = "none";
        }    
    }

    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}