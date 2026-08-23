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

val HugeIcons.Dot: ImageVector
    get() {
        if (_dot != null) {
            return _dot!!
        }
        _dot = ImageVector.Builder(
            name = "Dot",
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
            moveTo(12f, 11.5f)
            verticalLineTo(12f)
            moveTo(13f, 12f)
            curveTo(13f, 12.5523f, 12.5523f, 13f, 12f, 13f)
            curveTo(11.4477f, 13f, 11f, 12.5523f, 11f, 12f)
            curveTo(11f, 11.4477f, 11.4477f, 11f, 12f, 11f)
            curveTo(12.5523f, 11f, 13f, 11.4477f, 13f, 12f)
            close()
        }
        }.build()

        return _dot!!
    }

private var _dot: ImageVector? = null
