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

val HugeIcons.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = ImageVector.Builder(
            name = "Stars",
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
            moveTo(20f, 4.5f)
            lineTo(19.5f, 2f)
            lineTo(19f, 4.5f)
            lineTo(19.5f, 7f)
            lineTo(20f, 4.5f)
            close()
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
            moveTo(22f, 4.5f)
            lineTo(19.5f, 4f)
            lineTo(17f, 4.5f)
            lineTo(19.5f, 5f)
            lineTo(22f, 4.5f)
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
            moveTo(3.25f, 20.0833f)
            verticalLineTo(21.4167f)
            moveTo(4.25f, 20.75f)
            curveTo(4.25f, 21.3023f, 3.80228f, 21.75f, 3.25f, 21.75f)
            curveTo(2.69772f, 21.75f, 2.25f, 21.3023f, 2.25f, 20.75f)
            curveTo(2.25f, 20.1977f, 2.69772f, 19.75f, 3.25f, 19.75f)
            curveTo(3.80228f, 19.75f, 4.25f, 20.1977f, 4.25f, 20.75f)
            close()
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
            moveTo(12.84f, 7.64012f)
            lineTo(12.2249f, 4.97439f)
            curveTo(12.0932f, 4.40403f, 11.5854f, 4f, 11f, 4f)
            curveTo(10.4146f, 4f, 9.90676f, 4.40403f, 9.77514f, 4.97439f)
            lineTo(9.15997f, 7.64012f)
            curveTo(8.92946f, 8.63902f, 8.8142f, 9.13847f, 8.56753f, 9.54755f)
            curveTo(8.31555f, 9.96544f, 7.96544f, 10.3156f, 7.54755f, 10.5675f)
            curveTo(7.13847f, 10.8142f, 6.63902f, 10.9295f, 5.64012f, 11.16f)
            lineTo(2.97439f, 11.7751f)
            curveTo(2.40403f, 11.9068f, 2f, 12.4146f, 2f, 13f)
            curveTo(2f, 13.5854f, 2.40403f, 14.0932f, 2.97439f, 14.2249f)
            lineTo(5.64012f, 14.84f)
            curveTo(6.63902f, 15.0705f, 7.13847f, 15.1858f, 7.54755f, 15.4325f)
            curveTo(7.96544f, 15.6844f, 8.31555f, 16.0346f, 8.56753f, 16.4524f)
            curveTo(8.8142f, 16.8615f, 8.92946f, 17.361f, 9.15997f, 18.3599f)
            lineTo(9.77514f, 21.0256f)
            curveTo(9.90676f, 21.596f, 10.4146f, 22f, 11f, 22f)
            curveTo(11.5854f, 22f, 12.0932f, 21.596f, 12.2249f, 21.0256f)
            lineTo(12.84f, 18.3599f)
            curveTo(13.0705f, 17.361f, 13.1858f, 16.8615f, 13.4325f, 16.4524f)
            curveTo(13.6844f, 16.0346f, 14.0346f, 15.6844f, 14.4524f, 15.4325f)
            curveTo(14.8615f, 15.1858f, 15.361f, 15.0705f, 16.3599f, 14.84f)
            lineTo(19.0256f, 14.2249f)
            curveTo(19.596f, 14.0932f, 20f, 13.5854f, 20f, 13f)
            curveTo(20f, 12.4146f, 19.596f, 11.9068f, 19.0256f, 11.7751f)
            lineTo(16.3599f, 11.16f)
            curveTo(15.361f, 10.9295f, 14.8615f, 10.8142f, 14.4524f, 10.5675f)
            curveTo(14.0346f, 10.3156f, 13.6844f, 9.96544f, 13.4325f, 9.54755f)
            curveTo(13.1858f, 9.13847f, 13.0705f, 8.63902f, 12.84f, 7.64012f)
            close()
        }
        }.build()

        return _stars!!
    }

private var _stars: ImageVector? = null
