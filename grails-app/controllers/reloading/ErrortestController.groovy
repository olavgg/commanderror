package reloading

import grails.transaction.Transactional

@Transactional
class ErrortestController {

    def index() { }

    def save(SaveCommand form) {
        if(form.validate()){
            println "form.validated"
            Message m = new Message(form.properties)
            if(m.validate() && m.save(flush:true)){
                flash.message = "Saved new message"
                redirect(action: 'index')
                return
            }
        }
        println "form has errors"
        render view: 'index', model:[form:form]
    }
}
