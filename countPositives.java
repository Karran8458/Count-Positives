function countPositives(arr)
{
	var counter = 0;
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>0)
		{
			counter++;
		}
	}
	arr[arr.length-1]=counter;
	return arr;
}
