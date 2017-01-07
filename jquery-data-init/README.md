
# Declarative initialisation jQuery plugin

Provide a declarative and consistent way to execute code on some HTML element.

- Prevent inconsistent onLoad initialisations (lead to code complexity), factorize the code
- Provide a clear way to identify that a javascript code is executed on an HTML element
- Esier to bind/unbind javascript execution on an HTML element (no need to change the javascript code)

## Quick start

Example, two date pickers initialisation with the HTML:

```html
<div data-init="date-picker"></div>
<div data-init="date-picker"></div>
```

Declare an initialisation function with:

```javascript
jQuery.dataInitFunction("date-picker", function(initNode){
    jQuery(initNode).datePicker();
});
```

Execute initialisation when the document is loaded:

```javascript
jQuery(document).ready(function(){
    jQuery("[data-init]").dataInit();
});
```

## Parameters

Pass some parameters with a data-init-params attribute:

```html
<div data-init="date-picker" data-init-params="{someField: 'some value'}"></div>
```

It will be passed to the initialisation function as second argument:

```javascript
jQuery.dataInitFunction("date-picker", function(initNode, initParams){
    jQuery(initNode).datePicker(initParams);
});
```

This attribute is evaluated as a javascript expression, it could be: a string, an integer, an object, a global variable name, ...
