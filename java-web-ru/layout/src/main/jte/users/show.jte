@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
    <ul>
        <li>id: ${page.getUser().getId()}</li>
        <li>name: ${page.getUser().getFirstName()} ${page.getUser().getLastName()}</li>
        <li>email: ${page.getUser().getEmail()}</li>
    </ul>
`)