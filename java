<script type="text/javascript">
$(document).ready(function(){
$(document).find('input').attr('readonly', true);
$(document).find("input:first").attr('readonly',false);
$(document).find("input:first").bind("change keyup input",function() { 
    var text = $(this).val();
    $(document).find("input").val(text);
});
});
</script>
