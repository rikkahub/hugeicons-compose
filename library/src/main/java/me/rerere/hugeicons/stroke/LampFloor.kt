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

val HugeIcons.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) {
            return _lampFloor!!
        }
        _lampFloor = ImageVector.Builder(
            name = "LampFloor",
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
            moveTo(12.0055f, 10.5f)
            curveTo(12.0055f, 14.4052f, 12.0055f, 15.5948f, 12.0055f, 19.5f)
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
            moveTo(8.00549f, 22f)
            horizontalLineTo(16.0055f)
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
            moveTo(15.0055f, 10.5049f)
            verticalLineTo(13f)
        }

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
            moveTo(15.6743f, 3.98858f)
            lineTo(16.5696f, 6.48858f)
            curveTo(17.2233f, 8.31426f, 17.5502f, 9.2271f, 17.1021f, 9.86355f)
            curveTo(16.654f, 10.5f, 15.6844f, 10.5f, 13.7452f, 10.5f)
            horizontalLineTo(10.2383f)
            curveTo(8.31066f, 10.5f, 7.34683f, 10.5f, 6.89845f, 9.86744f)
            curveTo(6.45006f, 9.23489f, 6.76923f, 8.32544f, 7.40757f, 6.50656f)
            lineTo(8.28494f, 4.00656f)
            curveTo(8.62514f, 3.0372f, 8.79523f, 2.55252f, 9.18496f, 2.27626f)
            curveTo(9.5747f, 2f, 10.0884f, 2f, 11.1157f, 2f)
            horizontalLineTo(12.8499f)
            curveTo(13.8707f, 2f, 14.3811f, 2f, 14.7696f, 2.27351f)
            curveTo(15.1581f, 2.54702f, 15.3301f, 3.02754f, 15.6743f, 3.98858f)
            close()
        }
        }.build()

        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
