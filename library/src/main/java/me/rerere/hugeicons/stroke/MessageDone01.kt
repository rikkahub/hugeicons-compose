package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageDone01: ImageVector
    get() {
        if (_messageDone01 != null) {
            return _messageDone01!!
        }
        _messageDone01 = ImageVector.Builder(
            name = "MessageDone01",
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
        moveTo(11.5f, 3.00366f)
        curveTo(10.9383f, 3.01202f, 10.3789f, 3.03449f, 9.8294f, 3.07102f)
        curveTo(5.64639f, 3.34908f, 2.31441f, 6.72832f, 2.04024f, 10.9707f)
        curveTo(1.98659f, 11.8009f, 1.98659f, 12.6606f, 2.04024f, 13.4908f)
        curveTo(2.1401f, 15.0359f, 2.82343f, 16.4665f, 3.62791f, 17.6746f)
        curveTo(4.09501f, 18.5203f, 3.78674f, 19.5758f, 3.30021f, 20.4978f)
        curveTo(2.94941f, 21.1625f, 2.77401f, 21.4949f, 2.91484f, 21.735f)
        curveTo(3.05568f, 21.9752f, 3.37026f, 21.9828f, 3.99943f, 21.9981f)
        curveTo(5.24367f, 22.0284f, 6.08268f, 21.6757f, 6.74868f, 21.1846f)
        curveTo(7.1264f, 20.906f, 7.31527f, 20.7668f, 7.44544f, 20.7508f)
        curveTo(7.5756f, 20.7347f, 7.83177f, 20.8403f, 8.34401f, 21.0512f)
        curveTo(8.8044f, 21.2408f, 9.33896f, 21.3579f, 9.8294f, 21.3905f)
        curveTo(11.2536f, 21.4851f, 12.7435f, 21.4853f, 14.1706f, 21.3905f)
        curveTo(18.3536f, 21.1124f, 21.6856f, 17.7332f, 21.9598f, 13.4908f)
        curveTo(22.0134f, 12.6606f, 22.0134f, 11.8009f, 21.9598f, 10.9707f)
        curveTo(21.9038f, 10.1048f, 21.7205f, 9.27487f, 21.4285f, 8.49994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 6f)
        curveTo(14f, 6f, 15f, 6f, 16f, 8f)
        curveTo(16f, 8f, 19.1765f, 3f, 22f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 15f)
        horizontalLineTo(15.5f)
        moveTo(8.5f, 10f)
        horizontalLineTo(12f)
        }
        }.build()

        return _messageDone01!!
    }

private var _messageDone01: ImageVector? = null
