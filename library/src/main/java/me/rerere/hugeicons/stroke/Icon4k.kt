package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon4k: ImageVector
    get() {
        if (_icon4k != null) {
            return _icon4k!!
        }
        _icon4k = ImageVector.Builder(
            name = "Icon4k",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.25027f, 2f, 6.3754f, 2.95491f, 5.06107f)
        curveTo(3.26331f, 4.6366f, 3.6366f, 4.26331f, 4.06107f, 3.95491f)
        curveTo(5.3754f, 3f, 7.25027f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(16.7497f, 3f, 18.6246f, 3f, 19.9389f, 3.95491f)
        curveTo(20.3634f, 4.26331f, 20.7367f, 4.6366f, 21.0451f, 5.06107f)
        curveTo(22f, 6.3754f, 22f, 8.25027f, 22f, 12f)
        curveTo(22f, 15.7497f, 22f, 17.6246f, 21.0451f, 18.9389f)
        curveTo(20.7367f, 19.3634f, 20.3634f, 19.7367f, 19.9389f, 20.0451f)
        curveTo(18.6246f, 21f, 16.7497f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.25027f, 21f, 5.3754f, 21f, 4.06107f, 20.0451f)
        curveTo(3.6366f, 19.7367f, 3.26331f, 19.3634f, 2.95491f, 18.9389f)
        curveTo(2f, 17.6246f, 2f, 15.7497f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.6364f, 9f)
        verticalLineTo(12f)
        moveTo(10.6364f, 12f)
        verticalLineTo(15f)
        moveTo(10.6364f, 12f)
        horizontalLineTo(8.81818f)
        curveTo(7.96108f, 12f, 7.53253f, 12f, 7.26627f, 11.7071f)
        curveTo(7f, 11.4142f, 7f, 10.9428f, 7f, 10f)
        verticalLineTo(9f)
        moveTo(13.3636f, 15f)
        verticalLineTo(12f)
        moveTo(13.3636f, 12f)
        verticalLineTo(9f)
        moveTo(13.3636f, 12f)
        lineTo(17f, 9f)
        moveTo(13.3636f, 12f)
        lineTo(17f, 15f)
        }
        }.build()

        return _icon4k!!
    }

private var _icon4k: ImageVector? = null
