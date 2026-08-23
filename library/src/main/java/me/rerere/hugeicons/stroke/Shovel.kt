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

val HugeIcons.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = ImageVector.Builder(
            name = "Shovel",
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
            moveTo(16.5f, 4.70711f)
            verticalLineTo(7.5f)
            lineTo(19.2928f, 7.50043f)
            curveTo(19.7456f, 7.5005f, 20.1799f, 7.32065f, 20.5001f, 7.00046f)
            lineTo(21.1463f, 6.35424f)
            curveTo(21.3728f, 6.12777f, 21.5f, 5.82061f, 21.5f, 5.50033f)
            curveTo(21.5f, 5.17998f, 21.3728f, 4.87276f, 21.1462f, 4.64627f)
            lineTo(19.3525f, 2.85316f)
            curveTo(19.1263f, 2.62703f, 18.8195f, 2.5f, 18.4997f, 2.5f)
            curveTo(18.1797f, 2.5f, 17.8729f, 2.62709f, 17.6467f, 2.8533f)
            lineTo(17f, 3.5f)
            curveTo(16.6799f, 3.82014f, 16.5f, 4.25435f, 16.5f, 4.70711f)
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
            moveTo(16.5f, 7.5f)
            lineTo(8.50005f, 15.5f)
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
            moveTo(5.63517f, 21.5002f)
            horizontalLineTo(5.45182f)
            curveTo(4.05997f, 21.5002f, 3.36405f, 21.5002f, 2.93174f, 21.0679f)
            curveTo(2.49943f, 20.6355f, 2.49962f, 19.9396f, 2.49999f, 18.5478f)
            lineTo(2.50004f, 18.3654f)
            curveTo(2.50004f, 16.2778f, 3.32936f, 14.2758f, 4.80556f, 12.7997f)
            curveTo(5.95398f, 11.651f, 6.52819f, 11.0766f, 7.23229f, 11.0092f)
            curveTo(7.35699f, 10.9973f, 7.48254f, 10.9973f, 7.60724f, 11.0092f)
            curveTo(8.31135f, 11.0765f, 8.88563f, 11.6508f, 10.0342f, 12.7994f)
            lineTo(11.2005f, 13.9658f)
            curveTo(12.3496f, 15.115f, 12.9241f, 15.6895f, 12.9911f, 16.3941f)
            curveTo(13.0029f, 16.5178f, 13.0029f, 16.6424f, 12.9912f, 16.7661f)
            curveTo(12.9244f, 17.4707f, 12.35f, 18.0454f, 11.2012f, 19.1949f)
            curveTo(9.72499f, 20.671f, 7.72283f, 21.5002f, 5.63517f, 21.5002f)
            close()
        }
        }.build()

        return _shovel!!
    }

private var _shovel: ImageVector? = null
