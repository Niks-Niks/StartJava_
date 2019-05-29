select * from jaeger;
select * from jaeger where status != 'destroyed';
select * from jaeger where mark = 'Mark-1' and mark = 'Mark-6';
select * from jaeger order by mark desc; 
select * from jaeger where launch = (select MAX(launch) from jaeger);
select * from jaeger where kaijuKill = (select MAX(kaijuKill) from jaeger); /  select * from jaeger where kaijuKill = (select MIN(kaijuKill) from jaeger);
select AVG(weight) from jaeger;
update jaeger set kaijukill = kaijukill + 1 where status != 'destroyed';
delete from jaeger where status = 'destroyed';