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

val HugeIcons.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) {
            return _bookSearch!!
        }
        _bookSearch = ImageVector.Builder(
            name = "BookSearch",
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
            moveTo(18.5f, 17.5f)
            lineTo(21f, 20f)
            moveTo(19f, 15f)
            curveTo(19f, 16.6569f, 17.6569f, 18f, 16f, 18f)
            curveTo(14.3431f, 18f, 13f, 16.6569f, 13f, 15f)
            curveTo(13f, 13.3431f, 14.3431f, 12f, 16f, 12f)
            curveTo(17.6569f, 12f, 19f, 13.3431f, 19f, 15f)
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
            moveTo(17f, 22f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 22f, 3f, 21.1046f, 3f, 20f)
            moveTo(10f, 18f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 18f, 3f, 18.8954f, 3f, 20f)
            moveTo(3f, 20f)
            verticalLineTo(8f)
            curveTo(3f, 5.17157f, 3f, 3.75736f, 3.87868f, 2.87868f)
            curveTo(4.75736f, 2f, 6.17157f, 2f, 9f, 2f)
            horizontalLineTo(15f)
            curveTo(16.8856f, 2f, 17.8284f, 2f, 18.4142f, 2.58579f)
            curveTo(19f, 3.17157f, 19f, 4.11438f, 19f, 6f)
            verticalLineTo(9f)
        }
        }.build()

        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
