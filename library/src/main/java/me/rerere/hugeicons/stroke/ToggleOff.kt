package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ToggleOff: ImageVector
    get() {
        if (_toggleOff != null) {
            return _toggleOff!!
        }
        _toggleOff = ImageVector.Builder(
            name = "ToggleOff",
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
        moveTo(11f, 12f)
        curveTo(11f, 13.6569f, 9.65685f, 15f, 8f, 15f)
        curveTo(6.34315f, 15f, 5f, 13.6569f, 5f, 12f)
        curveTo(5f, 10.3431f, 6.34315f, 9f, 8f, 9f)
        curveTo(9.65685f, 9f, 11f, 10.3431f, 11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        horizontalLineTo(8f)
        curveTo(4.68629f, 6f, 2f, 8.68629f, 2f, 12f)
        curveTo(2f, 15.3137f, 4.68629f, 18f, 8f, 18f)
        horizontalLineTo(16f)
        curveTo(19.3137f, 18f, 22f, 15.3137f, 22f, 12f)
        curveTo(22f, 8.68629f, 19.3137f, 6f, 16f, 6f)
        }
        }.build()

        return _toggleOff!!
    }

private var _toggleOff: ImageVector? = null
