package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Astronaut01: ImageVector
    get() {
        if (_astronaut01 != null) {
            return _astronaut01!!
        }
        _astronaut01 = ImageVector.Builder(
            name = "Astronaut01",
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
        moveTo(17.6573f, 18f)
        curveTo(19.6963f, 16.35f, 21f, 13.8273f, 21f, 11f)
        curveTo(21f, 6.02944f, 16.9706f, 2f, 12f, 2f)
        curveTo(7.02944f, 2f, 3f, 6.02944f, 3f, 11f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4998f, 17.5f)
        lineTo(14.1211f, 13.1213f)
        moveTo(17.9998f, 5f)
        lineTo(14.1211f, 8.87868f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18f)
        horizontalLineTo(5f)
        curveTo(4.05719f, 18f, 3.58579f, 18f, 3.29289f, 18.2929f)
        curveTo(3f, 18.5858f, 3f, 19.0572f, 3f, 20f)
        curveTo(3f, 20.9428f, 3f, 21.4142f, 3.29289f, 21.7071f)
        curveTo(3.58579f, 22f, 4.05719f, 22f, 5f, 22f)
        horizontalLineTo(20f)
        curveTo(20.5523f, 22f, 21f, 21.5523f, 21f, 21f)
        curveTo(21f, 19.3431f, 19.6569f, 18f, 18f, 18f)
        }
        }.build()

        return _astronaut01!!
    }

private var _astronaut01: ImageVector? = null
