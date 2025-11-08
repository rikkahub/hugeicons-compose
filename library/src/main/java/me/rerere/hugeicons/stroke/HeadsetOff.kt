package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) {
            return _headsetOff!!
        }
        _headsetOff = ImageVector.Builder(
            name = "HeadsetOff",
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
        moveTo(2f, 2.00381f)
        lineTo(22f, 21.9589f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13.9769f)
        curveTo(21f, 11.7727f, 19.2091f, 9.98584f, 17f, 9.98584f)
        curveTo(16.2532f, 9.98584f, 15.602f, 10.3942f, 15.2585f, 10.9995f)
        moveTo(15f, 14.9746f)
        verticalLineTo(15.9724f)
        curveTo(15f, 17.0745f, 15.8954f, 17.9679f, 17f, 17.9679f)
        curveTo(17.309f, 17.9679f, 17.6098f, 17.9329f, 17.8987f, 17.8668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.90819f, 10.1366f)
        curveTo(4.22974f, 10.6107f, 3f, 12.1506f, 3f, 13.9772f)
        curveTo(3f, 16.1813f, 4.79086f, 17.9682f, 7f, 17.9682f)
        curveTo(8.10457f, 17.9682f, 9f, 17.0747f, 9f, 15.9727f)
        verticalLineTo(13.2215f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.99116f, 13.9907f)
        curveTo(2.99116f, 12.9804f, 2.35632f, 8.16448f, 5.16685f, 5.15686f)
        moveTo(21.0138f, 16.7063f)
        verticalLineTo(11.1022f)
        curveTo(21.0138f, 10.1123f, 20.9066f, 9.11863f, 20.5958f, 8.17862f)
        curveTo(20.3281f, 7.36912f, 19.9888f, 6.61881f, 19.3344f, 5.69393f)
        curveTo(15.552f, 0.905123f, 10.3682f, 1.58857f, 7.47429f, 3.22249f)
        moveTo(20.3065f, 20.2693f)
        curveTo(19.9571f, 20.8903f, 19.391f, 21.333f, 18.7069f, 21.6167f)
        curveTo(18.0006f, 21.9095f, 17.4337f, 21.9423f, 16.5713f, 21.9901f)
        curveTo(14.9707f, 21.9901f, 13.2333f, 22.0093f, 12.0548f, 21.9901f)
        }
        }.build()

        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
