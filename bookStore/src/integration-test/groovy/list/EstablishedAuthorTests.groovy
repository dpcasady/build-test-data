package list

import bookstore.EstablishedAuthor
import grails.test.mixin.TestMixin
import grails.test.mixin.integration.IntegrationTestMixin
import grails.transaction.Rollback
import org.junit.Test

@Rollback
@TestMixin(IntegrationTestMixin)
class EstablishedAuthorTests {
    @Test
    void testRequiredListAndSetOk() {
        EstablishedAuthor establishedAuthor = EstablishedAuthor.build(name: "Steven King")
        assert establishedAuthor.hardcoverBooks != null
        assert establishedAuthor.hardcoverBooks.size() == 1
        assert establishedAuthor.paperbackBooks != null
        assert establishedAuthor.paperbackBooks.size() == 1
        assert establishedAuthor.id > 0
    }
}
