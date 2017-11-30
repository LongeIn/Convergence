$.datas={
	//by appoint element inside form element create data ({name:value,...})
	CreateDataRow:function(o){
		var data = {}
		for(var e of $(o).find("input,select,textarea")){
			if(e.name!=null && e.name!=''){
				if(e.type=="radio" || e.type=="checkbox"){
					if($(data).attr(e.name)==null)
						$(data).attr(e.name, $.datas.getCheckedData(e.name));
				}else{
					$(data).attr(e.name, e.value);
				}
			}
		}
		return data;
	},
	//by appoint data set in form element ({name:name,value:value})
	SetDataRow:function(data){
		var flag = "";
		for(var e in data){
			var type = $("[name='"+e+"']").attr("type");
			if(type=="radio" || type=="checkbox"){
				if(flag != e)
					$.datas.setCheckedData({"name":e,"value":data[e]});
			}else{
				$("[name='"+e+"']").val(data[e]);
			}
			flag = e;
		}
	},
	//get checked data
	getCheckedData:function(name){
		var data = [];
		for(var o of $("[name='"+name+"']")){
			if(o.checked){
				data.push(o.value);
			}
		}
		return data;
	},
	//set checked data
	setCheckedData:function(data){
		$("[name='"+data.name+"']").prop("checked", "");
		for(var v of data.value){
			$("[name='"+data.name+"'][value='"+v+"']").prop("checked", "checked");
		}
	}
}