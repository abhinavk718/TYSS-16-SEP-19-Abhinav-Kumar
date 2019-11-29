import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  selectedMovie;
  movies = [
    {
      name : 'Deadpool',
      rating : 'Rating : 4/5',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/27/23/59/marvel-2688068__340.jpg',
      description : 'Deadpool was released in the United States on February 12, 2016, after an unconventional marketing campaign'
    },
    {
      name : 'Joker',
      rating : 'Rating : 4/5',
      imgUrl: 'https://cdn.pixabay.com/photo/2017/08/28/00/01/thejoker-2688077__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Joker is a 2019 American psychological thriller film directed by Todd Phillips, who co-wrote the screenplay with Scott Silver.'
    },
    {
      name : 'Universal',
      rating : 'Rating : 3/5',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/09/02/22/58/universal-studios-1640516__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Exclusive For Mobile Users: Show Your Uss Ticket On The Klook App To Get A Free. Discover And Book Attractions & Shows Wherever You Are. '
    },
    {
      name : 'SpiderMen',
      rating : 'Rating : 5/5',
      imgUrl: 'https://cdn.pixabay.com/photo/2018/04/10/22/18/spiderman-3309033__340.jpg',
      description : 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko.'
    },
    {
      name : 'Boothnath',
      rating : 'Rating : 5/5',
      imgUrl: 'https://cdn.pixabay.com/photo/2015/11/30/09/34/child-1069913__340.jpg',
      description : 'Aditya and Anjali move into a new house, the Nath Villa, along with their son Banku. '
    },
    {
       name : 'War',
       rating : 'Rating : 5/5',
       imgUrl : 'https://cdn.pixabay.com/photo/2016/01/02/13/08/cloths-1118179__340.jpg',
       // tslint:disable-next-line: max-line-length
       description : 'The biggest action entertainer of the year will see both these incredible action stars push their bodies to the limit to pull off never-seen-before, death-defying action stunts that will keep you on the edge of your seats.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }
  displayMovie(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }

}
