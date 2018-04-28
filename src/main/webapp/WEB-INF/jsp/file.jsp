<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form id="fileupload" action="/rest/pic/upload" method="POST" enctype="multipart/form-data">  
            <!-- Redirect browsers with JavaScript disabled to the origin page -->  
            <noscript><input type="hidden" name="redirect" value="https://blueimp.github.io/jQuery-File-Upload/"></noscript>  
            <!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->  
            <div class="row fileupload-buttonbar">  
                <div class="col-lg-7">  
                    <!-- The fileinput-button span is used to style the file input field as button -->  
                    <span class="btn btn-success fileinput-button">  
                        <i class="glyphicon glyphicon-plus"></i>  
                        <span>选择文件(多选)</span>  
                        <input type="file" name="uploadFile" multiple="multiple">  
                    </span>  
                    <button type="submit" class="btn btn-primary start">  
                        <i class="glyphicon glyphicon-upload"></i>  
                        <span>开始上传</span>  
                    </button>  
                    <button type="reset" class="btn btn-warning cancel">  
                        <i class="glyphicon glyphicon-ban-circle"></i>  
                        <span>取消上传</span>  
                    </button>  
                    <button type="button" class="btn btn-danger delete">  
                        <i class="glyphicon glyphicon-trash"></i>  
                        <span>删除</span>  
                    </button>   
                    <input type="checkbox" class="toggle" title="全选">  
                    <!-- The global file processing state -->  
                    <span class="fileupload-process"></span>  
                </div>  
                <!-- The global progress state -->  
                <div class="col-lg-5 fileupload-progress fade">  
                    <!-- The global progress bar -->  
                    <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">  
                        <div class="progress-bar progress-bar-success" style="width:0%;"></div>  
                    </div>  
                    <!-- The extended global progress state -->  
                    <div class="progress-extended"> </div>  
                </div>  
            </div>  
            <!-- The table listing the files available for upload/download -->  
            <table role="presentation" class="table table-striped"><tbody class="files"></tbody></table>  
        </form>
</body>
</html>