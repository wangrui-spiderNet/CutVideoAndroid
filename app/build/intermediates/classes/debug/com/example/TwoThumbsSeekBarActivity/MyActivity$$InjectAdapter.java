// Code generated by dagger-compiler.  Do not edit.
package com.example.TwoThumbsSeekBarActivity;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<MyActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code MyActivity} and its
 * dependencies.
 *
 * Being a {@code Provider<MyActivity>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<MyActivity>} and handling injection
 * of annotated fields.
 */
public final class MyActivity$$InjectAdapter extends Binding<MyActivity>
    implements Provider<MyActivity>, MembersInjector<MyActivity> {
  private Binding<com.github.hiteshsondhi88.libffmpeg.FFmpeg> ffmpeg;

  public MyActivity$$InjectAdapter() {
    super("com.example.TwoThumbsSeekBarActivity.MyActivity", "members/com.example.TwoThumbsSeekBarActivity.MyActivity", NOT_SINGLETON, MyActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    ffmpeg = (Binding<com.github.hiteshsondhi88.libffmpeg.FFmpeg>) linker.requestBinding("com.github.hiteshsondhi88.libffmpeg.FFmpeg", MyActivity.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(ffmpeg);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<MyActivity>}.
   */
  @Override
  public MyActivity get() {
    MyActivity result = new MyActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<MyActivity>}.
   */
  @Override
  public void injectMembers(MyActivity object) {
    object.ffmpeg = ffmpeg.get();
  }

}
