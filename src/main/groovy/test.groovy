/**
 * Created with IntelliJ IDEA.
 * User: ee
 * Date: 19/08/13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
class Class1 {
    def closure = {
        println this.class.name
        println delegate.class.name
        def nestedClos = {
            println owner.class.name
        }
        nestedClos()
    }
}

def clos = new Class1().closure
clos()
def list = ['a','b','c','d']
def list1 = ['a','b','c','d']
def newList = []

def clos1 = { it.toUpperCase() }
list.collect( newList, clos1 )

println newList == ["A", "B", "C", "D"]