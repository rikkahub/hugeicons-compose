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

val HugeIcons.Section: ImageVector
    get() {
        if (_section != null) {
            return _section!!
        }
        _section = ImageVector.Builder(
            name = "Section",
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
            moveTo(16f, 6f)
            curveTo(16f, 4.34315f, 14.2091f, 3f, 12f, 3f)
            curveTo(9.79086f, 3f, 8f, 4.34315f, 8f, 6f)
            curveTo(8f, 7.65685f, 9.93845f, 9f, 12f, 9f)
            curveTo(14.5f, 9f, 16f, 10.3431f, 16f, 12f)
            curveTo(16f, 13.6569f, 14.2091f, 15f, 12f, 15f)
            curveTo(9.79086f, 15f, 8f, 13.6569f, 8f, 12f)
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
            moveTo(16f, 12f)
            curveTo(16f, 10.3431f, 14.2091f, 9f, 12f, 9f)
            curveTo(9.79086f, 9f, 8f, 10.3431f, 8f, 12f)
            curveTo(8f, 13.6569f, 9.93845f, 15f, 12f, 15f)
            curveTo(14.5f, 15f, 16f, 16.3431f, 16f, 18f)
            curveTo(16f, 19.6569f, 14.2091f, 21f, 12f, 21f)
            curveTo(9.79086f, 21f, 8f, 19.6569f, 8f, 18f)
        }
        }.build()

        return _section!!
    }

private var _section: ImageVector? = null
