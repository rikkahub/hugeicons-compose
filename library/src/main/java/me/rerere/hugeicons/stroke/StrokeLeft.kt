package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeLeft: ImageVector
    get() {
        if (_strokeLeft != null) {
            return _strokeLeft!!
        }
        _strokeLeft = ImageVector.Builder(
            name = "StrokeLeft",
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
        moveTo(7f, 5f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 5f, 19.2426f, 5f, 20.1213f, 5.87868f)
        curveTo(21f, 6.75736f, 21f, 8.17157f, 21f, 11f)
        verticalLineTo(13f)
        curveTo(21f, 15.8284f, 21f, 17.2426f, 20.1213f, 18.1213f)
        curveTo(19.2426f, 19f, 17.8284f, 19f, 15f, 19f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        verticalLineTo(21f)
        }
        }.build()

        return _strokeLeft!!
    }

private var _strokeLeft: ImageVector? = null
