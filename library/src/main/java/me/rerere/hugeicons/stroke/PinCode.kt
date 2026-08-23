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

val HugeIcons.PinCode: ImageVector
    get() {
        if (_pinCode != null) {
            return _pinCode!!
        }
        _pinCode = ImageVector.Builder(
            name = "PinCode",
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
            moveTo(15f, 5f)
            horizontalLineTo(11.3137f)
            curveTo(9.67871f, 5f, 8.8612f, 5f, 8.12612f, 5.30448f)
            curveTo(7.39104f, 5.60896f, 6.81297f, 6.18702f, 5.65685f, 7.34315f)
            lineTo(2.70711f, 10.2929f)
            curveTo(2.25435f, 10.7456f, 2f, 11.3597f, 2f, 12f)
            curveTo(2f, 12.6403f, 2.25435f, 13.2544f, 2.70711f, 13.7071f)
            lineTo(5.65685f, 16.6569f)
            curveTo(6.81298f, 17.813f, 7.39104f, 18.391f, 8.12612f, 18.6955f)
            curveTo(8.8612f, 19f, 9.67871f, 19f, 11.3137f, 19f)
            horizontalLineTo(15f)
            curveTo(17.8089f, 19f, 19.2134f, 19f, 20.2223f, 18.3259f)
            curveTo(20.659f, 18.034f, 21.034f, 17.659f, 21.3259f, 17.2223f)
            curveTo(22f, 16.2134f, 22f, 14.8089f, 22f, 12f)
            curveTo(22f, 9.19108f, 22f, 7.78661f, 21.3259f, 6.77772f)
            curveTo(21.034f, 6.34096f, 20.659f, 5.96596f, 20.2223f, 5.67412f)
            curveTo(19.2134f, 5f, 17.8089f, 5f, 15f, 5f)
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
            moveTo(9.125f, 12f)
            horizontalLineTo(9f)
            moveTo(9.25f, 12f)
            curveTo(9.25f, 12.1381f, 9.13807f, 12.25f, 9f, 12.25f)
            curveTo(8.86193f, 12.25f, 8.75f, 12.1381f, 8.75f, 12f)
            curveTo(8.75f, 11.8619f, 8.86193f, 11.75f, 9f, 11.75f)
            curveTo(9.13807f, 11.75f, 9.25f, 11.8619f, 9.25f, 12f)
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
            moveTo(13.125f, 12f)
            horizontalLineTo(13f)
            moveTo(13.25f, 12f)
            curveTo(13.25f, 12.1381f, 13.1381f, 12.25f, 13f, 12.25f)
            curveTo(12.8619f, 12.25f, 12.75f, 12.1381f, 12.75f, 12f)
            curveTo(12.75f, 11.8619f, 12.8619f, 11.75f, 13f, 11.75f)
            curveTo(13.1381f, 11.75f, 13.25f, 11.8619f, 13.25f, 12f)
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
            moveTo(17.125f, 12f)
            horizontalLineTo(17f)
            moveTo(17.25f, 12f)
            curveTo(17.25f, 12.1381f, 17.1381f, 12.25f, 17f, 12.25f)
            curveTo(16.8619f, 12.25f, 16.75f, 12.1381f, 16.75f, 12f)
            curveTo(16.75f, 11.8619f, 16.8619f, 11.75f, 17f, 11.75f)
            curveTo(17.1381f, 11.75f, 17.25f, 11.8619f, 17.25f, 12f)
            close()
        }
        }.build()

        return _pinCode!!
    }

private var _pinCode: ImageVector? = null
