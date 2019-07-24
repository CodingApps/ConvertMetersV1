<h1 align="center"> Convert Meters Tool </h1> <br>

<h4 align="center">Convert meters entered and display conversion to inches.</h4> <br>
 

## Intro

This project allows you to fill in meters and converts the value to inches. 

<p align="center">
  <img alt="convertmeters" title="convertmeters" src="http://androidflow.github.io/screens/convert1.gif" width=300>
</p>
<br>

## Functions 

* OnClickListener for submitting value when button clicked. 
* Converting value to display.

<br>

## Processing Button Click

This implemented the OnClickListener to respond to button presses on the UI. It was interesting placing the Layouts and TextViews, then having the OnClickListener process the input.  

``` java
 super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         enterMeters = (EditText) findViewById(R.id.editText);
         resultTextView = (TextView) findViewById(R.id.resultText);
         convertButton = (Button) findViewById(R.id.convertButton);

         convertButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 double multiplier = 39.37;
                 double result = 0.0;
                 ...
```
<br>

