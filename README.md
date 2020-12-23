### Installation
Install JDK and [sbt].

Download Scaje:

    git clone https://github.com/davips/scapyml

Setup and activate a python virtual environment and
install jep:
    
    python3.7 -m venv venv
    source venv/bin/activate
    pip install -e ~/git/automl-paje/
    
Test the installation running the demo.

    sbt run

ignore>
    If you use Intellij Idea,
    press Ctrl+Alt+Shift+S and add 
    the **lib** folder to *Project Settings -> Libraries*.


[sbt]: https://www.scala-sbt.org/release/docs/Setup.html
