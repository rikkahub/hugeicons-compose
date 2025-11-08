package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsUpEllipse: ImageVector
    get() {
        if (_thumbsUpEllipse != null) {
            return _thumbsUpEllipse!!
        }
        _thumbsUpEllipse = ImageVector.Builder(
            name = "ThumbsUpEllipse",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1525f, 8.78626f)
        lineTo(12.975f, 9.34278f)
        curveTo(12.8295f, 9.79881f, 12.7567f, 10.0268f, 12.8127f, 10.2069f)
        curveTo(12.8579f, 10.3526f, 12.9573f, 10.4782f, 13.0927f, 10.5608f)
        curveTo(13.26f, 10.6629f, 13.5131f, 10.6629f, 14.0194f, 10.6629f)
        horizontalLineTo(14.2887f)
        curveTo(16.0021f, 10.6629f, 16.8588f, 10.6629f, 17.2634f, 11.1552f)
        curveTo(17.3097f, 11.2114f, 17.3508f, 11.2712f, 17.3864f, 11.334f)
        curveTo(17.6977f, 11.883f, 17.3438f, 12.6226f, 16.636f, 14.1017f)
        curveTo(15.9865f, 15.4591f, 15.6617f, 16.1378f, 15.0587f, 16.5373f)
        curveTo(15.0003f, 16.576f, 14.9403f, 16.6125f, 14.8789f, 16.6467f)
        curveTo(14.244f, 16.9999f, 13.4574f, 16.9999f, 11.8843f, 16.9999f)
        horizontalLineTo(11.5431f)
        curveTo(9.63715f, 16.9999f, 8.68419f, 16.9999f, 8.09209f, 16.443f)
        curveTo(7.5f, 15.8862f, 7.5f, 14.99f, 7.5f, 13.1977f)
        verticalLineTo(12.5677f)
        curveTo(7.5f, 11.6258f, 7.5f, 11.1548f, 7.67223f, 10.7238f)
        curveTo(7.84445f, 10.2927f, 8.17424f, 9.93827f, 8.8338f, 9.2294f)
        lineTo(11.5614f, 6.29786f)
        curveTo(11.6298f, 6.22434f, 11.664f, 6.18758f, 11.6942f, 6.1621f)
        curveTo(11.9757f, 5.92433f, 12.4102f, 5.95109f, 12.6563f, 6.22137f)
        curveTo(12.6826f, 6.25033f, 12.7115f, 6.29097f, 12.7691f, 6.37226f)
        curveTo(12.8592f, 6.49942f, 12.9043f, 6.56299f, 12.9436f, 6.62598f)
        curveTo(13.2952f, 7.18988f, 13.4016f, 7.85974f, 13.2405f, 8.49566f)
        curveTo(13.2225f, 8.56668f, 13.1992f, 8.63992f, 13.1525f, 8.78626f)
        }
        }.build()

        return _thumbsUpEllipse!!
    }

private var _thumbsUpEllipse: ImageVector? = null
