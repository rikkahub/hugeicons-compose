package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SignalMedium02: ImageVector
    get() {
        if (_signalMedium02 != null) {
            return _signalMedium02!!
        }
        _signalMedium02 = ImageVector.Builder(
            name = "SignalMedium02",
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
        moveTo(21f, 19f)
        lineTo(18f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        verticalLineTo(16f)
        curveTo(7f, 15.0572f, 7f, 14.5858f, 6.70711f, 14.2929f)
        curveTo(6.41421f, 14f, 5.94281f, 14f, 5f, 14f)
        curveTo(4.05719f, 14f, 3.58579f, 14f, 3.29289f, 14.2929f)
        curveTo(3f, 14.5858f, 3f, 15.0572f, 3f, 16f)
        verticalLineTo(17f)
        curveTo(3f, 17.9428f, 3f, 18.4142f, 3.29289f, 18.7071f)
        curveTo(3.58579f, 19f, 4.05719f, 19f, 5f, 19f)
        curveTo(5.94281f, 19f, 6.41421f, 19f, 6.70711f, 18.7071f)
        curveTo(7f, 18.4142f, 7f, 17.9428f, 7f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        verticalLineTo(12f)
        curveTo(14f, 11.0572f, 14f, 10.5858f, 13.7071f, 10.2929f)
        curveTo(13.4142f, 10f, 12.9428f, 10f, 12f, 10f)
        curveTo(11.0572f, 10f, 10.5858f, 10f, 10.2929f, 10.2929f)
        curveTo(10f, 10.5858f, 10f, 11.0572f, 10f, 12f)
        verticalLineTo(17f)
        curveTo(10f, 17.9428f, 10f, 18.4142f, 10.2929f, 18.7071f)
        curveTo(10.5858f, 19f, 11.0572f, 19f, 12f, 19f)
        curveTo(12.9428f, 19f, 13.4142f, 19f, 13.7071f, 18.7071f)
        curveTo(14f, 18.4142f, 14f, 17.9428f, 14f, 17f)
        }
        }.build()

        return _signalMedium02!!
    }

private var _signalMedium02: ImageVector? = null
