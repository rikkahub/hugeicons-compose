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

val HugeIcons.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = ImageVector.Builder(
            name = "BookHeart",
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
            moveTo(20f, 22f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(6f)
            curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
            curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
            curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
            verticalLineTo(20f)
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
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
            moveTo(11.3643f, 13.2808f)
            curveTo(10.2358f, 12.4121f, 8f, 10.4261f, 8f, 8.63887f)
            curveTo(8f, 7.45761f, 8.84211f, 6.5f, 10f, 6.5f)
            curveTo(10.6f, 6.5f, 11.2f, 6.70588f, 12f, 7.5294f)
            curveTo(12.8f, 6.70588f, 13.4f, 6.5f, 14f, 6.5f)
            curveTo(15.1579f, 6.5f, 16f, 7.45761f, 16f, 8.63887f)
            curveTo(16f, 10.4261f, 13.7642f, 12.4121f, 12.6357f, 13.2808f)
            curveTo(12.256f, 13.5731f, 11.744f, 13.5731f, 11.3643f, 13.2808f)
            close()
        }
        }.build()

        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
