package example

import org.scalajs.dom


@main
def helloWorld(): Unit =
  dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <h1>Hello World!</h1>
    </div>
  """
