(function($){
    $.fn.dataInit = function() {
        return this.each(function() {
            var initNode = jQuery(this);
            
            var initName = initNode.attr("data-init");

            var initParams = undefined;
            if(initNode.attr("data-init-params") != undefined) {
                initParams = eval("("+initNode.attr("data-init-params")+")");
            }
            
            var initFunction = $.fn.dataInit.registeredFunctions[initName];
            
            if (initFunction != undefined) {
                initFunction(initNode, initParams);
            }
        });
    };
    
    $.fn.dataInit.registeredFunctions = {};
})(jQuery);

jQuery.extend({
    dataInitFunction: function(initName, initFunction){
        $.fn.dataInit.registeredFunctions[initName] = initFunction;
    }
});
