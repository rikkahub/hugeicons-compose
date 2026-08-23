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

val HugeIcons.BookHeadphones: ImageVector
    get() {
        if (_bookHeadphones != null) {
            return _bookHeadphones!!
        }
        _bookHeadphones = ImageVector.Builder(
            name = "BookHeadphones",
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
            moveTo(11f, 8f)
            verticalLineTo(6.5f)
            curveTo(11f, 4.01472f, 13.0147f, 2f, 15.5f, 2f)
            curveTo(17.9853f, 2f, 20f, 4.01472f, 20f, 6.5f)
            verticalLineTo(8f)
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
            moveTo(11f, 7.5f)
            verticalLineTo(9.5f)
            curveTo(11f, 9.77614f, 11.2239f, 10f, 11.5f, 10f)
            horizontalLineTo(12f)
            curveTo(12.2761f, 10f, 12.5f, 9.77614f, 12.5f, 9.5f)
            verticalLineTo(8f)
            curveTo(12.5f, 7.72386f, 12.2761f, 7.5f, 12f, 7.5f)
            horizontalLineTo(11f)
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
            moveTo(20f, 7.5f)
            verticalLineTo(9.5f)
            curveTo(20f, 9.77614f, 19.7761f, 10f, 19.5f, 10f)
            horizontalLineTo(19f)
            curveTo(18.7239f, 10f, 18.5f, 9.77614f, 18.5f, 9.5f)
            verticalLineTo(8f)
            curveTo(18.5f, 7.72386f, 18.7239f, 7.5f, 19f, 7.5f)
            horizontalLineTo(20f)
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
            moveTo(8f, 2.01758f)
            curveTo(6.44655f, 2.06438f, 5.51998f, 2.23763f, 4.87868f, 2.87893f)
            curveTo(4f, 3.75761f, 4f, 5.17183f, 4f, 8.00025f)
            verticalLineTo(20.0003f)
            moveTo(20f, 22.0003f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22.0003f, 4f, 21.1048f, 4f, 20.0003f)
            moveTo(4f, 20.0003f)
            curveTo(4f, 18.8957f, 4.89543f, 18.0003f, 6f, 18.0003f)
            horizontalLineTo(20f)
            verticalLineTo(14.0005f)
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }
        }.build()

        return _bookHeadphones!!
    }

private var _bookHeadphones: ImageVector? = null
