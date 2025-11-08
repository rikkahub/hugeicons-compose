package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Expander: ImageVector
    get() {
        if (_expander != null) {
            return _expander!!
        }
        _expander = ImageVector.Builder(
            name = "Expander",
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
        moveTo(11.3389f, 16.4973f)
        curveTo(11.596f, 16.2812f, 11.8903f, 16.1118f, 12.2031f, 16.0076f)
        curveTo(14.2269f, 15.3726f, 13.1038f, 13.8545f, 14.9394f, 13.2557f)
        curveTo(16.356f, 12.7936f, 15.9215f, 12.014f, 16.4732f, 11.3559f)
        moveTo(10.0554f, 13.9266f)
        curveTo(10.2532f, 13.7697f, 10.4896f, 13.6582f, 10.7503f, 13.6063f)
        curveTo(11.824f, 13.4014f, 11.661f, 11.7599f, 12.8011f, 11.5409f)
        curveTo(13.5856f, 11.382f, 13.498f, 10.5868f, 13.906f, 10.0706f)
        moveTo(7.48828f, 12.6413f)
        curveTo(7.59299f, 12.2154f, 8.03959f, 12.2558f, 8.35242f, 12.1517f)
        curveTo(10.2961f, 11.4363f, 9.17295f, 9.74932f, 11.0887f, 9.3997f)
        curveTo(12.5423f, 9.18699f, 11.9807f, 8.06233f, 12.6225f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.3338f)
        lineTo(8.65831f, 22.0013f)
        moveTo(2.83725f, 15.7945f)
        lineTo(3.51561f, 15.1582f)
        curveTo(3.92995f, 14.7695f, 4.36858f, 14.3251f, 4.93488f, 14.2845f)
        curveTo(5.45677f, 14.2472f, 6.16403f, 14.5257f, 8.10626f, 15.2098f)
        curveTo(8.7508f, 15.4368f, 9.54862f, 17.4663f, 9.66809f, 18.8082f)
        curveTo(9.72573f, 19.4555f, 9.33783f, 20.0078f, 8.88748f, 20.4764f)
        lineTo(8.34274f, 21.0432f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3421f, 2.00521f)
        lineTo(21.9674f, 8.70562f)
        moveTo(15.798f, 2.84589f)
        lineTo(15.1592f, 3.52202f)
        curveTo(14.7691f, 3.935f, 14.3231f, 4.37204f, 14.2798f, 4.93891f)
        curveTo(14.2399f, 5.46132f, 14.5146f, 6.17093f, 15.1881f, 8.11921f)
        curveTo(15.4115f, 8.76541f, 17.4322f, 9.57386f, 18.7716f, 9.70078f)
        curveTo(19.4192f, 9.76214f, 19.9736f, 9.37599f, 20.4442f, 8.92694f)
        lineTo(21.0122f, 8.38487f)
        }
        }.build()

        return _expander!!
    }

private var _expander: ImageVector? = null
