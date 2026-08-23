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

val HugeIcons.BookOpenCheck: ImageVector
    get() {
        if (_bookOpenCheck != null) {
            return _bookOpenCheck!!
        }
        _bookOpenCheck = ImageVector.Builder(
            name = "BookOpenCheck",
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
            moveTo(7.99978f, 3f)
            horizontalLineTo(6.60021f)
            curveTo(4.43183f, 3f, 3.34764f, 3f, 2.67399f, 3.67362f)
            curveTo(2.00034f, 4.34724f, 2.00029f, 5.43144f, 2.00021f, 7.59982f)
            lineTo(2f, 12.8998f)
            curveTo(1.99992f, 15.0684f, 1.99987f, 16.1526f, 2.67353f, 16.8263f)
            curveTo(3.34719f, 17.5f, 4.43146f, 17.5f, 6.6f, 17.5f)
            horizontalLineTo(8.95042f)
            curveTo(10.4329f, 17.5f, 11.7092f, 18.5464f, 11.9999f, 20f)
            verticalLineTo(5f)
            curveTo(11.0556f, 3.74097f, 9.99989f, 3f, 7.99978f, 3f)
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
            moveTo(12f, 20f)
            verticalLineTo(5f)
            curveTo(12.9443f, 3.74097f, 14f, 3f, 16.0001f, 3f)
            horizontalLineTo(17.3997f)
            curveTo(19.5681f, 3f, 20.6523f, 3f, 21.3259f, 3.67362f)
            curveTo(21.9996f, 4.34724f, 21.9996f, 5.43144f, 21.9997f, 7.59982f)
            lineTo(22f, 13f)
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
            moveTo(15.5f, 19f)
            curveTo(15.5f, 19f, 16.5f, 19.5f, 17.125f, 21f)
            curveTo(17.125f, 21f, 19.7059f, 17.25f, 22f, 16.5f)
        }
        }.build()

        return _bookOpenCheck!!
    }

private var _bookOpenCheck: ImageVector? = null
