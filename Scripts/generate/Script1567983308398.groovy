import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.configuration.RunConfiguration

Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path materials = projectDir.resolve("Materials")
Files.createDirectories(materials)
Path viewerPath = materials.resolve("viewer.html")

String urlA = "http://demoaut.katalon.com/"
String urlB = "http://demoaut-mimic.kazurayam.com"

StringBuffer b = new StringBuffer()
b.append("""<!doctype html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <title>accordion</title>
    </head>
    <body>
        <!-- ここに本文を記述します -->
        <h1>Hello Bootstramp4</h1>
        <div class="accordion" id="accordion-4">
            <div class="card">
                <div class="card-header" id="header-4a" >
                    <button class="btn btn-link" type="button"
                            data-toggle="collapse" data-target="#card-4a"
                            aria-expanded="true" aria-controls="card-4a">
                        Path = /
                    </button>
                </div>
                <div id="card-4a"  class="collapse"
                     aria-labelledby="header-4a" data-parent="#accordion-4">
                    <div class="card-body container-fluid" >
                        <div class="row" >
                            <div class="col-md" >
                                <p>http://demoaut.katalon.com/</p>
                                <iframe width="100%" height="800"
                                    src="http://demoaut.katalon.com/"></iframe>
                            </div>
                            <div class="col-md" >
                                <p>http://demoaut-mimic.kazurayam.com/</p>
                                <iframe width="100%" height="800"
                                        src="http://demoaut-mimic.kazurayam.com/"></iframe>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    </body>
</html>

""")

viewerPath.toFile().text = b.toString()