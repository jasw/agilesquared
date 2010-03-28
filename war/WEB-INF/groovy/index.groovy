def files = [];
new File("images").eachFile {file ->
  if (file.name.startsWith("suc_")) files << file
};
request.setAttribute 'randomConstructionPic', files[new Random().nextInt(files.size())];

forward '/index.gtpl';
