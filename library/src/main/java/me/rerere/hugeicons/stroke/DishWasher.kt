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

val HugeIcons.DishWasher: ImageVector
    get() {
        if (_dishWasher != null) {
            return _dishWasher!!
        }
        _dishWasher = ImageVector.Builder(
            name = "DishWasher",
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
            moveTo(14.5f, 2.5f)
            horizontalLineTo(9.5f)
            curveTo(6.20017f, 2.5f, 4.55025f, 2.5f, 3.52513f, 3.52513f)
            curveTo(2.5f, 4.55025f, 2.5f, 6.20017f, 2.5f, 9.5f)
            verticalLineTo(14.5f)
            curveTo(2.5f, 17.7998f, 2.5f, 19.4497f, 3.52513f, 20.4749f)
            curveTo(4.55025f, 21.5f, 6.20017f, 21.5f, 9.5f, 21.5f)
            horizontalLineTo(14.5f)
            curveTo(17.7998f, 21.5f, 19.4497f, 21.5f, 20.4749f, 20.4749f)
            curveTo(21.5f, 19.4497f, 21.5f, 17.7998f, 21.5f, 14.5f)
            verticalLineTo(9.5f)
            curveTo(21.5f, 6.20017f, 21.5f, 4.55025f, 20.4749f, 3.52513f)
            curveTo(19.4497f, 2.5f, 17.7998f, 2.5f, 14.5f, 2.5f)
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
            moveTo(2.5f, 8.5f)
            horizontalLineTo(21.5f)
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
            moveTo(6f, 5.5f)
            horizontalLineTo(10f)
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
            moveTo(14.5f, 18.5f)
            curveTo(16.433f, 18.5f, 18f, 16.933f, 18f, 15f)
            curveTo(18f, 13.067f, 16.433f, 11.5f, 14.5f, 11.5f)
            curveTo(12.567f, 11.5f, 11f, 13.067f, 11f, 15f)
            curveTo(11f, 16.933f, 12.567f, 18.5f, 14.5f, 18.5f)
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
            moveTo(12f, 12.5505f)
            curveTo(11.3647f, 11.9022f, 10.4793f, 11.5f, 9.5f, 11.5f)
            curveTo(7.567f, 11.5f, 6f, 13.067f, 6f, 15f)
            curveTo(6f, 16.933f, 7.567f, 18.5f, 9.5f, 18.5f)
            curveTo(10.4793f, 18.5f, 11.3647f, 18.0978f, 12f, 17.4495f)
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
            moveTo(18.125f, 5.5f)
            horizontalLineTo(18f)
            moveTo(18.25f, 5.5f)
            curveTo(18.25f, 5.63807f, 18.1381f, 5.75f, 18f, 5.75f)
            curveTo(17.8619f, 5.75f, 17.75f, 5.63807f, 17.75f, 5.5f)
            curveTo(17.75f, 5.36193f, 17.8619f, 5.25f, 18f, 5.25f)
            curveTo(18.1381f, 5.25f, 18.25f, 5.36193f, 18.25f, 5.5f)
            close()
        }
        }.build()

        return _dishWasher!!
    }

private var _dishWasher: ImageVector? = null
