package com.alexander.digiotest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.alexander.digiotest.model.Response
import com.alexander.digiotest.repository.Repository
import io.mockk.MockKAnnotations
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.`when` as whenever


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = CoroutineRule()

    private lateinit var viewModel: MainViewModel

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var responseObserver: Observer<Response>

    @Before
    fun start() {
        MockKAnnotations.init(this)
        viewModel = MainViewModel(repository)

    }

    @Test
    fun `when get main data ok then return a response successfully`() {
        testCoroutineRule.runBlockingTest {
            viewModel.getResponse().observeForever(responseObserver)
            whenever(repository.getMainData()).thenAnswer {
                Response(emptyList(), emptyList(), null)
            }
            viewModel.getMainData()
            assertNotNull(viewModel.getResponse().value)
            assertEquals(Response(emptyList(), emptyList(), null), viewModel.getResponse().value)
        }
    }

    @After
    fun tearDown() {
        viewModel.getResponse().removeObserver(responseObserver)

    }
}