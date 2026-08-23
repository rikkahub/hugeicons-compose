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

val HugeIcons.HelpSquare: ImageVector
    get() {
        if (_helpSquare != null) {
            return _helpSquare!!
        }
        _helpSquare = ImageVector.Builder(
            name = "HelpSquare",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 12f)
            curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
            curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
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
            moveTo(9.5f, 9.5f)
            curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
            curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
            curveTo(14.5f, 10.3569f, 14.0689f, 11.1131f, 13.4117f, 11.5636f)
            curveTo(12.7283f, 12.0319f, 12f, 12.6716f, 12f, 13.5f)
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
            moveTo(12.125f, 16.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 16.75f)
            curveTo(12.25f, 16.8881f, 12.1381f, 17f, 12f, 17f)
            curveTo(11.8619f, 17f, 11.75f, 16.8881f, 11.75f, 16.75f)
            curveTo(11.75f, 16.6119f, 11.8619f, 16.5f, 12f, 16.5f)
            curveTo(12.1381f, 16.5f, 12.25f, 16.6119f, 12.25f, 16.75f)
            close()
        }
        }.build()

        return _helpSquare!!
    }

private var _helpSquare: ImageVector? = null
