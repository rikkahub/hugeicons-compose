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

val HugeIcons.Scooter02: ImageVector
    get() {
        if (_scooter02 != null) {
            return _scooter02!!
        }
        _scooter02 = ImageVector.Builder(
            name = "Scooter02",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 16f)
            curveTo(2f, 12.8182f, 4.23858f, 11f, 7f, 11f)
            curveTo(9.76142f, 11f, 12f, 12.8182f, 12f, 16f)
            horizontalLineTo(2f)
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
            moveTo(5f, 8f)
            horizontalLineTo(9f)
        }

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
            moveTo(10f, 16f)
            curveTo(10f, 17.6569f, 8.65685f, 19f, 7f, 19f)
            curveTo(5.34315f, 19f, 4f, 17.6569f, 4f, 16f)
        }

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
            moveTo(22f, 17f)
            arcTo(2f, 2f, 0f, true, false, 18f, 17f)
            arcTo(2f, 2f, 0f, true, false, 22f, 17f)
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
            moveTo(16f, 8f)
            curveTo(17.3333f, 8.63768f, 20f, 11.1739f, 20f, 15f)
            moveTo(15.9899f, 5f)
            horizontalLineTo(16.5366f)
            curveTo(17.5214f, 5f, 18.4246f, 5.57927f, 18.8809f, 6.5034f)
            curveTo(19.1964f, 7.14264f, 18.8809f, 8f, 17.9849f, 8f)
            horizontalLineTo(15.9899f)
            moveTo(15.9899f, 5f)
            verticalLineTo(8f)
            moveTo(15.9899f, 5f)
            horizontalLineTo(12.9444f)
            moveTo(15.9899f, 8f)
            curveTo(15.9899f, 9.91304f, 15.7776f, 16f, 12f, 16f)
            horizontalLineTo(17.6665f)
        }
        }.build()

        return _scooter02!!
    }

private var _scooter02: ImageVector? = null
