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

val HugeIcons.CupSoda: ImageVector
    get() {
        if (_cupSoda != null) {
            return _cupSoda!!
        }
        _cupSoda = ImageVector.Builder(
            name = "CupSoda",
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
            moveTo(14.117f, 6f)
            horizontalLineTo(9.88304f)
            curveTo(8.49159f, 6f, 7.79587f, 6f, 7.2721f, 6.37752f)
            curveTo(6.74832f, 6.75503f, 6.52832f, 7.41505f, 6.0883f, 8.73509f)
            lineTo(6f, 9f)
            horizontalLineTo(18f)
            lineTo(17.9117f, 8.73509f)
            curveTo(17.4717f, 7.41505f, 17.2517f, 6.75503f, 16.7279f, 6.37752f)
            curveTo(16.2041f, 6f, 15.5084f, 6f, 14.117f, 6f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.5f, 9f)
            horizontalLineTo(19.5f)
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
            moveTo(18f, 9f)
            lineTo(17.3835f, 17.0147f)
            curveTo(17.2226f, 19.1057f, 17.1422f, 20.1512f, 16.5655f, 20.8729f)
            curveTo(16.3784f, 21.107f, 16.1573f, 21.3117f, 15.9095f, 21.4803f)
            curveTo(15.1457f, 22f, 14.0972f, 22f, 12f, 22f)
            curveTo(9.90284f, 22f, 8.85426f, 22f, 8.09047f, 21.4803f)
            curveTo(7.84271f, 21.3117f, 7.62161f, 21.107f, 7.43453f, 20.8729f)
            curveTo(6.85778f, 20.1512f, 6.77736f, 19.1057f, 6.61652f, 17.0147f)
            lineTo(6f, 9f)
            horizontalLineTo(18f)
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
            moveTo(13f, 6f)
            lineTo(13.2724f, 4.91043f)
            curveTo(13.6069f, 3.5724f, 13.7742f, 2.90339f, 14.2501f, 2.49004f)
            curveTo(14.3027f, 2.44433f, 14.3577f, 2.40141f, 14.4148f, 2.36145f)
            curveTo(14.9312f, 2f, 15.6208f, 2f, 17f, 2f)
        }
        }.build()

        return _cupSoda!!
    }

private var _cupSoda: ImageVector? = null
