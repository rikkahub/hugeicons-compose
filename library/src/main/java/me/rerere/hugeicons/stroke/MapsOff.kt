package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapsOff: ImageVector
    get() {
        if (_mapsOff != null) {
            return _mapsOff!!
        }
        _mapsOff = ImageVector.Builder(
            name = "MapsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 4.5f)
        curveTo(3.73931f, 4.94127f, 2.72098f, 5.45609f, 2.27164f, 6.24482f)
        curveTo(2f, 6.72165f, 2f, 7.30232f, 2f, 8.46367f)
        verticalLineTo(16.6283f)
        curveTo(2f, 18.1542f, 2f, 18.9172f, 2.34226f, 19.3418f)
        curveTo(2.57001f, 19.6244f, 2.88916f, 19.8143f, 3.242f, 19.8773f)
        curveTo(3.77226f, 19.9719f, 4.42148f, 19.5953f, 5.71987f, 18.8421f)
        curveTo(6.60156f, 18.3306f, 7.45011f, 17.7994f, 8.50487f, 17.9435f)
        curveTo(8.98466f, 18.009f, 9.44231f, 18.2366f, 10.3576f, 18.6917f)
        lineTo(14.1715f, 20.588f)
        curveTo(14.9964f, 20.9982f, 15.004f, 21f, 15.9214f, 21f)
        horizontalLineTo(18f)
        curveTo(19.1298f, 21f, 19.9211f, 21f, 20.5f, 20.8712f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.9876f)
        verticalLineTo(10.1657f)
        curveTo(22f, 8.22611f, 22f, 7.25631f, 21.4142f, 6.65374f)
        curveTo(20.8284f, 6.05118f, 19.8856f, 6.05118f, 18f, 6.05118f)
        horizontalLineTo(15.9214f)
        curveTo(15.004f, 6.05118f, 14.9964f, 6.0494f, 14.1715f, 5.63658f)
        lineTo(10.8399f, 3.96938f)
        curveTo(9.44885f, 3.2733f, 8.75329f, 2.92523f, 8.01236f, 2.94942f)
        curveTo(7.64015f, 2.96157f, 7.28518f, 3.06672f, 6.85352f, 3.26792f)
        moveTo(15f, 5.99585f)
        verticalLineTo(11.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9998f, 15.0093f)
        verticalLineTo(20.9379f)
        moveTo(8.01953f, 8.14258f)
        lineTo(8.01953f, 17.9197f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _mapsOff!!
    }

private var _mapsOff: ImageVector? = null
