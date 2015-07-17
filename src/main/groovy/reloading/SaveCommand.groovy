package reloading

import grails.validation.Validateable

/**
 *
 * User: olav
 * Date: 7/17/15
 * Time: 12:51 PM
 *
 */
class SaveCommand implements Validateable{

    String message
    Set<String> emails = new HashSet<>()

    static constraints = {
        message nullable: false, blank:false
        emails validator: { val, obj ->
            if (val.empty){
                return [
                        'persons.cant.be.emtpy',
                        "size",
                        val.size()
                ]
            }
        }
    }
}
