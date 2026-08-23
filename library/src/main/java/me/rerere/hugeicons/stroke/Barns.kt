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

val HugeIcons.Barns: ImageVector
    get() {
        if (_barns != null) {
            return _barns!!
        }
        _barns = ImageVector.Builder(
            name = "Barns",
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
            moveTo(8f, 21.5002f)
            verticalLineTo(15.5002f)
            curveTo(8f, 14.5574f, 8f, 14.086f, 8.29289f, 13.7931f)
            curveTo(8.58579f, 13.5002f, 9.05719f, 13.5002f, 10f, 13.5002f)
            horizontalLineTo(14f)
            curveTo(14.9428f, 13.5002f, 15.4142f, 13.5002f, 15.7071f, 13.7931f)
            curveTo(16f, 14.086f, 16f, 14.5574f, 16f, 15.5002f)
            verticalLineTo(21.5002f)
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
            moveTo(8.5f, 14.0001f)
            lineTo(16f, 21.5001f)
            moveTo(15.5f, 14.0001f)
            lineTo(8f, 21.5001f)
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
            moveTo(10.5f, 8.50012f)
            horizontalLineTo(13.5f)
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
            moveTo(4.38836f, 6.87631f)
            lineTo(3.34475f, 9.22443f)
            curveTo(3.17301f, 9.61085f, 3.08714f, 9.80406f, 3.04357f, 10.0094f)
            curveTo(3f, 10.2147f, 3f, 10.4261f, 3f, 10.849f)
            verticalLineTo(17.5001f)
            curveTo(3f, 19.3857f, 3f, 20.3285f, 3.58579f, 20.9143f)
            curveTo(4.17157f, 21.5001f, 5.11438f, 21.5001f, 7f, 21.5001f)
            horizontalLineTo(17f)
            curveTo(18.8856f, 21.5001f, 19.8284f, 21.5001f, 20.4142f, 20.9143f)
            curveTo(21f, 20.3285f, 21f, 19.3857f, 21f, 17.5001f)
            verticalLineTo(10.4444f)
            curveTo(21f, 9.97439f, 21f, 9.73939f, 20.9465f, 9.51275f)
            curveTo(20.893f, 9.28611f, 20.7879f, 9.07592f, 20.5777f, 8.65554f)
            lineTo(19.6275f, 6.75511f)
            curveTo(19.3168f, 6.13368f, 19.1614f, 5.82297f, 18.9168f, 5.58592f)
            curveTo(18.6723f, 5.34886f, 18.3569f, 5.20328f, 17.726f, 4.91213f)
            lineTo(12.954f, 2.70965f)
            curveTo(12.6549f, 2.57161f, 12.3294f, 2.50012f, 12f, 2.50012f)
            curveTo(11.6706f, 2.50012f, 11.3451f, 2.57161f, 11.046f, 2.70965f)
            lineTo(6.36737f, 4.86903f)
            curveTo(5.69124f, 5.18109f, 5.35317f, 5.33712f, 5.0976f, 5.59634f)
            curveTo(4.84202f, 5.85557f, 4.6908f, 6.19581f, 4.38836f, 6.87631f)
            close()
        }
        }.build()

        return _barns!!
    }

private var _barns: ImageVector? = null
