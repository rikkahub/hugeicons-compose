package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignBoxBottomLeft: ImageVector
    get() {
        if (_alignBoxBottomLeft != null) {
            return _alignBoxBottomLeft!!
        }
        _alignBoxBottomLeft = ImageVector.Builder(
            name = "AlignBoxBottomLeft",
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
        moveTo(3f, 11f)
        curveTo(3f, 7.25027f, 3f, 5.3754f, 3.95491f, 4.06107f)
        curveTo(4.26331f, 3.6366f, 4.6366f, 3.26331f, 5.06107f, 2.95491f)
        curveTo(6.3754f, 2f, 8.25027f, 2f, 12f, 2f)
        curveTo(15.7497f, 2f, 17.6246f, 2f, 18.9389f, 2.95491f)
        curveTo(19.3634f, 3.26331f, 19.7367f, 3.6366f, 20.0451f, 4.06107f)
        curveTo(21f, 5.3754f, 21f, 7.25027f, 21f, 11f)
        verticalLineTo(13f)
        curveTo(21f, 16.7497f, 21f, 18.6246f, 20.0451f, 19.9389f)
        curveTo(19.7367f, 20.3634f, 19.3634f, 20.7367f, 18.9389f, 21.0451f)
        curveTo(17.6246f, 22f, 15.7497f, 22f, 12f, 22f)
        curveTo(8.25027f, 22f, 6.3754f, 22f, 5.06107f, 21.0451f)
        curveTo(4.6366f, 20.7367f, 4.26331f, 20.3634f, 3.95491f, 19.9389f)
        curveTo(3f, 18.6246f, 3f, 16.7497f, 3f, 13f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        lineTo(7f, 12f)
        moveTo(10f, 17f)
        horizontalLineTo(7f)
        }
        }.build()

        return _alignBoxBottomLeft!!
    }

private var _alignBoxBottomLeft: ImageVector? = null
