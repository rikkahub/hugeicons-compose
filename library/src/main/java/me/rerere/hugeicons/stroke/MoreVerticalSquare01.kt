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

val HugeIcons.MoreVerticalSquare01: ImageVector
    get() {
        if (_moreVerticalSquare01 != null) {
            return _moreVerticalSquare01!!
        }
        _moreVerticalSquare01 = ImageVector.Builder(
            name = "MoreVerticalSquare01",
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
            moveTo(12f, 5.49999f)
            verticalLineTo(5.99999f)
            moveTo(12f, 17.5f)
            verticalLineTo(18f)
            moveTo(12.5f, 11f)
            lineTo(11.5f, 11f)
            curveTo(11.2239f, 11f, 11f, 11.2239f, 11f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(11f, 12.7761f, 11.2239f, 13f, 11.5f, 13f)
            horizontalLineTo(12.5f)
            curveTo(12.7761f, 13f, 13f, 12.7761f, 13f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(13f, 11.2239f, 12.7761f, 11f, 12.5f, 11f)
            close()
            moveTo(12.5f, 5.00001f)
            lineTo(11.5f, 5f)
            curveTo(11.2239f, 5f, 11f, 5.22386f, 11f, 5.5f)
            verticalLineTo(6.49999f)
            curveTo(11f, 6.77614f, 11.2239f, 6.99999f, 11.5f, 6.99999f)
            horizontalLineTo(12.5f)
            curveTo(12.7761f, 6.99999f, 13f, 6.77614f, 13f, 6.49999f)
            verticalLineTo(5.50001f)
            curveTo(13f, 5.22387f, 12.7761f, 5.00001f, 12.5f, 5.00001f)
            close()
            moveTo(12.5f, 17f)
            lineTo(11.5f, 17f)
            curveTo(11.2239f, 17f, 11f, 17.2239f, 11f, 17.5f)
            verticalLineTo(18.5f)
            curveTo(11f, 18.7761f, 11.2239f, 19f, 11.5f, 19f)
            horizontalLineTo(12.5f)
            curveTo(12.7761f, 19f, 13f, 18.7761f, 13f, 18.5f)
            verticalLineTo(17.5f)
            curveTo(13f, 17.2239f, 12.7761f, 17f, 12.5f, 17f)
            close()
        }
        }.build()

        return _moreVerticalSquare01!!
    }

private var _moreVerticalSquare01: ImageVector? = null
