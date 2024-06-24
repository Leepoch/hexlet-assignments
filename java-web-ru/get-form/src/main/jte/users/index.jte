@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    @if(page.getTerm() == null)
        <form action="/users" method="get">
            <input type="search" name="term" value="${page.getTerm()}" />
            <input type="submit" value="Search" />
        </form>
        <table border="1">
            <tr>
                <th>id</th>
                <th>firstname</th>
                <th>lastname</th>
                <th>email</th>
            </tr>
            @for(var user : page.getUsers())
                <tr>
                    <td>
                        <a href="users/${user.getId()}">${user.getId()}</a>
                    </td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                </tr>
            @endfor
        </table>
    @else
        <form action="/users" method="get">
            <input type="search" name="term" value="${page.getTerm()}" />
            <input type="submit" value="Search" />
        </form>
        <table border="1">
            <tr>
                <th>id</th>
                <th>firstname</th>
                <th>lastname</th>
                <th>email</th>
            </tr>
            @for(var user : page.getUsers())
                <tr>
                    <td>
                        <a href="users/${user.getId()}">${user.getId()}</a>
                    </td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                </tr>
            @endfor
        </table>
    @endif
`
)