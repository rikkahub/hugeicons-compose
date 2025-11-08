package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notification02: ImageVector
    get() {
        if (_notification02 != null) {
            return _notification02!!
        }
        _notification02 = ImageVector.Builder(
            name = "Notification02",
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
        moveTo(19f, 18f)
        verticalLineTo(9.5f)
        curveTo(19f, 5.63401f, 15.866f, 2.5f, 12f, 2.5f)
        curveTo(8.13401f, 2.5f, 5f, 5.63401f, 5f, 9.5f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 18f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 20f)
        curveTo(13.5f, 20.8284f, 12.8284f, 21.5f, 12f, 21.5f)
        moveTo(10.5f, 20f)
        curveTo(10.5f, 20.8284f, 11.1716f, 21.5f, 12f, 21.5f)
        moveTo(12f, 21.5f)
        verticalLineTo(20f)
        }
        }.build()

        return _notification02!!
    }

private var _notification02: ImageVector? = null
