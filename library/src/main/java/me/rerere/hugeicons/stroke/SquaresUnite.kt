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

val HugeIcons.SquaresUnite: ImageVector
    get() {
        if (_squaresUnite != null) {
            return _squaresUnite!!
        }
        _squaresUnite = ImageVector.Builder(
            name = "SquaresUnite",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3.30997f, 14.2364f)
            curveTo(4.26748f, 15f, 5.67572f, 15f, 8.49219f, 15f)
            curveTo(8.76833f, 15f, 8.99219f, 15.2239f, 8.99219f, 15.5f)
            curveTo(8.99219f, 18.3165f, 8.99219f, 19.7247f, 9.75578f, 20.6822f)
            curveTo(9.91918f, 20.8871f, 10.1051f, 21.073f, 10.31f, 21.2364f)
            curveTo(11.2675f, 22f, 12.6757f, 22f, 15.4922f, 22f)
            curveTo(18.3087f, 22f, 19.7169f, 22f, 20.6744f, 21.2364f)
            curveTo(20.8793f, 21.073f, 21.0652f, 20.8871f, 21.2286f, 20.6822f)
            curveTo(21.9922f, 19.7247f, 21.9922f, 18.3165f, 21.9922f, 15.5f)
            curveTo(21.9922f, 12.6835f, 21.9922f, 11.2753f, 21.2286f, 10.3178f)
            curveTo(21.0652f, 10.1129f, 20.8793f, 9.92699f, 20.6744f, 9.76359f)
            curveTo(19.7169f, 9f, 18.3087f, 9f, 15.4922f, 9f)
            curveTo(15.216f, 9f, 14.9922f, 8.77614f, 14.9922f, 8.5f)
            curveTo(14.9922f, 5.68353f, 14.9922f, 4.2753f, 14.2286f, 3.31779f)
            curveTo(14.0652f, 3.11289f, 13.8793f, 2.92699f, 13.6744f, 2.76359f)
            curveTo(12.7169f, 2f, 11.3087f, 2f, 8.49219f, 2f)
            curveTo(5.67572f, 2f, 4.26748f, 2f, 3.30997f, 2.76359f)
            curveTo(3.10508f, 2.92699f, 2.91918f, 3.11289f, 2.75578f, 3.31779f)
            curveTo(1.99219f, 4.2753f, 1.99219f, 5.68353f, 1.99219f, 8.5f)
            curveTo(1.99219f, 11.3165f, 1.99219f, 12.7247f, 2.75578f, 13.6822f)
            curveTo(2.91918f, 13.8871f, 3.10508f, 14.073f, 3.30997f, 14.2364f)
            close()
        }
        }.build()

        return _squaresUnite!!
    }

private var _squaresUnite: ImageVector? = null
