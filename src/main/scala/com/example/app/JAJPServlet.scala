package com.example.app

import org.scalatra._

class JAJPServlet extends JunitandjenkinsprojStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
