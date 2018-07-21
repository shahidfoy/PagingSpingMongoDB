$(document).ready(function() {
    // on click of the new item or edit button opens the edit modal
    // if the text is Edit the country variable are grabbed and placed into the inputs
    $('.newBtn, .table .editBtn').on('click', function(event) {
        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        if(text == 'Edit') {
            $.get(href, function(country, status) {
                $('.myForm #id').val(country.id);
                $('.myForm #name').val(country.name);
                $('.myForm #capital').val(country.capital);
            });

            $('.myForm #editModal').modal();
        } else {
            $('.myForm #id').val('');
            $('.myForm #name').val('');
            $('.myForm #capital').val('');

            $('.myForm #editModal').modal();
        }
    });

    // on click of the delete button and opens the delete modal
    // once the delete button is clicked inside of the modal
    // the delete href is activated and deletes the item
    $('.table .deleteBtn').on('click', function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #deleteReference').attr('href', href);
        $('#deleteModal').modal();
    });
});
