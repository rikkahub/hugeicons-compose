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

val HugeIcons.BookOpen01: ImageVector
    get() {
        if (_bookOpen01 != null) {
            return _bookOpen01!!
        }
        _bookOpen01 = ImageVector.Builder(
            name = "BookOpen01",
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
            moveTo(7.99978f, 3.5f)
            horizontalLineTo(6.60021f)
            curveTo(4.43183f, 3.5f, 3.34764f, 3.5f, 2.67399f, 4.17362f)
            curveTo(2.00034f, 4.84724f, 2.00029f, 5.93144f, 2.00021f, 8.09982f)
            lineTo(2f, 13.3998f)
            curveTo(1.99992f, 15.5684f, 1.99987f, 16.6526f, 2.67353f, 17.3263f)
            curveTo(3.34719f, 18f, 4.43146f, 18f, 6.6f, 18f)
            horizontalLineTo(8.95042f)
            curveTo(10.4329f, 18f, 11.7092f, 19.0464f, 11.9999f, 20.5f)
            verticalLineTo(5.5f)
            curveTo(11.0556f, 4.24097f, 9.99989f, 3.5f, 7.99978f, 3.5f)
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
            moveTo(16.0001f, 3.5f)
            horizontalLineTo(17.3997f)
            curveTo(19.5681f, 3.5f, 20.6523f, 3.5f, 21.3259f, 4.17362f)
            curveTo(21.9996f, 4.84724f, 21.9996f, 5.93144f, 21.9997f, 8.09982f)
            lineTo(21.9999f, 13.3998f)
            curveTo(22f, 15.5684f, 22f, 16.6526f, 21.3264f, 17.3263f)
            curveTo(20.6527f, 18f, 19.5684f, 18f, 17.3999f, 18f)
            horizontalLineTo(15.0495f)
            curveTo(13.567f, 18f, 12.2907f, 19.0464f, 12f, 20.5f)
            verticalLineTo(5.5f)
            curveTo(12.9443f, 4.24097f, 14f, 3.5f, 16.0001f, 3.5f)
            close()
        }
        }.build()

        return _bookOpen01!!
    }

private var _bookOpen01: ImageVector? = null
