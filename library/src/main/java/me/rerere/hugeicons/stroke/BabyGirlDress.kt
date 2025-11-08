package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BabyGirlDress: ImageVector
    get() {
        if (_babyGirlDress != null) {
            return _babyGirlDress!!
        }
        _babyGirlDress = ImageVector.Builder(
            name = "BabyGirlDress",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.21182f, 9f)
        lineTo(4.27882f, 16.4753f)
        curveTo(2.45802f, 19.936f, 10.0782f, 21f, 12f, 21f)
        curveTo(13.9218f, 21f, 21.542f, 19.936f, 19.7212f, 16.4753f)
        lineTo(15.7882f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.1344f, 12.2209f)
        curveTo(10.8048f, 11.8554f, 11.3899f, 12.0027f, 11.7414f, 12.2373f)
        curveTo(11.8855f, 12.3335f, 11.9576f, 12.3817f, 12f, 12.3817f)
        curveTo(12.0424f, 12.3817f, 12.1145f, 12.3335f, 12.2586f, 12.2373f)
        curveTo(12.6101f, 12.0027f, 13.1952f, 11.8554f, 13.8656f, 12.2209f)
        curveTo(14.7455f, 12.7007f, 14.9446f, 14.2833f, 12.9151f, 15.6185f)
        curveTo(12.5286f, 15.8728f, 12.3353f, 16f, 12f, 16f)
        curveTo(11.6647f, 16f, 11.4714f, 15.8728f, 11.0849f, 15.6185f)
        curveTo(9.05543f, 14.2833f, 9.25452f, 12.7007f, 10.1344f, 12.2209f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99975f, 10.8144f)
        curveTo(5.00001f, 11.7912f, 1.47372f, 8.63145f, 2.06625f, 7.87321f)
        lineTo(5.5695f, 3.39027f)
        curveTo(5.76071f, 3.14559f, 6.07218f, 3f, 6.40442f, 3f)
        horizontalLineTo(8.50685f)
        curveTo(8.75549f, 3f, 8.96414f, 3.16269f, 9.04048f, 3.37578f)
        curveTo(9.42268f, 4.44252f, 10.762f, 5.72296f, 12f, 5.72301f)
        curveTo(13.238f, 5.72305f, 14.5774f, 4.4425f, 14.9596f, 3.37578f)
        curveTo(15.0359f, 3.16269f, 15.2446f, 3f, 15.4932f, 3f)
        horizontalLineTo(17.5956f)
        curveTo(17.9279f, 3f, 18.2393f, 3.14559f, 18.4305f, 3.39027f)
        lineTo(21.9338f, 7.87321f)
        curveTo(22.5263f, 8.63145f, 19f, 11.7912f, 17.0017f, 10.8144f)
        }
        }.build()

        return _babyGirlDress!!
    }

private var _babyGirlDress: ImageVector? = null
