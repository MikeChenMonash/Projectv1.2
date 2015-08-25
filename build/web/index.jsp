<!DOCTYPE html>
<html>
    <head>
        <title></title>
        
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  
        <script type="text/javascript" src="js/test.js"></script>
        <script type="text/javascript" src="js/marker.js"></script>
<!--        <script>
            $(document).ready(function(){
                $("button").click(function(event){
                var buttonID = event.target.id;
                $.get("/Projectv1/DatabaseAccess",
                    function(resp){
                        $("#database").empty().append("<h3>json result</h3>");
                        $.each(resp, function(i,objectId){
                            $("#database").append(i+1, ". " + objectId.objectId + "</br>");
                        });     
                    });              
                });
            });
            </script>-->
            
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/form.css">
    </head>
    <body>
        <header>
            <h1>Smart Trip</h1>
            <nav>
                <ul>
                    <li><a href="" class="current">Home</a></li>
                    <li><a href="">Sign in</a></li>
                    <li><a href="">Sign up</a></li>
                </ul>
            </nav>
        </header>

        <div id="map" style="float:left;width:63%; height:100%"></div>

        <!--<form action="routeBlock.java" method="Get">-->  
        <fieldset>
            <label class="title">From:</label><input id="start-pac" class="controls" type="text"
                                                     placeholder="Enter a location"><br />
            <label class="title">To:</label><input id="end-pac" class="controls" type="text"
                                                   placeholder="Enter a location"><br />
            
            <label class="title">Truck Height(m):</label><input id="height" type="text" class="controls" 
                                                             name="truck-height"><br />
            <label class="title">Truck Length(m):</label><input id="length" type="text" class="controls"
                                                             name="truck-length"><br />
            <label class="title">Truck Width(m):</label><input id="width" type="text" class="controls"
                                                            name="truck-width"><br />
            <input type="submit" id="submit" value="Sumbit" />
        </fieldset>
        <!--</form>-->
  
        <br />
        
        <fieldset>
            
        </fieldset>

        <div id="directionsPanel" class="panel" style="float:right; width:34%; height:100%">
            <p>Total Distance: <span id="total"></span></p>
        </div>

        <script src="js/map.js"></script>

        <script src="https://maps.googleapis.com/maps/api/js?signed_in=true&libraries=places&callback=initMap"
        async defer></script>
<!--        <button id="marker" type="button">marker</button>
        <button id="test" type="button">test</button>
        <p>result</p>
        <p>result</p>
        <p>result</p>
        <div id="database"></div></br></br>-->
    </body>
</html>


