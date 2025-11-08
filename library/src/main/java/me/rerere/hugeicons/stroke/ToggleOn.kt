package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ToggleOn: ImageVector
    get() {
        if (_toggleOn != null) {
            return _toggleOn!!
        }
        _toggleOn = ImageVector.Builder(
            name = "ToggleOn",
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
        moveTo(19f, 12f)
        curveTo(19f, 13.6569f, 17.6569f, 15f, 16f, 15f)
        curveTo(14.3431f, 15f, 13f, 13.6569f, 13f, 12f)
        curveTo(13f, 10.3431f, 14.3431f, 9f, 16f, 9f)
        curveTo(17.6569f, 9f, 19f, 10.3431f, 19f, 12f)
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

        return _toggleOn!!
    }

private var _toggleOn: ImageVector? = null
