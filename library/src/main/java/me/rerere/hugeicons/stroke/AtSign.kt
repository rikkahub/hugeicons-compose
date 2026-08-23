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

val HugeIcons.AtSign: ImageVector
    get() {
        if (_atSign != null) {
            return _atSign!!
        }
        _atSign = ImageVector.Builder(
            name = "AtSign",
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
            moveTo(12f, 16f)
            curveTo(14.2091f, 16f, 16f, 14.2091f, 16f, 12f)
            curveTo(16f, 9.79086f, 14.2091f, 8f, 12f, 8f)
            curveTo(9.79086f, 8f, 8f, 9.79086f, 8f, 12f)
            curveTo(8f, 14.2091f, 9.79086f, 16f, 12f, 16f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 20.0007f)
            curveTo(16.3287f, 21.2561f, 14.2512f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            verticalLineTo(13f)
            curveTo(22f, 14.6569f, 20.6569f, 16f, 19f, 16f)
            curveTo(17.3431f, 16f, 16f, 14.6569f, 16f, 13f)
            verticalLineTo(8f)
        }
        }.build()

        return _atSign!!
    }

private var _atSign: ImageVector? = null
