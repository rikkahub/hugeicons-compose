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

val HugeIcons.MoreHorizontalSquare01: ImageVector
    get() {
        if (_moreHorizontalSquare01 != null) {
            return _moreHorizontalSquare01!!
        }
        _moreHorizontalSquare01 = ImageVector.Builder(
            name = "MoreHorizontalSquare01",
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
            moveTo(18f, 12f)
            verticalLineTo(11.5f)
            moveTo(6f, 11.5f)
            verticalLineTo(12f)
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
            moveTo(18.5f, 11f)
            lineTo(17.5f, 11f)
            curveTo(17.2239f, 11f, 17f, 11.2239f, 17f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(17f, 12.7761f, 17.2239f, 13f, 17.5f, 13f)
            horizontalLineTo(18.5f)
            curveTo(18.7761f, 13f, 19f, 12.7761f, 19f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(19f, 11.2239f, 18.7761f, 11f, 18.5f, 11f)
            close()
            moveTo(6.50001f, 11f)
            lineTo(5.50001f, 11f)
            curveTo(5.22386f, 11f, 5f, 11.2239f, 5f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(5f, 12.7761f, 5.22386f, 13f, 5.5f, 13f)
            horizontalLineTo(6.5f)
            curveTo(6.77614f, 13f, 7f, 12.7761f, 7f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(7f, 11.2239f, 6.77615f, 11f, 6.50001f, 11f)
            close()
        }
        }.build()

        return _moreHorizontalSquare01!!
    }

private var _moreHorizontalSquare01: ImageVector? = null
