const chai =require('chai')
,assert = chai.assert
,expect =chai.expect
,should = chai.should()

describe('String', function(){

    // describe fn  can work like a test suite that means, we can write multiple test case here 
    let userName = 'Talha' ;
    let valueOfPI = Math.PI;

    console.log('******************');
    console.log('Value of PI = '+valueOfPI);
    console.log('String Is = '+userName);

    //TC-1
    it('Should be a String ', function(){
      //In chai there is 3 arrestion  1.should 2.Expect 3. Assert 
      userName.should.be.a('String'); //should 
      expect(userName).to.be.a('String'); // expect
      assert.typeOf(userName,'String'); // assert
    }) 

    //TC-2
    it('String value is Talha', function(){
      userName.should.not.equal('Sakib');
      userName.should.equal('Talha');
      expect(userName).to.equal('Talha');
      assert.equal(userName,'Talha');
    })

    //TC-3 "IF we want to SKIP this (TC-4) then we add it.skip at it fn  "
    //it.skip('Should be a Number',function()
    it('Should be a Number',function(){
      valueOfPI.should.be.a('Number');
    
    })

    //TC-4   "IF we want to RUN only this (TC-4) then we add it.only at it fn  "
    //it.only('Value Should be The Value Of PI',function()
    it('Value Should be The Value Of PI',function(){
      valueOfPI.should.be.equal(valueOfPI); 
    })

    console.log('******************');

 })