"""untitled10 URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.conf.urls import url
from app import views
from django.urls import path, include
from django.views.static import serve
from untitled10 import settings

urlpatterns = [
    url(r'^admin/', admin.site.urls),

    url(r'^basic/introduction$', views.BasicintroductionView.as_view()),
    url(r'^basic/introduction/(?P<pk>\d+)$', views.TrainView.as_view()),

    url(r'^basic/value$', views.BasicvalueView.as_view()) ,
    url(r'^basic/value/(?P<pk>\d+)$', views.TrainView.as_view()),

    url(r'^basic/environment$', views.BasicenvironmentView.as_view()) ,
    url(r'^basic/environment/(?P<pk>\d+)$', views.TrainView.as_view()),

    url(r'^basic/talent$', views.BasictalentView.as_view()) ,
    url(r'^basic/talent/(?P<pk>\d+)$', views.TrainView.as_view()),

    url(r'^excellence/excellence$', views.ExcellentView.as_view()),
    url(r'^excellence/excellence/(?P<pk>\d+)$', views.ExcellentView.as_view()),

    url(r'^graduate/graduate$', views.GraduateView.as_view()),
    url(r'^graduate/graduate/(?P<pk>\d+)$', views.GraduateView.as_view()),

    url(r'^honor/honor$', views.HonorView.as_view()),
    url(r'^honor/honor/(?P<pk>\d+)$', views.HonorView.as_view()),

    url(r'^train/train$', views.TrainView.as_view()),
    url(r'^train/train/(?P<pk>\d+)$', views.TrainView.as_view()),

    url(r'^cs$', views.user_center1),

    url(r'^media/(?P<path>.*)$', serve, {'document_root': settings.MEDIA_ROOT}),

]
