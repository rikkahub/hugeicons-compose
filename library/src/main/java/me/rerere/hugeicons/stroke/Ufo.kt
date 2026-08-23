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

val HugeIcons.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = ImageVector.Builder(
            name = "Ufo",
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
            moveTo(7f, 8f)
            curveTo(4.01099f, 8.5559f, 2f, 9.59492f, 2f, 10.7849f)
            curveTo(2f, 12.5606f, 6.47715f, 14f, 12f, 14f)
            curveTo(17.5228f, 14f, 22f, 12.5606f, 22f, 10.7849f)
            curveTo(22f, 9.59492f, 19.989f, 8.5559f, 17f, 8f)
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
            moveTo(7.32229f, 8.84003f)
            curveTo(6.87335f, 8.21459f, 6.96834f, 7.81402f, 7.15831f, 7.01288f)
            curveTo(7.68534f, 4.79037f, 9.6202f, 3f, 12f, 3f)
            curveTo(14.3798f, 3f, 16.3147f, 4.79037f, 16.8417f, 7.01288f)
            curveTo(17.0317f, 7.81402f, 17.1267f, 8.21459f, 16.6777f, 8.84003f)
            curveTo(15.4532f, 10.546f, 8.31188f, 10.2187f, 7.32229f, 8.84003f)
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
            moveTo(7f, 14f)
            lineTo(5f, 21f)
            moveTo(17f, 14f)
            lineTo(19f, 21f)
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
            moveTo(12.125f, 19f)
            horizontalLineTo(12f)
            moveTo(12.25f, 19f)
            curveTo(12.25f, 19.1381f, 12.1381f, 19.25f, 12f, 19.25f)
            curveTo(11.8619f, 19.25f, 11.75f, 19.1381f, 11.75f, 19f)
            curveTo(11.75f, 18.8619f, 11.8619f, 18.75f, 12f, 18.75f)
            curveTo(12.1381f, 18.75f, 12.25f, 18.8619f, 12.25f, 19f)
            close()
        }
        }.build()

        return _ufo!!
    }

private var _ufo: ImageVector? = null
