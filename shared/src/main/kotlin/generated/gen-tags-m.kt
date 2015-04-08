package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class MAP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("map", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var name : String
        get()  = attributeString29bd7c40.get(this, "name")
        set(newValue) {attributeString29bd7c40.set(this, "name", newValue)}


}

public class MARK(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("mark", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class MATH(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("math", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class MATHML(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("mathml", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class MENU(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("menu", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var type : MenuType
        get()  = attributeMenuTypeMenuTypeValuesd1c4d4d.get(this, "type")
        set(newValue) {attributeMenuTypeMenuTypeValuesd1c4d4d.set(this, "type", newValue)}

    var label : String
        get()  = attributeString29bd7c40.get(this, "label")
        set(newValue) {attributeString29bd7c40.set(this, "label", newValue)}


}

public class META(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("meta", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var httpEquiv : String
        get()  = attributeStringb0e54577.get(this, "http-equiv")
        set(newValue) {attributeStringb0e54577.set(this, "http-equiv", newValue)}

    var name : String
        get()  = attributeString29bd7c40.get(this, "name")
        set(newValue) {attributeString29bd7c40.set(this, "name", newValue)}

    var content : String
        get()  = attributeString29bd7c40.get(this, "content")
        set(newValue) {attributeString29bd7c40.set(this, "content", newValue)}

    var charset : String
        get()  = attributeString29bd7c40.get(this, "charset")
        set(newValue) {attributeString29bd7c40.set(this, "charset", newValue)}


}

public class METER(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("meter", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var value : String
        get()  = attributeString29bd7c40.get(this, "value")
        set(newValue) {attributeString29bd7c40.set(this, "value", newValue)}

    var min : String
        get()  = attributeString29bd7c40.get(this, "min")
        set(newValue) {attributeString29bd7c40.set(this, "min", newValue)}

    var max : String
        get()  = attributeString29bd7c40.get(this, "max")
        set(newValue) {attributeString29bd7c40.set(this, "max", newValue)}

    var low : String
        get()  = attributeString29bd7c40.get(this, "low")
        set(newValue) {attributeString29bd7c40.set(this, "low", newValue)}

    var high : String
        get()  = attributeString29bd7c40.get(this, "high")
        set(newValue) {attributeString29bd7c40.set(this, "high", newValue)}

    var optimum : String
        get()  = attributeString29bd7c40.get(this, "optimum")
        set(newValue) {attributeString29bd7c40.set(this, "optimum", newValue)}


}

