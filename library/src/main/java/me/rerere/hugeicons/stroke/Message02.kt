package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Message02: ImageVector
    get() {
        if (_message02 != null) {
            return _message02!!
        }
        _message02 = ImageVector.Builder(
            name = "Message02",
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
        moveTo(14.1706f, 20.8905f)
        curveTo(18.3536f, 20.6125f, 21.6856f, 17.2332f, 21.9598f, 12.9909f)
        curveTo(22.0134f, 12.1607f, 22.0134f, 11.3009f, 21.9598f, 10.4707f)
        curveTo(21.6856f, 6.22838f, 18.3536f, 2.84913f, 14.1706f, 2.57107f)
        curveTo(12.7435f, 2.47621f, 11.2536f, 2.47641f, 9.8294f, 2.57107f)
        curveTo(5.64639f, 2.84913f, 2.31441f, 6.22838f, 2.04024f, 10.4707f)
        curveTo(1.98659f, 11.3009f, 1.98659f, 12.1607f, 2.04024f, 12.9909f)
        curveTo(2.1401f, 14.536f, 2.82343f, 15.9666f, 3.62791f, 17.1746f)
        curveTo(4.09501f, 18.0203f, 3.78674f, 19.0758f, 3.30021f, 19.9978f)
        curveTo(2.94941f, 20.6626f, 2.77401f, 20.995f, 2.91484f, 21.2351f)
        curveTo(3.05568f, 21.4752f, 3.37026f, 21.4829f, 3.99943f, 21.4982f)
        curveTo(5.24367f, 21.5285f, 6.08268f, 21.1757f, 6.74868f, 20.6846f)
        curveTo(7.1264f, 20.4061f, 7.31527f, 20.2668f, 7.44544f, 20.2508f)
        curveTo(7.5756f, 20.2348f, 7.83177f, 20.3403f, 8.34401f, 20.5513f)
        curveTo(8.8044f, 20.7409f, 9.33896f, 20.8579f, 9.8294f, 20.8905f)
        curveTo(11.2536f, 20.9852f, 12.7435f, 20.9854f, 14.1706f, 20.8905f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9953f, 12f)
        horizontalLineTo(12.0043f)
        moveTo(15.9908f, 12f)
        horizontalLineTo(15.9998f)
        moveTo(7.99982f, 12f)
        horizontalLineTo(8.00879f)
        }
        }.build()

        return _message02!!
    }

private var _message02: ImageVector? = null
