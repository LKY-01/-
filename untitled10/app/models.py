from django.db import models

class Train(models.Model):
    train_id = models.AutoField(primary_key=True)
    place = models.CharField(max_length=50,blank = False) #
    date = models.DateField(blank = False) #
    keep_hour = models.IntegerField(blank = False) #
    content = models.CharField(max_length=100,blank = False) #
    object = models.CharField(max_length=50,blank = False) #
    is_online = models.BooleanField(blank = False) #
    is_delete = models.BooleanField(default=False,blank = False)  #

class Graduate(models.Model):
    graduate_id =models.AutoField(primary_key=True)
    name = models.CharField(max_length=50,blank = False) #
    major = models.CharField(max_length=50,blank = False) #
    grade = models.IntegerField(blank = False) #
    award_record = models.CharField(max_length=50,blank = False) #
    destination = models.CharField(max_length=100,blank = False) #
    picture_link = models.CharField(max_length=100,blank = False)  #
    is_work = models.BooleanField(blank = False) #
    is_delete = models.BooleanField(default=False,blank = False)  #

class Excellent(models.Model):
    excellence_id = models.AutoField(primary_key=True)
    name = models.CharField(max_length=50,blank = False) #
    major = models.CharField(max_length=50,blank = False) #
    grade = models.IntegerField(blank = False) #
    sex = models.BooleanField(blank = False) #
    position = models.CharField(max_length=50,blank = False) #
    achievement = models.CharField(max_length=50,blank = False) #
    picture_link = models.CharField(max_length=100,blank = False) #
    is_delete = models.BooleanField(default=False,blank = False)  #

class Honor(models.Model):
    honor_id =models.AutoField(primary_key=True)
    honor_name = models.CharField(max_length=50,blank = False) #
    honor_date = models.DateField(blank = False) #
    honor_level = models.CharField(max_length=50,blank = False) #
    honor_member = models.CharField(max_length=50,blank = False) #
    honor_teacher = models.CharField(max_length=50,blank = False) #
    is_delete = models.BooleanField(default=False,blank = False)  #




introduction = 'introduction'
value = 'value'
environment = 'work_environment'
talent = 'talent_training_program'
STATUS_CHOICES = [
    (introduction, '简介'),
    (value, '价值观'),
    (environment, '工作环境'),
    (talent, '人才培养方案'),
]
class Basic(models.Model):
    basic_id =models.AutoField(primary_key=True)
    title = models.CharField(max_length=50,blank = False) #
    picture_link = models.FileField(upload_to='meida',blank = True)
    content = models.CharField(max_length=100,blank = False) #
    type = models.CharField(max_length=50,
                            choices=STATUS_CHOICES,
                            default=introduction) #
    is_delete = models.BooleanField(default=False,blank = False)  #