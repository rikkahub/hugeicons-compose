package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareKanban: ImageVector
    get() {
        if (_squareKanban != null) {
            return _squareKanban!!
        }
        _squareKanban = ImageVector.Builder(
            name = "SquareKanban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 21f)
            curveTo(15.7419f, 21f, 17.6168f, 21f, 18.9311f, 20.0451f)
            curveTo(19.3556f, 19.7367f, 19.7289f, 19.3634f, 20.0373f, 18.9389f)
            curveTo(20.9922f, 17.6246f, 20.9922f, 15.7497f, 20.9922f, 12f)
            curveTo(20.9922f, 8.25027f, 20.9922f, 6.3754f, 20.0373f, 5.06107f)
            curveTo(19.7289f, 4.6366f, 19.3556f, 4.26331f, 18.9311f, 3.95491f)
            curveTo(17.6168f, 3f, 15.7419f, 3f, 11.9922f, 3f)
            curveTo(8.24246f, 3f, 6.36759f, 3f, 5.05326f, 3.95491f)
            curveTo(4.62879f, 4.26331f, 4.2555f, 4.6366f, 3.9471f, 5.06107f)
            curveTo(2.99219f, 6.3754f, 2.99219f, 8.25027f, 2.99219f, 12f)
            curveTo(2.99219f, 15.7497f, 2.99219f, 17.6246f, 3.9471f, 18.9389f)
            curveTo(4.2555f, 19.3634f, 4.62879f, 19.7367f, 5.05326f, 20.0451f)
            curveTo(6.36759f, 21f, 8.24246f, 21f, 11.9922f, 21f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 7f)
            verticalLineTo(11f)
            moveTo(16.9922f, 7f)
            verticalLineTo(17f)
            moveTo(6.99219f, 7f)
            verticalLineTo(14f)
        }
        }.build()

        return _squareKanban!!
    }

private var _squareKanban: ImageVector? = null
