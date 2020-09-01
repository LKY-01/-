from django.shortcuts import render,HttpResponse
from django.shortcuts import render
from django.views import View
from rest_framework.response import Response
from rest_framework.views import APIView
from app import models
from django.forms.models import model_to_dict
# Create your views here.

def user_center1(request):
    basic_id = request.basic_id
    picture_link = request.FILES.get('picture_link')
    if request.method == 'GET':
        return render(request, 'get.html', context={'picture_link': picture_link})
    # 如果用户要更新数据
    else:
        title = request.POST.get('title')
        content = request.POST.get('content')
        type = request.POST.get('type')
        # 内存存储对象，此处表现为图片名
        picture_link = request.FILES.get('picture_link')
        is_delete = request.get('is_delete')
        # 将基本信息保存到本地数据库
        models.Basic.title = title
        models.Basic.content = content
        models.Basic.mobile = type

        # 保存到本地，使用此方法更新图片需要在models中定义icon = models.ImageField(upload_to='')的方法
        models.Basic.picture_link = picture_link
        models.Basic.is_delete = is_delete
        # # 将图片上传到云存储
        # save_path = upload_image(icon)
        # user.yunicon = save_path
        # user.save()

        # 重新加载页面
        return render(request, 'get.html', context={'basic_id': basic_id})




class BasicintroductionView(APIView):
    def post(self,request,*args,**kwargs):
        models.Basic.objects.create(**request.data)

        return Response("添加成功")
        # return render(request, 'templates/get.html')

    def get(self, request, *args, **kwargs):
            # list_1 = list(models.Basic.objects.filter(is_delete=0).filter(type="introduction").values())#使用队列进行输出
            # return Response(list_1)
        name = models.Basic.objects.get(nam)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    #   物理删除
    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id=pk).delete()
        return Response("删除成功")


class BasicvalueView(APIView):
    def post(self,request,*args,**kwargs):
        models.Basic.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
            list_1 = list(models.Basic.objects.filter(is_delete=0).filter(type="value").values())#使用队列进行输出
            return Response(list_1)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    #   物理删除
    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id=pk).delete()
        return Response("删除成功")

class BasicenvironmentView(APIView):
    def post(self,request,*args,**kwargs):
        models.Basic.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
            list_1 = list(models.Basic.objects.filter(is_delete=0).filter(type="work_environment").values())#使用队列进行输出
            return Response(list_1)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    #   物理删除
    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id=pk).delete()
        return Response("删除成功")

class BasictalentView(APIView):
    def post(self,request,*args,**kwargs):
        models.Basic.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
            list_1 = list(models.Basic.objects.filter(is_delete=0).filter(type="talent_training_program").values())#使用队列进行输出
            return Response(list_1)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    #   物理删除
    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Basic.objects.filter(id=pk).delete()
        return Response("删除成功")

class ExcellentView(APIView):
    def post(self,request,*args,**kwargs):
        models.Excellent.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
        pk = kwargs.get('pk')
        if not pk:
            list_1 = list(models.Excellent.objects.filter(is_delete=0).values())
            return Response(list_1)
        else:
            list_2 = list(models.Excellent.objects.filter(id=pk).values())   #使用队列进行输出
            list_3 = model_to_dict(models.Excellent.objects.filter(id=pk).first())  #使用字典进行输出
            return Response(list_3)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Excellent.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Excellent.objects.filter(id=pk).delete()
        return Response("删除成功")
#
#
class GraduateView(APIView):
    def post(self,request,*args,**kwargs):
        models.Graduate.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
        pk = kwargs.get('pk')
        if not pk:
            list_1 = list(models.Graduate.objects.filter(is_delete=0).values())
            return Response(list_1)
        else:
            list_2 = list(models.Graduate.objects.filter(id=pk).values())   #使用队列进行输出
            list_3 = model_to_dict(models.Graduate.objects.filter(id=pk).first())  #使用字典进行输出
            return Response(list_2)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Graduate.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Graduate.objects.filter(id=pk).delete()
        return Response("删除成功")



class HonorView(APIView):
    def post(self,request,*args,**kwargs):
        models.Honor.objects.create(**request.data)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
        pk = kwargs.get('pk')
        if not pk:
            list_1 = list(models.Honor.objects.filter(is_delete=0).values())
            return Response(list_1)
        else:
            list_2 = list(models.Honor.objects.filter(id=pk).values())   #使用队列进行输出
            list_3 = model_to_dict(models.Honor.objects.filter(id=pk).first())  #使用字典进行输出
            return Response(list_2)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Honor.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Honor.objects.filter(id=pk).delete()
        return Response("删除成功")


class TrainView(APIView):
    def post(self,request,*args,**kwargs):
        a=models.Train.objects.create(**request.data)
        print(a)
        return Response("添加成功")

    def get(self, request, *args, **kwargs):
        pk = kwargs.get('pk')
        if not pk:
            list_1 = list(models.Train.objects.filter(is_delete=0).values())
            return Response(list_1)
        else:
            list_2 = list(models.Train.objects.filter(id=pk).values())   #使用队列进行输出
            list_3 = model_to_dict(models.Train.objects.filter(id=pk).first())  #使用字典进行输出
            return Response(list_2)

    def put(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Train.objects.filter(id = pk).update(**request.data)
        return Response("更新成功")

    def delete(self,request,*args,**kwargs):
        pk = kwargs.get('pk')
        models.Train.objects.filter(id=pk).delete()
        return Response("删除成功")




