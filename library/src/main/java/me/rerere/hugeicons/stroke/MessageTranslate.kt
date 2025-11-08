package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageTranslate: ImageVector
    get() {
        if (_messageTranslate != null) {
            return _messageTranslate!!
        }
        _messageTranslate = ImageVector.Builder(
            name = "MessageTranslate",
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
        moveTo(8f, 9.24138f)
        horizontalLineTo(12f)
        moveTo(16f, 9.24138f)
        horizontalLineTo(14.5714f)
        moveTo(12f, 9.24138f)
        horizontalLineTo(14.5714f)
        moveTo(12f, 9.24138f)
        verticalLineTo(8f)
        moveTo(14.5714f, 9.24138f)
        curveTo(14.1025f, 10.939f, 13.1207f, 12.5439f, 12f, 13.9542f)
        moveTo(9.14286f, 17f)
        curveTo(10.0488f, 16.1565f, 11.072f, 15.122f, 12f, 13.9542f)
        moveTo(12f, 13.9542f)
        curveTo(11.4286f, 13.2759f, 10.6286f, 12.1784f, 10.4f, 11.6818f)
        moveTo(12f, 13.9542f)
        lineTo(13.7143f, 15.7586f)
        }
        }.build()

        return _messageTranslate!!
    }

private var _messageTranslate: ImageVector? = null
