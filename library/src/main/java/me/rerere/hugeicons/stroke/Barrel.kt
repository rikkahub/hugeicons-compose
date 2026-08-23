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

val HugeIcons.Barrel: ImageVector
    get() {
        if (_barrel != null) {
            return _barrel!!
        }
        _barrel = ImageVector.Builder(
            name = "Barrel",
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
            moveTo(14f, 3f)
            curveTo(14.9108f, 5.05228f, 15.5f, 8.31975f, 15.5f, 12f)
            curveTo(15.5f, 15.6803f, 14.9108f, 18.9477f, 14f, 21f)
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
            moveTo(10f, 3f)
            curveTo(9.08916f, 5.05228f, 8.5f, 8.31975f, 8.5f, 12f)
            curveTo(8.5f, 15.6803f, 9.08916f, 18.9477f, 10f, 21f)
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
            moveTo(21f, 12f)
            curveTo(21f, 9.64032f, 20.5156f, 7.45033f, 19.6878f, 5.64155f)
            curveTo(19.2204f, 4.62031f, 18.9867f, 4.10969f, 18.1226f, 3.55485f)
            curveTo(17.2584f, 3f, 16.4568f, 3f, 14.8536f, 3f)
            horizontalLineTo(9.14641f)
            curveTo(7.54318f, 3f, 6.74156f, 3f, 5.87743f, 3.55485f)
            curveTo(5.01331f, 4.10969f, 4.77962f, 4.62031f, 4.31223f, 5.64155f)
            curveTo(3.48442f, 7.45033f, 3f, 9.64032f, 3f, 12f)
            curveTo(3f, 14.3597f, 3.48442f, 16.5497f, 4.31223f, 18.3585f)
            curveTo(4.77962f, 19.3797f, 5.01331f, 19.8903f, 5.87743f, 20.4452f)
            curveTo(6.74156f, 21f, 7.54318f, 21f, 9.14641f, 21f)
            horizontalLineTo(14.8536f)
            curveTo(16.4568f, 21f, 17.2584f, 21f, 18.1226f, 20.4452f)
            curveTo(18.9867f, 19.8903f, 19.2204f, 19.3797f, 19.6878f, 18.3585f)
            curveTo(20.5156f, 16.5497f, 21f, 14.3597f, 21f, 12f)
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
            moveTo(4f, 7f)
            horizontalLineTo(20f)
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
            moveTo(4f, 17f)
            horizontalLineTo(20f)
        }
        }.build()

        return _barrel!!
    }

private var _barrel: ImageVector? = null
