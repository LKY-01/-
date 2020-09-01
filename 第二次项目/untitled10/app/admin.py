from django.contrib import admin
from app.models import *
# Register your models here.

class BasicAdmin(admin.ModelAdmin):
    list_display = ['basic_id','title','picture_link','content','type','is_delete']  # 显示字段设置
    list_filter = ['basic_id','title','picture_link','content','type','is_delete']  # 过滤字段设置
 #   search_fields = ['basic_id','title','picture_link','content','type','is_delete']  # 搜索字段设置
    list_per_page = 5 # 分页设置
admin.site.register(Basic,BasicAdmin)


class HonorAdmin(admin.ModelAdmin):
    list_display = ['honor_id','honor_name','honor_date','honor_level','honor_member','honor_teacher','is_delete']  # 显示字段设置
    list_filter = ['honor_id','honor_name','honor_date','honor_level','honor_member','honor_teacher','is_delete']  # 过滤字段设置
    #  search_fields = ['honor_id','honor_name','honor_date','honor_level','honor_member','honor_teacher','is_delete']  # 搜索字段设置
    list_per_page = 5 # 分页设置
admin.site.register(Honor,HonorAdmin)


class ExcellentAdmin(admin.ModelAdmin):
    list_display = ['excellence_id','name','major','grade','sex','position','achievement','picture_link','is_delete']  # 显示字段设置
    list_filter = ['excellence_id','name','major','grade','sex','position','achievement','picture_link','is_delete']  # 过滤字段设置
    #  search_fields = ['excellence_id','name','major','grade','sex','position','achievement','picture_link','is_delete']  # 搜索字段设置
    list_per_page = 5 # 分页设置
admin.site.register(Excellent,ExcellentAdmin)


class GraduateAdmin(admin.ModelAdmin):
    list_display = ['graduate_id','name','major','grade','award_record','destination','picture_link','is_work','is_delete']  # 显示字段设置
    list_filter = ['graduate_id','name','major','grade','award_record','destination','picture_link','is_work','is_delete']  # 过滤字段设置
    #  search_fields = ['graduate_id','name','major','grade','award_record','destination','picture_link','is_work','is_delete']  # 搜索字段设置
    list_per_page = 5 # 分页设置
admin.site.register(Graduate,GraduateAdmin)


class TrainAdmin(admin.ModelAdmin):
    list_display = ['train_id','place','date','keep_hour','content','object','is_online','is_delete']  # 显示字段设置
    list_filter = ['train_id','place','date','keep_hour','content','object','is_online','is_delete']  # 过滤字段设置
    #   search_fields = ['train_id','place','date','keep_hour','content','object','is_online','is_delete']  # 搜索字段设置
    list_per_page = 5 # 分页设置
admin.site.register(Train,TrainAdmin)





