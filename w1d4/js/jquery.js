$(document).ready(function() {
    $("#form2").submit(e => {
        e.preventDefault();
        $("div.result").empty();
        $("div.form-group input, select").each((id, e) => {
            $("div.result").append($("<p>", {
                text: $(e).val()
            }));
        });
    });
});