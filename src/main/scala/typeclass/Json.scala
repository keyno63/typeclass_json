package typeclass

object Json {
  def str(value: String): JsValue    = JsString(value)
  def num(value: Double): JsValue    = JsNumber(value)
  def bool(value: Boolean): JsValue  = JsBoolean(value)
  def obj(value: (String, JsValue)*): JsValue = JsObject(value.toMap)
  def arr(value: JsValue*): JsValue           = JsArray(value.toVector)
  val nul: JsValue                            = JsNull
}