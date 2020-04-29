$(document).ready(function() {
    $("#form2").submit(e => {
        e.preventDefault();
        $("div.result").empty();
        $("div.form-group input").each((id, e) => {
            $("div.result").append($("<p>", {
                text: $(e).val()
            }));
        });
    });
});