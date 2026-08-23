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

val HugeIcons.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) {
            return _bookCopy!!
        }
        _bookCopy = ImageVector.Builder(
            name = "BookCopy",
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
            moveTo(21f, 16f)
            horizontalLineTo(11f)
            curveTo(9.89543f, 16f, 9f, 15.1046f, 9f, 14f)
            moveTo(9f, 14f)
            curveTo(9f, 12.8954f, 9.89543f, 12f, 11f, 12f)
            horizontalLineTo(21f)
            verticalLineTo(5f)
            curveTo(21f, 3.58579f, 21f, 2.87868f, 20.5607f, 2.43934f)
            curveTo(20.1213f, 2f, 19.4142f, 2f, 18f, 2f)
            horizontalLineTo(11f)
            curveTo(9.89543f, 2f, 9f, 2.89543f, 9f, 4f)
            verticalLineTo(14f)
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
            moveTo(20.5f, 12f)
            curveTo(20.5f, 12f, 19.5f, 12.7628f, 19.5f, 14f)
            curveTo(19.5f, 15.2372f, 20.5f, 16f, 20.5f, 16f)
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
            moveTo(13.5f, 20f)
            curveTo(13.5f, 21.2372f, 14.5f, 22f, 14.5f, 22f)
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
            moveTo(15f, 22f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 22f, 3f, 21.1046f, 3f, 20f)
            moveTo(7f, 18f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 18f, 3f, 18.8954f, 3f, 20f)
            moveTo(3f, 20f)
            verticalLineTo(10f)
            curveTo(3f, 8.89543f, 3.89543f, 8f, 5f, 8f)
        }
        }.build()

        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
