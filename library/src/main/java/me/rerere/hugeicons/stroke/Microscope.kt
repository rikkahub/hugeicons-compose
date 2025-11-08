package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = ImageVector.Builder(
            name = "Microscope",
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
        moveTo(4f, 21.5f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 9.5f)
        curveTo(12.5f, 10.3284f, 11.8284f, 11f, 11f, 11f)
        curveTo(10.1716f, 11f, 9.5f, 10.3284f, 9.5f, 9.5f)
        curveTo(9.5f, 8.67157f, 10.1716f, 8f, 11f, 8f)
        curveTo(11.8284f, 8f, 12.5f, 8.67157f, 12.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.5f)
        horizontalLineTo(12.5f)
        moveTo(9.5f, 9.5f)
        curveTo(7.01472f, 9.5f, 5f, 11.5147f, 5f, 14f)
        curveTo(5f, 16.4853f, 7.01472f, 18.5f, 9.5f, 18.5f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 21.5f)
        lineTo(12.2279f, 17.6838f)
        curveTo(12.0918f, 17.2754f, 11.7097f, 17f, 11.2792f, 17f)
        horizontalLineTo(11.2208f)
        curveTo(10.7903f, 17f, 10.4082f, 17.2754f, 10.2721f, 17.6838f)
        lineTo(9f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8023f, 15.5f)
        lineTo(18f, 14.2282f)
        moveTo(10.3859f, 8.13107f)
        lineTo(9.34041f, 6.31596f)
        curveTo(8.63965f, 5.09933f, 9.05551f, 3.54364f, 10.2693f, 2.84121f)
        curveTo(11.483f, 2.13879f, 13.035f, 2.55564f, 13.7358f, 3.77227f)
        lineTo(16.7809f, 9.05924f)
        curveTo(17.2553f, 9.88279f, 17.4925f, 10.2946f, 17.4925f, 10.7035f)
        curveTo(17.4925f, 10.9714f, 17.4221f, 11.2346f, 17.2885f, 11.4666f)
        curveTo(17.0845f, 11.8208f, 16.6737f, 12.0585f, 15.8521f, 12.534f)
        curveTo(15.0305f, 13.0095f, 14.6197f, 13.2472f, 14.2117f, 13.2472f)
        curveTo(13.9445f, 13.2472f, 13.6819f, 13.1767f, 13.4504f, 13.0427f)
        curveTo(13.0971f, 12.8383f, 12.8599f, 12.4265f, 12.3856f, 11.6029f)
        lineTo(11.8758f, 10.7179f)
        }
        }.build()

        return _microscope!!
    }

private var _microscope: ImageVector? = null
